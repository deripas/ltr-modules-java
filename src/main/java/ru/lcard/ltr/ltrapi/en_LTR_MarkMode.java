package ru.lcard.ltr.ltrapi;

import lombok.AllArgsConstructor;

/**
 * Режим генерации синхрометок.
 * <p>
 * Данные значения используются для указания условия), по которому будут генерироваться
 * метки "СТАРТ" или "СЕКУНДА".
 */
@AllArgsConstructor
public enum en_LTR_MarkMode {
    /**
     * < Генерация метки отключена
     */
    LTR_MARK_OFF(0),
    /**
     * < Метка генерируется по фронту сигнала на входе DIGIN1
     */
    LTR_MARK_EXT_DIGIN1_RISE(1),
    /**
     * < Метка генерируется по спаду сигнала на входе DIGIN1
     */
    LTR_MARK_EXT_DIGIN1_FALL(2),
    /**
     * < Метка генерируется по фронту сигнала на входе DIGIN2
     */
    LTR_MARK_EXT_DIGIN2_RISE(3),
    /**
     * < Метка генерируется по спаду сигнала на входе DIGIN2
     */
    LTR_MARK_EXT_DIGIN2_FALL(4),

    /**
     * Внутренняя генерация метки крейт-контроллером. Для метки "СТАРТ" генерация выполняется
     * однократно при вызове LTR_MakeStartMark(). Для метки "СЕКУНДА" --- по таймеру крейта
     * (раз в секунду)), начиная с вызова LTR_StartSecondMark().
     */
    LTR_MARK_INTERNAL(5),


    /* Источник метки - вход NAMUR (только для LTR-E-7/15) */
    LTR_MARK_NAMUR1_LO2HI(8),    // по сигналу NAMUR1 (START_IN)), возрастание тока
    LTR_MARK_NAMUR1_HI2LO(9),    // по сигналу NAMUR1 (START_IN)), спад тока
    LTR_MARK_NAMUR2_LO2HI(10),   // по сигналу NAMUR2 (M1S_IN)), возрастание тока
    LTR_MARK_NAMUR2_HI2LO(11),   // по сигналу NAMUR2 (M1S_IN)), спад тока

    /**
     * < Источником метки является декодер
     * сигналов точного времени IRIG-B006.
     * Может использоваться только для
     * секундных меток (для меток "СЕКУНДА").
     * В качестве входного сигнала используется
     * сигнал со входа DIGIN1
     */
    LTR_MARK_SEC_IRIGB_DIGIN1(16),
    /**
     * < Аналогично #LTR_MARK_SEC_IRIGB_DIGIN1), но
     * в качестве входного сигнала используется
     * инвертированный сигнал со входа DIGIN1
     */
    LTR_MARK_SEC_IRIGB_nDIGIN1(17),
    /**
     * < Аналогично #LTR_MARK_SEC_IRIGB_DIGIN1), но
     * в качестве входного сигнала используется
     * сигнал со входа DIGIN2
     */
    LTR_MARK_SEC_IRIGB_DIGIN2(18),
    /**
     * < Аналогично #LTR_MARK_SEC_IRIGB_DIGIN1), но
     * в качестве входного сигнала используется
     * инвертированный сигнал со входа DIGIN2
     */
    LTR_MARK_SEC_IRIGB_nDIGIN2(19),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}