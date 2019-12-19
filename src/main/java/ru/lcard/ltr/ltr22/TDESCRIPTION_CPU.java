package ru.lcard.ltr.ltr22;

import jnr.ffi.Struct;
import lombok.ToString;
import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr22.Ltr22Api.COMMENT_LENGTH;

@ToString
public class TDESCRIPTION_CPU extends StructPack4 {

    public BYTE Active = new BYTE(); // флаг достоверности остальных полей структуры
    public AsciiString Name = new AsciiString(16); // название
    public Double ClockRate = new Double();
    public Unsigned32 FirmwareVersion = new Unsigned32();
    public AsciiString Comment = new AsciiString(COMMENT_LENGTH);

    public java.lang.String FirmwareVersionStr() {
        int i = FirmwareVersion.intValue();
        return ((i >> 24) & 0xFF) + "." +
                ((i >> 16) & 0xFF) + "." +
                ((i >> 8) & 0xFF) + "." +
                (i & 0xFF);
    }
}
