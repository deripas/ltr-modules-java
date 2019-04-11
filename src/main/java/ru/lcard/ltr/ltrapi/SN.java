package ru.lcard.ltr.ltrapi;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import ru.lcard.ltr.StructSimple;

import static ru.lcard.ltr.ltrapi.LtrApi.LTR_CRATES_MAX;
import static ru.lcard.ltr.ltrapi.LtrApi.LTR_CRATE_SERIAL_SIZE;

public class SN extends Struct {
    public Struct.AsciiString sn = new AsciiString(LTR_CRATE_SERIAL_SIZE);

    public SN(Runtime runtime) {
        super(runtime);
    }

    public static class Array extends StructSimple {
        public SN[] arr;

        public Array() {
            this(LTR_CRATES_MAX);
        }

        public Array(int count) {
            arr = array(new SN[count]);
        }
    }
}
