package ru.lcard.ltr.ltrapi;

import lombok.AllArgsConstructor;

/**
 * Режим подключения пользовательских выводов процессора крейта.
 * <p>
 * Данные константы задают режим подключения конкретной ножки процессора, которые
 * могут использоваться в некоторых крейтах при написании пользовательской прошивки
 * процессора. Для штатной прошивки не имеют значения.
 */
@AllArgsConstructor
public enum LTR_UserIoCfg {
    LTR_USERIO_DIGIN1(1),    //< Ножка является входом и подключена к DIGIN1
    LTR_USERIO_DIGIN2(2),    //< Ножка является входом и подключена к DIGIN2
    LTR_USERIO_DIGOUT(0),    //< Ножка является выходом
    LTR_USERIO_DEFAULT(LTR_USERIO_DIGOUT.value), //< Значение по умолчанию
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
