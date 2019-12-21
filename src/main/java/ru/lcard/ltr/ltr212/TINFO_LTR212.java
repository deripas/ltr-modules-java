package ru.lcard.ltr.ltr212;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;

@ToString
public class TINFO_LTR212 extends StructPack4 {
    public AsciiString Name = new AsciiString(15); // название используемого модуля
    public Enum8<LTR212_MODULE_TYPES> Type = new Enum8<>(LTR212_MODULE_TYPES.class); // тип используемого модуля: LTR212 (LTR212M-3), LTR212M-1 или LTR212M-2
    public AsciiString Serial = new AsciiString(24); // серийный номер используемого модуля
    public AsciiString BiosVersion = new AsciiString(8); // Версия БИОСа
    public AsciiString BiosDate = new AsciiString(16); // Дата создания данной версии БИОСа
}
