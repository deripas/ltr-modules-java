package ru.lcard.ltr.ltrapi;

import lombok.AllArgsConstructor;

/**
 * Дополнительные флаги канала связи с ltrd
 */
@AllArgsConstructor
public enum LTR_CC_Flags {
    /**
     * флаг отладки --- ltrd передает клиенту
     * все данные, которые приходят от крейта,
     * без разбивки по модулям
     */
    LTR_CC_FLAG_RAW_DATA(0x4000),
    ;
    private int value;

    public int intValue() {
        return value;
    }

}
