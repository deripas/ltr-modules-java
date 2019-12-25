package ru.lcard.ltr.lrt27;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;
import ru.lcard.ltr.ltrapi.TLTR_DESCRIPTION_CPU;
import ru.lcard.ltr.ltrapi.TLTR_DESCRIPTION_MEZZANINE;
import ru.lcard.ltr.ltrapi.TLTR_DESCRIPTION_MODULE;

import static ru.lcard.ltr.lrt27.Ltr27Api.LTR27_MEZZANINE_NUMBER;

@ToString
public class TINFO_LTR27 extends StructPack4 {
    public TLTR_DESCRIPTION_MODULE Module = inner(new TLTR_DESCRIPTION_MODULE());
    public TLTR_DESCRIPTION_CPU Cpu = inner(new TLTR_DESCRIPTION_CPU());
    public TLTR_DESCRIPTION_MEZZANINE[] Mezzanine = array(new TLTR_DESCRIPTION_MEZZANINE[LTR27_MEZZANINE_NUMBER]);
}
