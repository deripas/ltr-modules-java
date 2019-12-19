package ru.lcard.ltr.ltr22;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;
import ru.lcard.ltr.ltrapi.TLTR;

import static ru.lcard.ltr.ltr22.Ltr22Api.LTR22_ADC_FREQ_CNT;
import static ru.lcard.ltr.ltr22.Ltr22Api.LTR22_CHANNEL_CNT;

@ToString
public class TLTR22 extends StructPack4 {
    public DWORD Size = new DWORD();
    public TLTR Channel = inner(new TLTR());

    // настройки модуля
    public BYTE Fdiv_rg = new BYTE();                           // дивайзер частоты клоков 1..15
    public Boolean Adc384 = new Boolean();                      // дополнительный дивайзер частоты сэмплов true =3 false =2
    public Boolean AC_DC_State = new Boolean();                 // состояние true =AC+DC false=AC
    public Boolean MeasureADCZero = new Boolean();              // измерение Zero true - включено false - выключено
    public Boolean DataReadingProcessed = new Boolean();        // состояние считывания АЦП true-АЦП считывается false - нет
    public AdcRange[] ADCChannelRange = array(new AdcRange[LTR22_CHANNEL_CNT]); // предел имзерений АЦП по каналам 0 - 1В 1 - 0.3В 2 - 0.1В 3 - 0.03В 4 - 10В 5 - 3В
    public Unsigned8[] ChannelEnabled = array(new Unsigned8[LTR22_CHANNEL_CNT]);   // Состояние каналов, включен - true выключен - false
    public DWORD FreqDiscretizationIndex = new DWORD();
    public BYTE SyncType = new BYTE();
    // Тип синхронизации 0 - внутренний старт по сигналу Go
    //    1 - фазировка модуля
    //    2 - внешний старт
    //    3 - резервировано

    public Boolean SyncMaster = new Boolean();        // true - модуль генерит сигнал, false - модуль принимает синхросигнал
    public TINFO_LTR22 ModuleInfo = inner(new TINFO_LTR22());
    public ADC_CHANNEL_CALIBRATION[] ADCCalibration = array(new ADC_CHANNEL_CALIBRATION[LTR22_CHANNEL_CNT * LTR22_ADC_FREQ_CNT]);


    public AdcRange channelRange(int ch) {
        return ADCChannelRange[ch];
    }

    public void fillChannelRange(int ch, AdcRange range) {
        ADCChannelRange[ch] = range;
    }

    public boolean channelEnabled(int ch) {
        return ChannelEnabled[ch].get() != 0;
    }

    public void fillChannelEnabled(int ch, boolean en) {
        ChannelEnabled[ch].set((byte) (en ? 1 : 0));
    }

    private int calib_struct_index(int ch, int freqIndex) {
        return ch * LTR22_ADC_FREQ_CNT + freqIndex;
    }

    private int calibr_val_index(AdcRange range) {
        return range.value.intValue();
    }

    public void fillUserCalibOffset(int ch, int freqIndex, AdcRange range, float value) {
        ADCCalibration[calib_struct_index(ch, freqIndex)].UserCalibOffset[calibr_val_index(range)].set(value);
    }

    public void fillUserCalibScale(int ch, int freqIndex, AdcRange range, float value) {
        ADCCalibration[calib_struct_index(ch, freqIndex)].UserCalibScale[calibr_val_index(range)].set(value);
    }

    public float UserCalibOffset(int ch, int freqIndex, AdcRange range) {
        return ADCCalibration[calib_struct_index(ch, freqIndex)].UserCalibOffset[calibr_val_index(range)].get();
    }

    public float UserCalibScale(int ch, int freqIndex, AdcRange range) {
        return ADCCalibration[calib_struct_index(ch, freqIndex)].UserCalibScale[calibr_val_index(range)].get();
    }

    public float FactoryCalibOffset(int ch, int freqIndex, AdcRange range) {
        return ADCCalibration[calib_struct_index(ch, freqIndex)].FactoryCalibOffset[calibr_val_index(range)].get();
    }

    public float FactoryCalibScale(int ch, int freqIndex, AdcRange range) {
        return ADCCalibration[calib_struct_index(ch, freqIndex)].FactoryCalibScale[calibr_val_index(range)].get();
    }
}
