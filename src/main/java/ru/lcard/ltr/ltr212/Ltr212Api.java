package ru.lcard.ltr.ltr212;

import jnr.ffi.LibraryLoader;
import jnr.ffi.annotations.Out;
import jnr.ffi.byref.ByteByReference;
import jnr.ffi.byref.DoubleByReference;
import jnr.ffi.byref.IntByReference;

public interface Ltr212Api {

    Ltr212Api INSTANCE = LibraryLoader.create(Ltr212Api.class).load("ltr212api");

    int LTR212_LCH_CNT_MAX = 8;  // Макс. число логических. каналов
    int LTR212_FIR_ORDER_MAX = 255; // Максимальное значение порядка КИХ-фильтра
    int LTR212_FIR_ORDER_MIN = 3;   // Минимальное значение порядка КИХ-фильтра
    int LTR212_IIR_ORDER = 5; // необходимое значение порядка для БИХ-фильтра

    void LTR212_GetDllVersion(LTR212_DLL_VERSION DllVersion);

    int LTR212_Init(TLTR212 module);

    int LTR212_Open(TLTR212 module, int net_addr, int net_port, String crate_sn, int slot_num, String biosname);

    int LTR212_IsOpened(TLTR212 module);

    int LTR212_Close(TLTR212 module);

    int LTR212_CreateLChannel(int PhysChannel, LTR212_SCALE Scale);

    int LTR212_CreateLChannel2(int PhysChannel, LTR212_SCALE Scale, LTR212_BRIDGE_TYPES BridgeType);

    int LTR212_SetADC(TLTR212 module);

    int LTR212_Start(TLTR212 module);

    int LTR212_Stop(TLTR212 module);

    int LTR212_Recv(TLTR212 module, int[] data, int[] tmark, int size, int timeout);

    int LTR212_ProcessData(TLTR212 module, int[] src, double[] dest, IntByReference size, boolean volt);

    int LTR212_Calibrate(TLTR212 module, @Out ByteByReference LChannel_Mask, LTR212_CALIBR_MODE mode, int reset);

    int LTR212_CalcFS(TLTR212 module, @Out DoubleByReference fsBase, @Out DoubleByReference fs);

    int LTR212_TestEEPROM(TLTR212 module);

    int LTR212_ReadFilter(String fname, @Out TLTR212_FILTER filter);

    int LTR212_CalcTimeOut(TLTR212 module, int n);

    // функции вспомагательного характера
    String LTR212_GetErrorString(int err);
}
