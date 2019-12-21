package ru.lcard.ltr.ltr212;

import lombok.AllArgsConstructor;

/**
 * режимы сбора данных (AcqMode)
 */
@AllArgsConstructor
public enum LTR212_ACQ_MODE {
    LTR212_FOUR_CHANNELS_WITH_MEDIUM_RESOLUTION(0),
    LTR212_FOUR_CHANNELS_WITH_HIGH_RESOLUTION(1),
    LTR212_EIGHT_CHANNELS_WITH_HIGH_RESOLUTION(2),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
