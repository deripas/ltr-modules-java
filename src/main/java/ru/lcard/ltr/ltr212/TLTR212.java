package ru.lcard.ltr.ltr212;

import lombok.ToString;
import ru.lcard.ltr.StructPack4;
import ru.lcard.ltr.ltrapi.TLTR;

import static ru.lcard.ltr.ltr212.Ltr212Api.LTR212_LCH_CNT_MAX;

@ToString
public class TLTR212 extends StructPack4 {
    public DWORD Size = new DWORD();
    public TLTR Channel = inner(new TLTR());
    public Enum32<LTR212_ACQ_MODE> AcqMode = new Enum32<>(LTR212_ACQ_MODE.class); // Режим сбора данных
    public BOOL32 UseClb = new BOOL32();  // Флаг использования калибровочных коэфф-тов
    public BOOL32 UseFabricClb = new BOOL32(); // Флаг использования заводских калибровочных коэфф-тов
    public Signed32 LChQnt = new Signed32(); // Кол-во используемых виртуальных каналов
    public Signed32[] LChTbl = array(new Signed32[LTR212_LCH_CNT_MAX]);  //Таблица виртуальных каналов
    public Enum32<LTR212_REF_VAL> REF = new Enum32<>(LTR212_REF_VAL.class);		 // Флаг высокого опорного напряжения
    public BOOL32 AC = new BOOL32();		 // Флаг знакопеременного опорного напряжения
    public Double Fs = new Double();     // Частота дискретизации АЦП

    public TLTR212_FILTER_CFG filter = inner(new TLTR212_FILTER_CFG());   // Структура, хранящая данные о прогр. фильтрах и их коэфф-ты.
    public TINFO_LTR212 ModuleInfo = inner(new TINFO_LTR212());

    public WORD CRC_PM = new WORD(); // для служебного пользования
    public WORD CRC_Flash_Eval = new WORD(); // для служебного пользования
    public WORD CRC_Flash_Read = new WORD(); // для служебного пользования
}
