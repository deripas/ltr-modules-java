package ru.lcard.ltr.example;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.provider.FFIProvider;
import ru.lcard.ltr.ltr22.Ltr22Api;
import ru.lcard.ltr.ltr22.TLTR22;
import ru.lcard.ltr.ltrapi.LtrApi;
import ru.lcard.ltr.ltrapi.TLTR;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;

public class Example22 {

    public static void main(String[] args) {
//        Runtime r = Runtime.getRuntime(LtrApi.INSTANCE);
//        TLTR ltr = new TLTR();
//        int ltrerror = LtrApi.INSTANCE.LTR_Init(ltr);
//        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(ltrerror));
//        ltrerror = LtrApi.INSTANCE.LTR_Open(ltr);
//        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(ltrerror));
//        SN.Array array = new SN.Array();
//        int size = Struct.size(array);
////        String s = LtrApi.INSTANCE.LTR_GetErrorString(ltrerror);
//        int e1 = LtrApi.INSTANCE.LTR_GetCrates(ltr, array);

        int error;
        Runtime runtime = FFIProvider.getSystemProvider().getRuntime();

//        TLTR ltr = new TLTR();
//        error = LtrApi.INSTANCE.LTR_Init(ltr);
//        System.out.println(Ltr22Api.INSTANCE.LTR22_GetErrorString(error));

        TLTR22 tltr22 = new TLTR22();
        int size = Struct.size(tltr22);
        error = Ltr22Api.INSTANCE.LTR22_Init(tltr22);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        TLTR tltr = tltr22.Channel;
        error = Ltr22Api.INSTANCE.LTR22_Open(tltr22, tltr.saddr.intValue(), tltr.sport.get(), tltr.csn.get(), 1);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        error = Ltr22Api.INSTANCE.LTR22_SetFreq(tltr22, false, 1);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        error = Ltr22Api.INSTANCE.LTR22_SetADCChannel(tltr22, 0, true);
        error = Ltr22Api.INSTANCE.LTR22_SetADCChannel(tltr22, 1, true);
        error = Ltr22Api.INSTANCE.LTR22_SetADCChannel(tltr22, 2, true);
        error = Ltr22Api.INSTANCE.LTR22_SetADCChannel(tltr22, 3, true);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        // считываем значения из модуля, и смотрим, что все считалось правильно
        error = Ltr22Api.INSTANCE.LTR22_GetConfig(tltr22);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        error = Ltr22Api.INSTANCE.LTR22_GetModuleDescription(tltr22);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        error = Ltr22Api.INSTANCE.LTR22_GetCalibrCoeffs(tltr22);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        // тестирование старта - стопа обработки данных
        error = TestADCStartStop(tltr22);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        // получаем информацию о модуле
        error = Ltr22Api.INSTANCE.LTR22_GetModuleDescription(tltr22);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        // получаем калибровки модуля
        error = Ltr22Api.INSTANCE.LTR22_GetCalibrCoeffs(tltr22);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));

        error = Ltr22Api.INSTANCE.LTR22_Close(tltr22);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(error));
    }


    static int TestADCStartStop(TLTR22 module) {
//        IntBuffer rbuf = IntBuffer.allocate(100);
        int[] tstamp = new int[100];
        int[] rbuf = new int[100];
//        DoubleBuffer rbuf2 = DoubleBuffer.allocate(100);
        double[] rbuf2 = new double[100];
        double[] o = new double[100];
        int res = 0;

        if ((res = Ltr22Api.INSTANCE.LTR22_StartADC(module, false)) == 0) // старт сбора данных
        {
            if (Ltr22Api.INSTANCE.LTR22_Recv(module, rbuf, tstamp, 100, 500) == 100) // получение данных
            {
                if ((res = Ltr22Api.INSTANCE.LTR22_StopADC(module)) == 0) // выключение сбора данных
                {
                    if ((res = Ltr22Api.INSTANCE.LTR22_ClearBuffer(module, true)) == 0) // очистка буфферов
                    {
                        if ((res = Ltr22Api.INSTANCE.LTR22_ProcessData(module, rbuf, rbuf2, 100, true, true, null)) == 0)// преобразование данных в обычный формат
                        {
rbuf2.toString();
                        }
                    }
                }
            }
        }
        return res;
    }
}
