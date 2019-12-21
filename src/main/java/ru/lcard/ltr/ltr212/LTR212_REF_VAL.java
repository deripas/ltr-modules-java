package ru.lcard.ltr.ltr212;

import lombok.AllArgsConstructor;

/**
 * значения опорного напряжения
 */
@AllArgsConstructor
public enum LTR212_REF_VAL {
    LTR212_REF_2_5V(0),  //2.5 В
    LTR212_REF_5V(1),  //5   В
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
