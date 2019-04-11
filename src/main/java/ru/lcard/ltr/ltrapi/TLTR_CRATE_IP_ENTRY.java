package ru.lcard.ltr.ltrapi;

import ru.lcard.ltr.StructPack4;
import ru.lcard.ltr.StructSimple;

import static ru.lcard.ltr.ltrapi.LtrApi.LTR_CRATES_MAX;
import static ru.lcard.ltr.ltrapi.LtrApi.LTR_CRATE_SERIAL_SIZE;

/**
 * Запись с IP-адресом крейта,
 * <p>
 * Данная структура содержит информацию о записи об IP-адресе крейта, сохраненную
 * в настройках службы ltrd, а также состояние подключения крейта по интерфейсу
 * Ethernet (TCP/IP), соответствующего данной записи
 */
public class TLTR_CRATE_IP_ENTRY extends StructPack4 {
    /**
     * < IP-адрес крейта. Формат аналогичен полю
     * saddr в #TLTR
     */
    public DWORD ip_addr = new DWORD();
    /**
     * < Набор флагов, связанных с данной записью,
     * из #en_LTR_CrateIpFlags
     */
    public DWORD flags = new DWORD();
    /**
     * < Если крейт подключен, то
     * в данном поле содержится серийный номер
     * подключенного крейта. Этот
     * номер можно использовать для
     * открытия соединения с крейтом.
     * Для остальных значений status данное
     * поле содержит пустую строку, т.к.
     * серийный номер неизвестен
     */
    public AsciiString serial_number = new AsciiString(LTR_CRATE_SERIAL_SIZE);
    /**
     * < Резервное поле. Всегда равно 0
     */
    public Boolean is_dynamic = new Boolean();
    /**
     * < Состояние подключения крейта, соответствующего
     * данной записи. Одно значение из #en_LTR_CrateIpStatus
     */
    public BYTE status = new BYTE();

    public static class Array extends StructSimple {
        public TLTR_CRATE_IP_ENTRY[] arr;

        public Array() {
            this(LTR_CRATES_MAX);
        }

        public Array(int count) {
            arr = array(new TLTR_CRATE_IP_ENTRY[count]);
        }
    }
}
