package ru.lcard.ltr.example;

import jnr.ffi.byref.DoubleByReference;
import jnr.ffi.byref.IntByReference;
import ru.lcard.ltr.ltr212.LTR212_REF_VAL;
import ru.lcard.ltr.ltr212.LTR212_SCALE;
import ru.lcard.ltr.ltr212.Ltr212Api;
import ru.lcard.ltr.ltr212.TLTR212;
import ru.lcard.ltr.ltrapi.TLTR;

import static ru.lcard.ltr.ltr212.LTR212_ACQ_MODE.LTR212_FOUR_CHANNELS_WITH_MEDIUM_RESOLUTION;

public class Example212 {

    public static void main(String[] args) {
        TLTR212 tltr212 = new TLTR212();

        int error;
        error = Ltr212Api.INSTANCE.LTR212_Init(tltr212);
        System.out.println(Ltr212Api.INSTANCE.LTR212_GetErrorString(error));

        TLTR tltr = tltr212.Channel;
        error = Ltr212Api.INSTANCE.LTR212_Open(tltr212, tltr.saddr.intValue(), tltr.sport.get(), tltr.csn.get(), 1, "ltr212.bio");
        System.out.println(Ltr212Api.INSTANCE.LTR212_GetErrorString(error));

        tltr212.AcqMode.set(LTR212_FOUR_CHANNELS_WITH_MEDIUM_RESOLUTION);
        tltr212.UseClb.set(false);
        tltr212.UseFabricClb.set(false);
        tltr212.AC.set(false);
        tltr212.REF.set(LTR212_REF_VAL.LTR212_REF_5V);
        tltr212.filter.IIR.set(false);
        tltr212.filter.FIR.set(false);
        tltr212.LChQnt.set(4);
        for (int i = 0; i < 4; i++) {
            tltr212.LChTbl[i].set(Ltr212Api.INSTANCE.LTR212_CreateLChannel(i + 1, LTR212_SCALE.LTR212_SCALE_B_80));
        }

        error = Ltr212Api.INSTANCE.LTR212_SetADC(tltr212);
        System.out.println(Ltr212Api.INSTANCE.LTR212_GetErrorString(error));

        int n = 256;
        int[] rbuf = new int[2 * 4 * n];
        double[] result = new double[4 * n];
        int timeout = Ltr212Api.INSTANCE.LTR212_CalcTimeOut(tltr212, n);

        DoubleByReference fsBase = new DoubleByReference();
        DoubleByReference fs = new DoubleByReference();
        error = Ltr212Api.INSTANCE.LTR212_CalcFS(tltr212, fsBase, fs);
        System.out.println(Ltr212Api.INSTANCE.LTR212_GetErrorString(error));

        error = Ltr212Api.INSTANCE.LTR212_Start(tltr212);
        System.out.println(Ltr212Api.INSTANCE.LTR212_GetErrorString(error));

        error = Ltr212Api.INSTANCE.LTR212_Recv(tltr212, rbuf, null, rbuf.length, timeout);
        System.out.println(error);

        IntByReference size = new IntByReference(rbuf.length);
        error = Ltr212Api.INSTANCE.LTR212_ProcessData(tltr212, rbuf, result, size, true);
        System.out.println(Ltr212Api.INSTANCE.LTR212_GetErrorString(error));

        error = Ltr212Api.INSTANCE.LTR212_Stop(tltr212);
        System.out.println(Ltr212Api.INSTANCE.LTR212_GetErrorString(error));

        error = Ltr212Api.INSTANCE.LTR212_Close(tltr212);
        System.out.println(Ltr212Api.INSTANCE.LTR212_GetErrorString(error));

        for (int i = 0; i < result.length; i++) {
            System.out.println(Math.round(result[i] * 100.0) / 100.0);
        }
    }
}
