package ru.lcard.ltr.ltrapi;

import lombok.AllArgsConstructor;

/**
 * Номера каналов для соединения со службой ltrd
 */
@AllArgsConstructor
public enum en_LTR_CC_ChNum {
    LTR_CC_CHNUM_CONTROL(0),  //< Канал для передачи управляющих запросов крейту или службе ltrd
    LTR_CC_CHNUM_MODULE1(1),  //< Канал для работы c модулем в слоте 1
    LTR_CC_CHNUM_MODULE2(2),  //< Канал для работы c модулем в слоте 2
    LTR_CC_CHNUM_MODULE3(3),  //< Канал для работы c модулем в слоте 3
    LTR_CC_CHNUM_MODULE4(4),  //< Канал для работы c модулем в слоте 4
    LTR_CC_CHNUM_MODULE5(5),  //< Канал для работы c модулем в слоте 5
    LTR_CC_CHNUM_MODULE6(6),  //< Канал для работы c модулем в слоте 6
    LTR_CC_CHNUM_MODULE7(7),  //< Канал для работы c модулем в слоте 7
    LTR_CC_CHNUM_MODULE8(8),  //< Канал для работы c модулем в слоте 8
    LTR_CC_CHNUM_MODULE9(9),  //< Канал для работы c модулем в слоте 9
    LTR_CC_CHNUM_MODULE10(10), //< Канал для работы c модулем в слоте 10
    LTR_CC_CHNUM_MODULE11(11), //< Канал для работы c модулем в слоте 11
    LTR_CC_CHNUM_MODULE12(12), //< Канал для работы c модулем в слоте 12
    LTR_CC_CHNUM_MODULE13(13), //< Канал для работы c модулем в слоте 13
    LTR_CC_CHNUM_MODULE14(14), //< Канал для работы c модулем в слоте 14
    LTR_CC_CHNUM_MODULE15(15), //< Канал для работы c модулем в слоте 15
    LTR_CC_CHNUM_MODULE16(16), //< Канал для работы c модулем в слоте 16
    LTR_CC_CHNUM_USERDATA(18), //< Псевдоканал для передачи пользовательских данных от крейта.
    // Может использоваться только в специализированных пользовательских прошивках
    ;
    private int value;

    public int intValue() {
        return value;
    }

};
