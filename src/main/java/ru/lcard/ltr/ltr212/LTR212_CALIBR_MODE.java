package ru.lcard.ltr.ltr212;

import lombok.AllArgsConstructor;

/**
 *  режимы калибровки
 */
@AllArgsConstructor
public enum LTR212_CALIBR_MODE {
    LTR212_CALIBR_MODE_INT_ZERO             (0),
    LTR212_CALIBR_MODE_INT_SCALE            (1),
    LTR212_CALIBR_MODE_INT_FULL             (2),
    LTR212_CALIBR_MODE_EXT_ZERO             (3),
    LTR212_CALIBR_MODE_EXT_SCALE            (4),
    LTR212_CALIBR_MODE_EXT_ZERO_INT_SCALE   (5),
    LTR212_CALIBR_MODE_EXT_FULL_2ND_STAGE   (6), /* вторая стадия внешней калибровки */
    LTR212_CALIBR_MODE_EXT_ZERO_SAVE_SCALE  (7),  /* внешний ноль с сохранением до этого полученных коэф. масштаба */
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
