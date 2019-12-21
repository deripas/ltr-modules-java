package ru.lcard.ltr.ltr212;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr212.Ltr212Api.LTR212_FIR_ORDER_MAX;

@ToString
public class TLTR212_FILTER extends StructPack4 {
    public Double fs = new Double();
    public BYTE decimation = new BYTE();
    public BYTE taps = new BYTE();
    public Signed16[] koeff = array(new Signed16[LTR212_FIR_ORDER_MAX]);
}
