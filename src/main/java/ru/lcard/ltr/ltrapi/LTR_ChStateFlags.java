package ru.lcard.ltr.ltrapi;

import lombok.AllArgsConstructor;

/**
 * Флаги состояния соединения.
 */
@AllArgsConstructor
public enum LTR_ChStateFlags {
    /**
     * Флаг переполнения буфера. Указывает что
     * из-за того, что клиент не считывал данные,
     * в ltrd произошло переполнение очереди клиента.
     * соответственно в принятых данных есть разрыв
     */
    LTR_FLAG_RBUF_OVF(1 << 0),
    /**
     * Флаг получения данных в полном формате
     * в функции {@link LtrApi#LTR_GetCrateRawData}
     */
    LTR_FLAG_RFULL_DATA(1 << 1),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
