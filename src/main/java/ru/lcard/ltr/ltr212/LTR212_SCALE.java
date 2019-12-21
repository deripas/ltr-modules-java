package ru.lcard.ltr.ltr212;

import lombok.AllArgsConstructor;

/**
 * диапазоны канало
 */
@AllArgsConstructor
public enum LTR212_SCALE {
    LTR212_SCALE_B_10(0), /* диапазон -10мВ/+10мВ */
    LTR212_SCALE_B_20(1), /* диапазон -20мВ/+20мВ */
    LTR212_SCALE_B_40(2), /* диапазон -40мВ/+40мВ */
    LTR212_SCALE_B_80(3), /* диапазон -80мВ/+80мВ */
    LTR212_SCALE_U_10(4), /* диапазон -10мВ/+10мВ */
    LTR212_SCALE_U_20(5), /* диапазон -20мВ/+20мВ */
    LTR212_SCALE_U_40(6), /* диапазон -40мВ/+40мВ */
    LTR212_SCALE_U_80(7), /* диапазон -80мВ/+80мВ */
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
