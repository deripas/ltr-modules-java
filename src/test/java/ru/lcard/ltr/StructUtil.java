package ru.lcard.ltr;

import jnr.ffi.Struct;
import lombok.experimental.UtilityClass;
import org.junit.Assert;

@UtilityClass
public class StructUtil {

    public static void assertSize(int expectedSize, Struct struct) {
        int size = Struct.size(struct);
        if (expectedSize == size) return; // equals, OK

        // пробуем применить выравнивание по размерности адреса
        int addressSize = struct.getRuntime().addressSize();
        int correctSize = size + addressSize - (size & (addressSize - 1));
        if (expectedSize == correctSize) return; // equals, OK

        Assert.fail("bad structure, expected:" + expectedSize + ", actual:" + size);
    }
}
