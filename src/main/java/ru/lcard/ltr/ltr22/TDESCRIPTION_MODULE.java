package ru.lcard.ltr.ltr22;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr22.Ltr22Api.COMMENT_LENGTH;

@ToString
public class TDESCRIPTION_MODULE extends StructPack4 {

    public AsciiString CompanyName = new AsciiString(16); //
    public AsciiString DeviceName = new AsciiString(16); // название изделия
    public AsciiString SerialNumber = new AsciiString(16); // серийный номер изделия
    public BYTE Revision = new BYTE(); // ревизия изделия
    public AsciiString Comment = new AsciiString(COMMENT_LENGTH);
}
