package ru.lcard.ltr.ltrapi;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import ru.lcard.ltr.StructSimple;

import static ru.lcard.ltr.ltrapi.LtrApi.LTR_MODULES_PER_CRATE_MAX;

public class MID extends Struct {
    public Enum16<LTR_MIDs> mid = new Enum16<>(LTR_MIDs.class);

    protected MID(Runtime runtime) {
        super(runtime);
    }

    public static class Array extends StructSimple {
        public MID[] arr;

        public Array() {
            this(LTR_MODULES_PER_CRATE_MAX);
        }

        public Array(int count) {
            arr = array(new MID[count]);
        }
    }
}
