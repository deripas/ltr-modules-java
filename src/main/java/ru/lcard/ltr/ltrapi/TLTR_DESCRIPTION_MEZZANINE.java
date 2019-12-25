package ru.lcard.ltr.ltrapi;

import jnr.ffi.Runtime;
import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr22.Ltr22Api.COMMENT_LENGTH;

public class TLTR_DESCRIPTION_MEZZANINE extends StructPack4 {
    public Boolean Active = new Boolean();                        /* флаг достоверности остальных полей структуры  */
    public AsciiString Name = new AsciiString(16);           /* название изделия */
    public AsciiString SerialNumber = new AsciiString(16);   /* серийный номер изделия */
    public BYTE Revision = new BYTE();                            /* ревизия изделия */
    public Double[] Calibration = array(new Double[4]);           /* корректировочные коэффициенты */
    public AsciiString Comment = new AsciiString(COMMENT_LENGTH); /* комментарий */

    public TLTR_DESCRIPTION_MEZZANINE(Runtime runtime) {
        super(runtime);
    }
}
