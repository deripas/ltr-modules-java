package ru.lcard.ltr.ltr41;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;

@ToString
public class TINFO_LTR41 extends StructPack4 {
    public AsciiString Name = new AsciiString(16);
    public AsciiString Serial = new AsciiString(24);
    public AsciiString FirmwareVersion = new AsciiString(8); // Версия БИОСа
    public AsciiString FirmwareDate = new AsciiString(16);  // Дата создания данной версии БИОСа
}
