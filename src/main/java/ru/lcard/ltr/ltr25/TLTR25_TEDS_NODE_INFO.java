package ru.lcard.ltr.ltr25;

import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr25.Ltr25Api.LTR25_TEDS_NODE_SERIAL_SIZE;

/**
 * Информация о устройстве узла TEDS
 * <p>
 * В данной структуре содержится информация о микросхеме, которая используется
 * для реализации узла TEDS и с которой взаимодействует модуль в цифровом режиме
 * работы канала.
 * Эта микросхема как правило содержит энергонезависимую память, которая хранит
 * информаию о датчике (TEDS), но также может содержать и другие функиональные
 * возможности.
 * <p>
 * Данная информация возвращается при обнаружении устройства при вызове LTR25_TEDSNodeDetect().
 */
public class TLTR25_TEDS_NODE_INFO extends StructPack4 {
    /**
     * < Признак действительности информации
     */
    public Boolean Valid = new Boolean();

    /**
     * < Идентификатор семейства устройств, к которому принадлежит
     * данное устройство, реализующее узел TEDS.
     * Может быть равен одному из значений #e_LTR25_TEDS_NODE_FAMILY_CODE
     * или другому коду, если обнаружено устройство
     * не из списка поддерживаемых библиотекой
     */
    public BYTE DevFamilyCode = new BYTE();

    /**
     * < Серийный номер устройства узла TEDS.
     * 48-битное число, представленное в виде 6 байт.
     */
    public Unsigned8[] DevSerial = array(new Unsigned8[LTR25_TEDS_NODE_SERIAL_SIZE]);

    /**
     * < Размер TEDS данных в байтах, который может
     * хранится в памяти в памяти узла.
     */
    public DWORD TEDSDataSize = new DWORD();

    /**
     * < Резерв
     */
    public Double[] Reserved = array(new Double[7]);
}
