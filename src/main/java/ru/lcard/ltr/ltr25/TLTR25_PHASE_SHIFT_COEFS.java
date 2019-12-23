package ru.lcard.ltr.ltr25;

import ru.lcard.ltr.StructPack4;

import static ru.lcard.ltr.ltr25.Ltr25Api.LTR25_CHANNEL_CNT;

/**
 * Набор коэффициентов для коррекции ФЧХ модуля
 */
public class TLTR25_PHASE_SHIFT_COEFS extends StructPack4 {
    /**
     * Частота, на которой измерен сдвиг фаз каналов модуля
     */
    public Double PhaseShiftRefFreq = new Double();

    /**
     * < Сдвиг фазы для каждого канала модуля в градусах
     */
    public Double[] PhaseShift = array(new Double[LTR25_CHANNEL_CNT]);
}
