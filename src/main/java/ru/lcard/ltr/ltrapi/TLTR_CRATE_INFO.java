package ru.lcard.ltr.ltrapi;

import ru.lcard.ltr.StructSimple;

import static ru.lcard.ltr.ltrapi.LtrApi.LTR_CRATES_MAX;

public class TLTR_CRATE_INFO extends StructSimple {
    /**
     * Тип крейта. значение из #en_LTR_CrateTypes
     */
    public BYTE CrateType = new BYTE();

    /**
     * Интерфейс подключения крейта.
     * значение из #en_LTR_CrateIface
     */
    public BYTE CrateInterface = new BYTE();

    public static class Array extends StructSimple {
        public TLTR_CRATE_INFO[] arr;

        public Array() {
            this(LTR_CRATES_MAX);
        }

        public Array(int count) {
            arr = array(new TLTR_CRATE_INFO[count]);
        }
    }
}
