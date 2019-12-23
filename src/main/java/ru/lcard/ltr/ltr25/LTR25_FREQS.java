package ru.lcard.ltr.ltr25;

import lombok.AllArgsConstructor;

/**
 * Коды частот сбора АЦП
 */
@AllArgsConstructor
public enum LTR25_FREQS {
    LTR25_FREQ_78K(0),     // 78.125 кГц
    LTR25_FREQ_39K(1),     // 39.0625 кГц
    LTR25_FREQ_19K(2),     // 19.53125 кГц
    LTR25_FREQ_9K7(3),     // 9.765625 кГц
    LTR25_FREQ_4K8(4),     // 4.8828125 кГц
    LTR25_FREQ_2K4(5),    // 2.44140625 кГц
    LTR25_FREQ_1K2(6),    // 1.220703125 кГц
    LTR25_FREQ_610(7),    // 610.3515625 Гц
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
