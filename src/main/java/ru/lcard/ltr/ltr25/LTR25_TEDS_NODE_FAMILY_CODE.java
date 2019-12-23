package ru.lcard.ltr.ltr25;

import lombok.AllArgsConstructor;

/**
 * Коды семейств устройств узла TEDS
 * <p>
 * Данное перечисление содержит значения кодов семейств устройств с протоколом "1-Wire",
 * которые могут быть использованы при реализации узла TEDS как для хранения
 * данных TEDS, так и для вспомогательных функций.
 * <p>
 * Этот код определяет возможности, которые предоставляет устройство, и набор
 * команд для работы с этим устройством.
 * <p>
 * Данное определение содержит только коды семейств устройств, поддерживаемых
 * библиотекой. По запросу этот список может быть увеличен.
 * <p>
 * Код обнаруженного устройства узла TEDS возвращается в информации о устройстве
 * при вызове LTR25_TEDSNodeDetect().
 */
@AllArgsConstructor
public enum LTR25_TEDS_NODE_FAMILY_CODE {
    /**
     * 256 бит EEPROM с 64-битным регистром для одноразовой записи базовой информации (DS2430A)
     */
    LTR25_TEDS_NODE_FAMILY_EEPROM_256_OTP(0x14),
    /**
     * < 4 КБит EEPROM (DS2433)
     */
    LTR25_TEDS_NODE_FAMILY_EEPROM_4K(0x23),
    /**
     * < 1 КБит EEPROM (DS2431)
     */
    LTR25_TEDS_NODE_FAMILY_EEPROM_1K(0x2D),
    /**
     * < 20 КБит EEPROM (DS28EC20)
     */
    LTR25_TEDS_NODE_FAMILY_EEPROM_20K(0x43),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
