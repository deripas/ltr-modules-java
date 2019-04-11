package ru.lcard.ltr;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import ru.lcard.ltr.ltrapi.LtrApi;
import ru.lcard.ltr.ltrapi.SN;
import ru.lcard.ltr.ltrapi.TLTR;

public class Example {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime(LtrApi.INSTANCE);
        TLTR ltr = new TLTR();
        int ltrerror = LtrApi.INSTANCE.LTR_Init(ltr);
        System.out.println(LtrApi.INSTANCE.LTR_GetErrorString(ltrerror));
        ltrerror = LtrApi.INSTANCE.LTR_Open(ltr);
        SN.Array array = new SN.Array();
        int size = Struct.size(array);
//        String s = LtrApi.INSTANCE.LTR_GetErrorString(ltrerror);
        int e1 = LtrApi.INSTANCE.LTR_GetCrates(ltr, array);
    }
}
