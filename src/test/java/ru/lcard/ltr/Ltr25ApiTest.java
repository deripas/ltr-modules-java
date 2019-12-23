package ru.lcard.ltr;

import jnr.ffi.Struct;
import org.junit.Test;
import ru.lcard.ltr.ltr22.Ltr22Api;
import ru.lcard.ltr.ltr22.TLTR22;
import ru.lcard.ltr.ltr25.Ltr25Api;
import ru.lcard.ltr.ltr25.TLTR25;
import ru.lcard.ltr.ltr25.TLTR25_TEDS_NODE_INFO;

import static org.junit.Assert.assertEquals;

public class Ltr25ApiTest {

    @Test
    public void testInit() {
        TLTR25 tltr25 = new TLTR25();
        assertEquals(0, Ltr25Api.INSTANCE.LTR25_Init(tltr25));
        assertEquals(tltr25.Size.intValue(), Struct.size(tltr25));
    }
}
