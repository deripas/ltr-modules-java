package ru.lcard.ltr.ltr25;

import ru.lcard.ltr.StructPack4;

/**
 * Параметры текущего состояния модуля.
 * <p>
 * Структура, содержащая параметры модуля, которые пользователь должен использовать
 * только для чтения, так как они изменяются только внутри функций ltr25api.
 */
public class TLTR25_STATE extends StructPack4 {

    /**
     * <  Текущее состояние ПЛИС. Одно из значений из e_LTR_FPGA_STATE
     */
    public BYTE FpgaState = new BYTE();

    /**
     * < Количество разрешенных каналов. Устанавливается
     * после вызова LTR25_SetADC()
     */
    public BYTE EnabledChCnt = new BYTE();

    /**
     * < Признак, запущен ли сбор данных
     */
    public Boolean Run = new Boolean();

    /**
     * < Установленная частота АЦП. Обновляется после
     * вызова LTR25_SetADC()
     */
    public Double AdcFreq = new Double();

    /**
     * < Признак, находится ли модуль в состоянии низкого
     * потребления. В этом состояние нельзя выполнять настройку
     * АЦП или запуск сбора данных. Управление данным
     * режимом выполняется с помощью LTR25_SetLowPowMode()
     */
    public Boolean LowPowMode = new Boolean();

    /**
     * < Текущий режим питания датчиков для всех восьми
     * каналов. Значение из #e_LTR25_SENSORS_POWER_MODE.
     * Управление данным режимом выполняется с помощью
     * функции LTR25_SetSensorsPowerMode().
     */
    public DWORD SensorsPowerMode = new DWORD();

    /**
     * < Резервные поля
     */
    public Unsigned32[] Reserved = array(new Unsigned32[30]);
}
