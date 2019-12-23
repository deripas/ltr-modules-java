package ru.lcard.ltr.ltr25;

import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr25.Ltr25Api.LTR25_CHANNEL_CNT;

/**
 * Настройки модуля.
 * <p>
 * Структура содержит все настройки модуля, которые должен заполнить
 * пользователь перед вызовом LTR25_SetADC().
 */
public class TLTR25_CONFIG extends StructPack4 {
    /**
     * < Настройки каналов АЦП
     */
    public TLTR25_CHANNEL_CONFIG[] Ch = array(new TLTR25_CHANNEL_CONFIG[LTR25_CHANNEL_CNT]);

    /**
     * < Код, задающий требуемую частоту сбора АЦП.
     * Одно из значений #e_LTR25_FREQS
     */
    public Enum8<LTR25_FREQS> FreqCode = new Enum8<>(LTR25_FREQS.class);

    /**
     * < Формат, в котором будут передаваться отсчеты
     * АЦП от модуля. Одно из значений #e_LTR25_FORMATS.
     * Формат определяет также количество передаваемых
     * слов на один отсчет и влияет на максимальное
     * количество разрешенных каналов
     */
    public Enum8<LTR25_FORMATS> DataFmt = new Enum8<>(LTR25_FORMATS.class);

    /**
     * < Используемое значение источника тока. Одно из
     * значений #e_LTR25_I_SOURCES
     */
    public Enum8<LTR25_I_SOURCES> ISrcValue = new Enum8<>(LTR25_I_SOURCES.class);

    /**
     * < Резервные поля (не должны изменяться пользователем)
     */
    public Unsigned32[] Reserved = array(new Unsigned32[50]);
}
