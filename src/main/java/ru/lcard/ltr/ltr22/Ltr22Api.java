package ru.lcard.ltr.ltr22;

import jnr.ffi.LibraryLoader;
import jnr.ffi.Pointer;
import jnr.ffi.annotations.Out;
import jnr.ffi.byref.ByteByReference;
import jnr.ffi.byref.DoubleByReference;
import jnr.ffi.byref.IntByReference;
import jnr.ffi.types.u_int8_t;

import java.nio.DoubleBuffer;
import java.util.EnumSet;

public interface Ltr22Api {

    Ltr22Api INSTANCE = LibraryLoader.create(Ltr22Api.class).load("ltr22api");

    int COMMENT_LENGTH = 256;
    int LTR22_CHANNEL_CNT = 4;
    int LTR22_RANGE_CNT = 6;
    int LTR22_ADC_FREQ_CNT = 25;
    int[] LTR22_DISK_FREQ_ARRAY = new int[]{
            3472, 3720, 4006, 4340, 4734,
            5208, 5580, 5787, 6009, 6510,
            7102, 7440, 7812, 8680, 9765,
            10416, 11160, 13020, 15625, 17361,
            19531, 26041, 39062, 52083, 78125
    };

    int LTR22_Init(TLTR22 module);

    int LTR22_Close(TLTR22 module);

    int LTR22_Open(TLTR22 hnd, int saddr, int sport, String csn, int slot_num);

    int LTR22_IsOpened(TLTR22 module);

    int LTR22_GetConfig(TLTR22 module);

    int LTR22_SetConfig(TLTR22 module);

    int LTR22_ClearBuffer(TLTR22 module, boolean wait_response);

    int LTR22_StartADC(TLTR22 module, boolean WaitSync);

    int LTR22_StopADC(TLTR22 module);

    int LTR22_SetSyncPriority(TLTR22 module, boolean SyncMaster);

    int LTR22_SyncPhaze(TLTR22 module, int timeout);

    int LTR22_SwitchMeasureADCZero(TLTR22 module, boolean SetMeasure);

    int LTR22_SetFreq(TLTR22 module, boolean adc384, @u_int8_t int Freq_dv);

    int LTR22_SwitchACDCState(TLTR22 module, boolean ACDCState);

    int LTR22_SetADCRange(TLTR22 module, byte ADCChannel, byte ADCChannelRange);

    int LTR22_SetADCChannel(TLTR22 module, @u_int8_t int ADCChannel, boolean EnableADC);

    int LTR22_GetCalibrCoeffs(TLTR22 module);

    int LTR22_Recv(TLTR22 module, @Out int[] data, @Out int[] tstamp, int size, int timeout);

    int LTR22_GetModuleDescription(TLTR22 module);

    int LTR22_ProcessData(TLTR22 module, int[] src_data, @Out double[] dst_data, int size, boolean calibrMainPset, boolean calibrExtraVolts, byte[] OverflowFlags);

    int LTR22_ProcessDataEx(TLTR22 module, int[] src_data, DoubleBuffer dst_data, @Out IntByReference size, EnumSet<LTR22_PROC_FLAGS> flags, byte[] OverflowFlags, Pointer reserved);

    int LTR22_ReadAVREEPROM(TLTR22 module, byte[] Data, int BeginAddress, int size);

    int LTR22_WriteAVREEPROM(TLTR22 module, byte[] Data, int BeginAddress, int size);

    int LTR22_TestHardwareInterface(TLTR22 module);

    int LTR22_ReopenModule(TLTR22 module);

    int LTR22_FindAdcFreqParams(double AdcFreq, @Out ByteByReference divider, @Out ByteByReference adc384, @Out IntByReference adcFreqIndex, @Out DoubleByReference resultAdcFreq);

    double LTR22_CalcAdcFreq(byte divider, boolean adc384);

    String LTR22_GetErrorString(int err);
}
