package ru.lcard.ltr.ltr42;

import jnr.ffi.LibraryLoader;
import jnr.ffi.byref.ByteByReference;
import ru.lcard.ltr.ltrapi.TLTR_CARD_START_MODE;

public interface Ltr42Api {

    Ltr42Api INSTANCE = LibraryLoader.create(Ltr42Api.class).load("ltr42api");

    int LTR42_MARK_MODE_INTERNAL = 0;
    int LTR42_MARK_MODE_MASTER = 1;
    int LTR42_MARK_MODE_EXTERNAL = 2;
    int LTR42_EEPROM_SIZE = 512;


    int LTR42_Init(TLTR42 hnd);

    int LTR42_Open(TLTR42 hnd, int net_addr, int net_port, String crate_sn, int slot_num);

    int LTR42_IsOpened(TLTR42 hnd);

    int LTR42_Close(TLTR42 hnd);

    int LTR42_Config(TLTR42 hnd);

    int LTR42_ConfigAndStart(TLTR42 hnd);

    int LTR42_WritePort(TLTR42 hnd, short OutputData);

    int LTR42_WriteArray(TLTR42 hnd, short[] OutputArray, int ArraySize);

    int LTR42_WritePortSaved(TLTR42 hnd, short OutputData);

    int LTR42_StartSecondMark(TLTR42 hnd);

    int LTR42_StopSecondMark(TLTR42 hnd);

    int LTR42_MakeStartMark(TLTR42 hnd);

    int LTR42_WriteEEPROM(TLTR42 hnd, int Address, byte val);

    int LTR42_ReadEEPROM(TLTR42 hnd, int Address, ByteByReference val);

    int LTR42_StoreConfig(TLTR42 hnd, TLTR_CARD_START_MODE start_mode);

    String LTR42_GetErrorString(int Error_Code);

    /**
     * Установка ширины импульса метки СТАРТ
     * <p>
     * Данная функция позволяет задать время импульса, генерируемого модулем на
     * выходе при генерации метки старт, если разрешена трансляция метки СТАРТ на
     * выход (режим #LTR42_MARK_MODE_MASTER).
     * По-умолчанию время импульса составляет порядка 200нс, что может быть
     * недостаточно для запуска других устройств от данного импульса. Данная функция
     * позволяет установить большее время импульса.
     * Данная функция доступна только в прошивке, начиная с версии 2.0.
     *
     * @param hnd      Описатель модуля
     * @param time_mks Время импульса в мкс. Если 0 --- то используется вариант
     *                 по-умолчанию (~200нс).
     * @return Код ошибки
     */
    int LTR42_SetStartMarkPulseTime(TLTR42 hnd, int time_mks);

}
