package ru.lcard.ltr;

import jnr.ffi.Struct;
import org.junit.Assert;
import org.junit.Test;
import ru.lcard.ltr.ltr212.Ltr212Api;
import ru.lcard.ltr.ltr212.TLTR212;
import ru.lcard.ltr.ltr22.Ltr22Api;
import ru.lcard.ltr.ltr22.TLTR22;

import static org.junit.Assert.assertEquals;

public class Ltr22ApiTest {

    @Test
    public void testInit() {
        TLTR22 tltr22 = new TLTR22();
        assertEquals(0, Ltr22Api.INSTANCE.LTR22_Init(tltr22));
        assertEquals(tltr22.Size.intValue(), Struct.size(tltr22));
    }
}
