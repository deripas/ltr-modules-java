package ru.lcard.ltr.ltr212;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;

@ToString
public class TLTR212_FILTER_CFG extends StructPack4 {
    public BOOL32 IIR = new BOOL32();            // Флаг использования БИХ-фильтра
    public BOOL32 FIR = new BOOL32();             // Флаг использования КИХ-фильтра
    public DWORD Decimation = new DWORD();  // Значение коэффициента децимации для КИХ-фильтра
    public DWORD TAP = new DWORD();         // Порядок КИХ-фильтра
    public AsciiString IIR_Name = new AsciiString(512 + 1);
    public AsciiString FIR_Name = new AsciiString(512 + 1);
}
