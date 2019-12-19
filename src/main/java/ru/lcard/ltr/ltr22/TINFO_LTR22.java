package ru.lcard.ltr.ltr22;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;

@ToString
public class TINFO_LTR22 extends StructPack4 {

    public TDESCRIPTION_MODULE Description = inner(new TDESCRIPTION_MODULE());    // описание модуля
    public TDESCRIPTION_CPU CPU = inner(new TDESCRIPTION_CPU());                  // описание AVR
}
