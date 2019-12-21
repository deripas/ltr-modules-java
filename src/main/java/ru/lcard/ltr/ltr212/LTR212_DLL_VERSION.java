package ru.lcard.ltr.ltr212;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;

@ToString
public class LTR212_DLL_VERSION extends StructPack4 {
    public BYTE Revision = new BYTE();
    public BYTE Build = new BYTE();
    public BYTE Minor = new BYTE();
    public BYTE Major = new BYTE();
    public DWORD Value = new DWORD();
}
