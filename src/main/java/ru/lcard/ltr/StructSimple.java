package ru.lcard.ltr;

import jnr.ffi.Struct;
import jnr.ffi.provider.FFIProvider;

public abstract class StructSimple extends Struct {

    protected StructSimple() {
        super(FFIProvider.getSystemProvider().getRuntime());
    }
}
