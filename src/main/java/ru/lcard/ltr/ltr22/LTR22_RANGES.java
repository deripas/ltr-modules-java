package ru.lcard.ltr.ltr22;

import lombok.AllArgsConstructor;

/**
 *  коды диапазонов АЦП
 */
@AllArgsConstructor
public enum LTR22_RANGES {
    Range_1(0),
    Range_0_3(1),
    Range_0_1(2),
    Range_0_03(3),
    Range_10(4),
    Range_3(5),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
