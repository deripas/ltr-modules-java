package ru.lcard.ltr.ltr22;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum en_ProcFlags {
    Calibr(0x00000001),
    Volt(0x00000002),
    PerChOrder(0x01000000),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
