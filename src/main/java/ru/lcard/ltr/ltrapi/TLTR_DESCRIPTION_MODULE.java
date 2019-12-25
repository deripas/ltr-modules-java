package ru.lcard.ltr.ltrapi;

import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr22.Ltr22Api.COMMENT_LENGTH;

/**
 * описание модуля
 */
public class TLTR_DESCRIPTION_MODULE extends StructPack4 {
    public AsciiString CompanyName = new AsciiString(16);
    public AsciiString DeviceName = new AsciiString(16);             /* название изделия */
    public AsciiString SerialNumber = new AsciiString(16);           /* серийный номер изделия */
    public Unsigned8 Revision = new Unsigned8();                          /* ревизия изделия */
    public AsciiString Comment = new AsciiString(COMMENT_LENGTH);
}
