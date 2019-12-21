package ru.lcard.ltr.ltrapi;

import lombok.AllArgsConstructor;

/**
 * Режим работы выходов DIGOUTx крейта.
 * <p>
 * Данные значения определяют, какой сигнал будет выставлен на определенном
 * выходе DIGOUT разъема синхронизации крейта.
 */
@AllArgsConstructor
public enum LTR_DigOutCfg {
    LTR_DIGOUT_CONST0(0), //< Постоянный уровень логического "0"
    LTR_DIGOUT_CONST1(1), //< Постоянный уровень логической "1"
    LTR_DIGOUT_USERIO0(2), //< Выход подключен к ножке userio0
    LTR_DIGOUT_USERIO1(3), //< Выход подключен к ножке userio1
    LTR_DIGOUT_DIGIN1(4), //< Выход подключен ко входу DIGIN1
    LTR_DIGOUT_DIGIN2(5), //< Выход подключен ко входу DIGIN2
    LTR_DIGOUT_START(6), //< На выход подаются импульсы, соответствующие моментам генерации метки "СТАРТ"
    LTR_DIGOUT_SECOND(7), //< На выход подаются импульсы, соответствующие моментам генерации метки "СЕКУНДА"
    LTR_DIGOUT_IRIG(8), //< Контроль сигналов точного времени IRIG (digout1: готовность, digout2: секунда)
    LTR_DIGOUT_DEFAULT(LTR_DIGOUT_CONST0.value), //< Значение по умолчанию
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
