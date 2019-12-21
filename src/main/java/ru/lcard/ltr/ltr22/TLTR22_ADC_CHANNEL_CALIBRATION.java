package ru.lcard.ltr.ltr22;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

import static ru.lcard.ltr.ltr22.Ltr22Api.LTR22_RANGE_CNT;

public class TLTR22_ADC_CHANNEL_CALIBRATION extends Struct {
    public Float[] FactoryCalibOffset = array(new Float[LTR22_RANGE_CNT]);
    public Float[] FactoryCalibScale = array(new Float[LTR22_RANGE_CNT]);
    public Float[] UserCalibOffset = array(new Float[LTR22_RANGE_CNT]);
    public Float[] UserCalibScale = array(new Float[LTR22_RANGE_CNT]);

    public TLTR22_ADC_CHANNEL_CALIBRATION(Runtime runtime) {
        super(runtime, new Alignment(4));
    }
}
