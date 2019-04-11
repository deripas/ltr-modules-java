package ru.lcard.ltr.ltrapi;

import lombok.AllArgsConstructor;

/**
 * Фалаги канала связи ltrd для явного задания интерфейса крейта
 */
@AllArgsConstructor
public enum en_LTR_CC_Iface {
    /**
     * Явное указание, что соединение должно быть с крейтом, подключенным по USB-интерфейсу
     */
    LTR_CC_IFACE_USB(0x0100),

    /**
     * Явное указание, что соединение должно быть с крейтом, подключенным по Ethernet (TCP/IP)
     */
    LTR_CC_IFACE_ETH(0x0200),
    ;
    private int value;

    public int intValue() {
        return value;
    }
}
