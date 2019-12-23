package ru.lcard.ltr;

import jnr.ffi.Runtime;
import jnr.ffi.byref.ByReference;

public class BooleanByReference implements ByReference<Boolean> {

    private boolean value = false;

    @Override
    public int nativeSize(Runtime runtime) {
        return 1;
    }

    @Override
    public void toNative(Runtime runtime, jnr.ffi.Pointer memory, long offset) {
        memory.putByte(offset, (byte) (value ? 1 : 0));
    }

    @Override
    public void fromNative(Runtime runtime, jnr.ffi.Pointer memory, long offset) {
        value = memory.getByte(offset) == 1;
    }

    @Override
    public java.lang.Boolean getValue() {
        return value;
    }
}