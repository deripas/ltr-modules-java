package ru.lcard.ltr.ltrapi;

/**
 * Интерфейс подключения крейта
 */
public enum LTR_CrateIface {
    /**
     * < Неизвествный код интерфейса крейта.
     * При передаче в функции данное значение
     * может указывать, что интерфейс подклучения
     * крейта не имеет значения
     */
    LTR_CRATE_IFACE_UNKNOWN,

    /**
     * < Крейт подключен по интерфейсу USB
     */
    LTR_CRATE_IFACE_USB,

    /**
     * < Крейт подключен по Ethernet (TCP/IP)
     */
    LTR_CRATE_IFACE_TCPIP
};