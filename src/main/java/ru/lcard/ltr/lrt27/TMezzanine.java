package ru.lcard.ltr.lrt27;

import jnr.ffi.Runtime;
import lombok.ToString;
import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.lrt27.Ltr27Api.LTR27_MAZZANINE_CBR_COEF_CNT;
import static ru.lcard.ltr.lrt27.Ltr27Api.LTR27_MEZZANINE_CONV_COEF_CNT;

@ToString
public class TMezzanine extends StructPack4 {
    public AsciiString Name = new AsciiString(16); /* название субмодуля */
    public AsciiString Unit = new AsciiString(16); /* измеряемая субмодулем физ. величина */
    public Double[] ConvCoeff = array(new Double[LTR27_MEZZANINE_CONV_COEF_CNT]);   /* масштаб и смещение для пересчета кода в физ. величину */
    public Double[] CalibrCoeff = array(new Double[LTR27_MAZZANINE_CBR_COEF_CNT]);  /* калибровочные коэффициенты */

    public TMezzanine(Runtime runtime) {
        super(runtime);
    }
}
