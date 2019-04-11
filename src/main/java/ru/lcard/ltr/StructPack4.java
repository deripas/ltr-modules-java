package ru.lcard.ltr;

import jnr.ffi.Struct;
import jnr.ffi.provider.FFIProvider;

public abstract class StructPack4 extends Struct {

    protected StructPack4() {
        super(FFIProvider.getSystemProvider().getRuntime(), new Alignment(4));
    }
}
