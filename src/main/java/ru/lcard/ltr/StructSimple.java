package ru.lcard.ltr;

import jnr.ffi.NativeType;
import jnr.ffi.Struct;
import jnr.ffi.provider.FFIProvider;

public abstract class StructSimple extends Struct {

    protected StructSimple() {
        super(FFIProvider.getSystemProvider().getRuntime());
    }

    protected StructSimple(int alignment) {
        this(FFIProvider.getSystemProvider().getRuntime(), alignment);
    }

    protected StructSimple(jnr.ffi.Runtime runtime, int alignment) {
        super(runtime, new Alignment(alignment));
    }


    public final class BOOL32 extends AbstractBoolean {
        public BOOL32() {
            super(NativeType.SINT);
        }

        public final boolean get() {
            return (getMemory().getShort(offset()) & 0x1) != 0;
        }

        public final void set(boolean value) {
            getMemory().putInt(offset(), value ? 1 : 0);
        }
    }
}
