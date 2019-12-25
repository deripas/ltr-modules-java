package ru.lcard.ltr.lrt27;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum LTR27_PROC_FLAGS {
    LTR27_PROC_FLAG_CALIBR(0x00000001),
    LTR27_PROC_FLAG_CONV_VALUE(0x00000002),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
