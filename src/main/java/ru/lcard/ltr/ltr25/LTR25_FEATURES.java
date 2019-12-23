package ru.lcard.ltr.ltr25;

import lombok.AllArgsConstructor;

/**
 * Дополнительные возможности, поддерживаемые модулем
 * <p>
 * Флаги, указывающие, какие дополнительные возможности реализованы в данной
 * версии модуля.
 */
@AllArgsConstructor
public enum LTR25_FEATURES {
    /**
     * Расширенная полоса пропускания в области низких частот
     */
    LTR25_FEATURE_EXT_BANDWIDTH_LF(1 << 0),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
