package ru.lcard.ltr.ltr25;

import ru.lcard.ltr.StructPack4;

/**
 * Настройки канала АЦП.
 * <p>
 * Структура, содержащая настройки одного канала АЦП.
 */
public class TLTR25_CHANNEL_CONFIG extends StructPack4 {

    /**
     * < Признак, разрешен ли сбор по данному каналу
     */
    public Boolean Enabled = new Boolean();

    /**
     * < Выходное сопротивление датчика, подключенного к
     * данному входу ICP, с возможным учетом сопртивления
     * проводов подключения датчика, которое будет использовано
     * для коррекции падения напряжения из-за его взаимодействия
     * с входным сопротивлением ICP-входа.
     * <p>
     * Нулевое значение (по умолчанию) или значение меньше
     * нуля указывает, что коррекция падения напряжения
     * не требуется.
     */
    public Float SensorROut = new Float();

    /**
     * < Резервные поля (не должны изменяться пользователем)
     */
    public Unsigned32[] Reserved = array(new Unsigned32[10]);

    public TLTR25_CHANNEL_CONFIG(jnr.ffi.Runtime runtime) {
        super(runtime);
    }
}
