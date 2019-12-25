package ru.lcard.ltr.ltrapi;

import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr22.Ltr22Api.COMMENT_LENGTH;

/**
 * описание процессора и програмного обеспечения
 **/
public class TLTR_DESCRIPTION_CPU extends StructPack4 {
    public Boolean Active = new Boolean();              /* флаг достоверности остальных полей структуры*/
    public AsciiString Name = new AsciiString(16); /* название */
    public Double ClockRate = new Double();
    public DWORD FirmwareVersion = new DWORD();
    public AsciiString Comment = new AsciiString(COMMENT_LENGTH);
}
