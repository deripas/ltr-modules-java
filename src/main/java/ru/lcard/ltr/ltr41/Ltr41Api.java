package ru.lcard.ltr.ltr41;

import jnr.ffi.LibraryLoader;
import jnr.ffi.byref.ByteByReference;
import jnr.ffi.byref.IntByReference;
import jnr.ffi.byref.ShortByReference;

public interface Ltr41Api {

    Ltr41Api INSTANCE = LibraryLoader.create(Ltr41Api.class).load("ltr41api");

    int LTR41_EEPROM_SIZE = 512;

    int LTR41_MARK_MODE_INTERNAL = 0;
    int LTR41_MARK_MODE_MASTER = 1;
    int LTR41_MARK_MODE_EXTERNAL = 2;

    int LTR41_STREAM_READ_RATE_MIN = 100;
    int LTR41_STREAM_READ_RATE_MAX = 100000;


    int LTR41_Init(TLTR41 hnd);

    int LTR41_Open(TLTR41 hnd, int net_addr, int net_port, String crate_sn, int slot_num);

    int LTR41_IsOpened(TLTR41 hnd);

    int LTR41_Close(TLTR41 hnd);

    int LTR41_Config(TLTR41 hnd);

    int LTR41_ReadPort(TLTR41 hnd, ShortByReference InputData);

    int LTR41_StartStreamRead(TLTR41 hnd);

    int LTR41_StopStreamRead(TLTR41 hnd);

    int LTR41_Recv(TLTR41 hnd, int[] data, int[] tmark, int size, int timeout);

    int LTR41_ProcessData(TLTR41 hnd, int[] src, short[] dest, IntByReference size);

    int LTR41_StartSecondMark(TLTR41 hnd);

    int LTR41_StopSecondMark(TLTR41 hnd);

    int LTR41_MakeStartMark(TLTR41 hnd);

    String LTR41_GetErrorString(int Error_Code);

    int LTR41_WriteEEPROM(TLTR41 hnd, int Address, byte val);

    int LTR41_ReadEEPROM(TLTR41 hnd, int Address, ByteByReference val);

    /**
     * Установка ширины импульса метки СТАРТ
     * <p>
     * Данная функция позволяет задать время импульса, генерируемого модулем на
     * выходе при генерации метки старт, если разрешена трансляция метки СТАРТ на
     * выход (режим #LTR41_MARK_MODE_MASTER).
     * По-умолчанию время импульса составляет порядка 200нс, что может быть
     * недостаточно для запуска других устройств от данного импульса. Данная функция
     * позволяет установить большее время импульса.
     * Данная функция доступна только в прошивке, начиная с версии 2.0.
     * Кроме того для генерации длинного импульса не должен быть запущен потоковый
     * ввод данных (при запущенном время импульса соответствует времени без установки)
     *
     * @param hnd      Описатель модуля
     * @param time_mks time_mks   Время импульса в мкс. Если 0 --- то используется вариант
     *                 по-умолчанию (~200нс).
     * @return Код ошибки
     */
    int LTR41_SetStartMarkPulseTime(TLTR41 hnd, int time_mks);

}
