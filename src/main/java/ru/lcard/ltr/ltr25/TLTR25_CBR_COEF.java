package ru.lcard.ltr.ltr25;

import ru.lcard.ltr.StructPack4;

/**
 * Калибровочные коэффициенты.
 * <p>
 * Структура, хранящая калибровочные коэффициенты для одного канала
 * и диапазона.
 */
public class TLTR25_CBR_COEF extends StructPack4 {
    public Float Offset = new Float(); // Код смещения
    public Float Scale = new Float();  // Коэффициент шкалы

    public TLTR25_CBR_COEF(jnr.ffi.Runtime runtime) {
        super(runtime);
    }
}
