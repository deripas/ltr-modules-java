package ru.lcard.ltr.ltr25;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum LTR25_FORMATS {
    LTR25_FORMAT_20(0), // 20-битный целочисленный (1 слово на отсчет)
    LTR25_FORMAT_32(1), // 32-битный целочисленный (2 слова на отсчет)
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
