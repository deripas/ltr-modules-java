package ru.lcard.ltr.ltr22;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import ru.lcard.ltr.StructSimple;

public class AdcRange extends Struct {

    public Struct.Enum8<en_AdcRange> value = new Struct.Enum8<>(en_AdcRange.class);

    public AdcRange(Runtime runtime) {
        super(runtime);
    }

    public static class Array extends StructSimple {
        public AdcRange[] arr;

        public Array(int count) {
            arr = array(new AdcRange[count]);
        }
    }
}
