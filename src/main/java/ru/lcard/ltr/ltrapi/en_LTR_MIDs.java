package ru.lcard.ltr.ltrapi;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum en_LTR_MIDs {
    LTR_MID_EMPTY(0),                    //< Пустой слот
    LTR_MID_IDENTIFYING(0xFFFF),               //< Модуль в процессе определения типа
    LTR_MID_LTR01(LTR_MID_MODULE(1)),    //< Идентификатор модуля LTR01
    LTR_MID_LTR11(LTR_MID_MODULE(11)),   //< Идентификатор модуля LTR11
    LTR_MID_LTR22(LTR_MID_MODULE(22)),   //< Идентификатор модуля LTR22
    LTR_MID_LTR24(LTR_MID_MODULE(24)),   //< Идентификатор модуля LTR24
    LTR_MID_LTR25(LTR_MID_MODULE(25)),   //< Идентификатор модуля LTR25
    LTR_MID_LTR27(LTR_MID_MODULE(27)),   //< Идентификатор модуля LTR27
    LTR_MID_LTR34(LTR_MID_MODULE(34)),   //< Идентификатор модуля LTR34
    LTR_MID_LTR35(LTR_MID_MODULE(35)),   //< Идентификатор модуля LTR35
    LTR_MID_LTR41(LTR_MID_MODULE(41)),   //< Идентификатор модуля LTR41
    LTR_MID_LTR42(LTR_MID_MODULE(42)),   //< Идентификатор модуля LTR42
    LTR_MID_LTR43(LTR_MID_MODULE(43)),   //< Идентификатор модуля LTR43
    LTR_MID_LTR51(LTR_MID_MODULE(51)),   //< Идентификатор модуля LTR51
    LTR_MID_LTR114(LTR_MID_MODULE(114)),  //< Идентификатор модуля LTR114
    LTR_MID_LTR210(LTR_MID_MODULE(210)),  //< Идентификатор модуля LTR210
    LTR_MID_LTR212(LTR_MID_MODULE(212)),  //< Идентификатор модуля LTR212
    LTR_MID_LTR216(LTR_MID_MODULE(216)),  //< Идентификатор модуля LTR216
    ;
    private int value;

    public int intValue() {
        return value;
    }

    /**
     * Макрос задания идентификатора модуля с указанным номером
     */
    public static int LTR_MID_MODULE(int x) {
        return (((x) & 0xFF) | (((x) & 0xFF) << 8));
    }
}
