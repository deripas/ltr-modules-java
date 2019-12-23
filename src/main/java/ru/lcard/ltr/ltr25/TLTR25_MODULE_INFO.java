package ru.lcard.ltr.ltr25;

import ru.lcard.ltr.StructPack4;

import java.util.EnumSet;

import static ru.lcard.ltr.ltr25.Ltr25Api.*;

/**
 * Информация о модуле.
 * <p>
 * Структура, содержащая информацию о версиях прошивок микросхем модуля и
 * информацию, считанную из Flash-памяти модуля (серийный номер, калибровочные
 * коэффициенты).
 * <p>
 * Все поля заполняются при вызове LTR25_Open()
 */
public class TLTR25_MODULE_INFO extends StructPack4 {
    /**
     * Название модуля ("LTR25").
     */
    public AsciiString Name = new AsciiString(LTR25_NAME_SIZE);

    /**
     * Серийный номер модуля.
     */
    public AsciiString Serial = new AsciiString(LTR25_SERIAL_SIZE);

    /**
     * Версия прошивки ПЛИС
     */
    public WORD VerFPGA = new WORD();

    /**
     * Версия прошивки PLD
     */
    public BYTE VerPLD = new BYTE();

    /**
     * Ревизия платы
     */
    public BYTE BoardRev = new BYTE();

    /**
     * Признак, это индустриальный вариант модуля или нет
     */
    public Boolean Industrial = new Boolean();

    /**
     * Флаги из #e_LTR25_FEATURES, указывающие,
     * какие дополнительные возможности
     * поддерживает данная версия модуля
     */
    public DWORD SupportedFeatures = new DWORD();

    /**
     * Зарезервированные поля. Всегда равны 0
     */
    public Unsigned32[] Reserved = array(new Unsigned32[7]);

    /**
     * Калибровочные коэффициенты модуля. Считываются из Flash-памяти
     * модуля при вызове LTR25_Open() или LTR25_GetConfig() и загружаются
     * в ПЛИС для применения во время вызова LTR25_SetADC()
     */
    public TLTR25_CBR_COEF[] CbrCoef = array(new TLTR25_CBR_COEF[LTR25_CHANNEL_CNT * LTR25_CBR_FREQ_CNT]);

    /**
     * Коэффициенты для коррекции АЧХ модуля
     */
    public TLTR25_AFC_COEFS AfcCoef = inner(new TLTR25_AFC_COEFS());

    /**
     * Коэффициенты для коррекции ФЧХ модуля
     */
    public TLTR25_PHASE_SHIFT_COEFS PhaseCoef = inner(new TLTR25_PHASE_SHIFT_COEFS());

    /**
     * Резервные поля
     */
    public Double[] Reserved2 = array(new Double[32 * LTR25_CHANNEL_CNT - 9 - 9]);
}
