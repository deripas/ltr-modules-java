package ru.lcard.ltr.ltr25;

import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr25.Ltr25Api.LTR25_CHANNEL_CNT;

/**
 * Набор коэффициентов для коррекции АЧХ модуля
 */
public class TLTR25_AFC_COEFS extends StructPack4 {
    /**
     * Частота сигнала, для которой снято отношение амплитуд из FirCoef
     */
    public Double AfcFreq = new Double();

    /**
     * Набор отношений измеренной амплитуды синусоидального сигнала
     * к реальной амплитуде для макс. частоты дискретизации и частоты сигнала
     * из AfcFreq для каждого канала
     */
    public Double[] FirCoef = array(new Double[LTR25_CHANNEL_CNT]);
}
