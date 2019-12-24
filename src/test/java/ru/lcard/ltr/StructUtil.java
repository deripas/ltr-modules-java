package ru.lcard.ltr;

import jnr.ffi.NativeType;
import jnr.ffi.Struct;
import jnr.ffi.provider.FFIProvider;
import lombok.experimental.UtilityClass;
import org.junit.Assert;

@UtilityClass
public class StructUtil {

    /**
     * Can be either 4 or 8 bytes in size, depending on the platform.
     */
    private static final int ADDRESS_SIZE = FFIProvider.getSystemProvider().getRuntime()
            .findType(NativeType.ADDRESS)
            .size();

    /**
     * Can be either 3 or 7 bytes in size, depending on the platform.
     */
    private static final int ADDRESS_MASK = ADDRESS_SIZE - 1;

    public static void assertSize(int expectedSize, Struct struct) {
        int actualSize = Struct.size(struct);
        if (expectedSize == actualSize) return; // equals, OK

        // пробуем применить выравнивание по размерности адреса
        int mod = actualSize & ADDRESS_MASK;
        int fixSize = mod == 0 ? actualSize : actualSize - mod + ADDRESS_SIZE;
        if (expectedSize == fixSize) return; // equals, OK

        Assert.fail("bad structure");
    }
}
