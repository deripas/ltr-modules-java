package ru.lcard.ltr.lrt27;

import jnr.ffi.LibraryLoader;
import jnr.ffi.Pointer;
import jnr.ffi.annotations.Out;
import jnr.ffi.byref.ByteByReference;
import jnr.ffi.byref.DoubleByReference;
import jnr.ffi.byref.IntByReference;
import ru.lcard.ltr.ltrapi.TLTR_CARD_START_MODE;

public interface Ltr27Api {

    Ltr27Api INSTANCE = LibraryLoader.create(Ltr27Api.class).load("ltr27api");

    /* Количество мезанинов в модуле */
    int LTR27_MEZZANINE_NUMBER = 8;
    /* Количество каналов в мезонине */
    int LTR27_MAZZANINE_CHANNELS_CNT = 2;
    /* Общее кол-во каналов в модуле */
    int LTR27_CHANNELS_COUNT = LTR27_MAZZANINE_CHANNELS_CNT * LTR27_MEZZANINE_NUMBER;
    /* Количество калибровочных коэффициентов на канал */
    int LTR27_CHANNEL_CBR_COEF_CNT = 2;
    /* Общее кол-во калибровочных коэффициентов в модуле */
    int LTR27_MAZZANINE_CBR_COEF_CNT = LTR27_MAZZANINE_CHANNELS_CNT * LTR27_CHANNEL_CBR_COEF_CNT;
    /* Количество коэффициентов перевода в величину в мезанине =одна пара на оба канала; */
    int LTR27_MEZZANINE_CONV_COEF_CNT = LTR27_CHANNEL_CBR_COEF_CNT;

    int LTR27_DATA_CORRECTION = 1 << 0;
    int LTR27_DATA_VALUE = 1 << 1;
    /* макросы для функций */
    int LTR27_MODULE_DESCRIPTION = 1 << 0;
    int LTR27_MEZZANINE1_DESCRIPTION = 1 << 1;
    int LTR27_MEZZANINE2_DESCRIPTION = 1 << 2;
    int LTR27_MEZZANINE3_DESCRIPTION = 1 << 3;
    int LTR27_MEZZANINE4_DESCRIPTION = 1 << 4;
    int LTR27_MEZZANINE5_DESCRIPTION = 1 << 5;
    int LTR27_MEZZANINE6_DESCRIPTION = 1 << 6;
    int LTR27_MEZZANINE7_DESCRIPTION = 1 << 7;
    int LTR27_MEZZANINE8_DESCRIPTION = 1 << 8;
    int LTR27_ALL_MEZZANINE_DESCRIPTION = LTR27_MEZZANINE1_DESCRIPTION | LTR27_MEZZANINE2_DESCRIPTION |
            LTR27_MEZZANINE3_DESCRIPTION | LTR27_MEZZANINE4_DESCRIPTION | LTR27_MEZZANINE5_DESCRIPTION |
            LTR27_MEZZANINE6_DESCRIPTION | LTR27_MEZZANINE7_DESCRIPTION | LTR27_MEZZANINE8_DESCRIPTION;
    int LTR27_ALL_DESCRIPTION = LTR27_MODULE_DESCRIPTION | LTR27_ALL_MEZZANINE_DESCRIPTION;

    int LTR27_Init(TLTR27 h_ltr27);

    int LTR27_Open(TLTR27 h_ltr27, int net_addr, int net_port, String crate_sn, int slot);

    int LTR27_OpenEx(TLTR27 h_ltr27, int net_addr, int net_port, String crate_sn, int slot, int in_flags, @Out IntByReference out_flags);

    int LTR27_IsOpened(TLTR27 h_ltr27);

    int LTR27_Close(TLTR27 h_ltr27);

    int LTR27_GetConfig(TLTR27 h_ltr27);

    int LTR27_GetDescription(TLTR27 h_ltr27, int flags);

    int LTR27_SetConfig(TLTR27 h_ltr27);

    int LTR27_StoreConfig(TLTR27 h_ltr27, TLTR_CARD_START_MODE start_mode);

    int LTR27_ADCStart(TLTR27 h_ltr27);

    int LTR27_ADCStop(TLTR27 h_ltr27);

    int LTR27_Recv(TLTR27 h_ltr27, int[] data, int tstamp, int size, int timeout);

    int LTR27_ProcessData(TLTR27 h_ltr27, int[] src_data, double[] dst_data, IntByReference size, boolean calibr, boolean value);

    int LTR27_ProcessDataEx(TLTR27 h_ltr27, int[] src_data, double[] dst_data, IntByReference size, int flags, int ch_mask, Pointer reserved);

    int LTR27_SearchFirstFrame(TLTR27 h_ltr27, int[] data, int size, IntByReference frame_idx);

    int LTR27_Echo(TLTR27 h_ltr27);

    int LTR27_WriteMezzanineDescr(TLTR27 h_ltr27, byte mn);

    String LTR27_GetErrorString(int error);

    /**
     * Подбор значений делителя и пределителя АЦП
     * <p>
     * Функция по заданному значению частоты АЦП подбирает значение делителя,
     * чтобы результирующая частота была наиболее близка.
     *
     * @param adcFreq       Требуемая частота в Гц.
     * @param divisor       Значение пределителя, соответствующее данной частоте
     * @param resultAdcFreq Полученное реальное значение частоты АЦП (в Гц)
     * @return Код ошибки
     */
    int LTR27_FindAdcFreqParams(double adcFreq, @Out ByteByReference divisor, @Out DoubleByReference resultAdcFreq);
}
