package ru.lcard.ltr;

import org.junit.Test;
import ru.lcard.ltr.ltr25.Ltr25Api;
import ru.lcard.ltr.ltr25.TLTR25;

import static org.junit.Assert.assertEquals;
import static ru.lcard.ltr.StructUtil.assertSize;

public class Ltr25ApiTest {

    @Test
    public void testInit() {
        TLTR25 tltr25 = new TLTR25();
        assertEquals(0, Ltr25Api.INSTANCE.LTR25_Init(tltr25));
        assertSize(tltr25.Size.intValue(), tltr25);
    }
}
