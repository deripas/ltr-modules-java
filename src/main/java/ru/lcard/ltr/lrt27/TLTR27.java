package ru.lcard.ltr.lrt27;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;
import ru.lcard.ltr.ltrapi.TLTR;

import static ru.lcard.ltr.lrt27.Ltr27Api.LTR27_MEZZANINE_NUMBER;

@ToString
public class TLTR27 extends StructPack4 {
    /* служебная информация */
    public DWORD Size = new DWORD();
    public TLTR Channel = inner(new TLTR());
    public BYTE Subchannel = new BYTE();
    /* настройки модуля */
    public BYTE FrequencyDivisor = new BYTE();    /* делитель частоты дискретизации 0..255 (1000..4 Гц) */
    public TMezzanine[] Mezzanine = array(new TMezzanine[LTR27_MEZZANINE_NUMBER]); /* установленные мезонины */
    public TINFO_LTR27 ModuleInfo = inner(new TINFO_LTR27());
}
