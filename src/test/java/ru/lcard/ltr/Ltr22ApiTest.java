package ru.lcard.ltr;

import org.junit.Test;
import ru.lcard.ltr.ltr22.Ltr22Api;
import ru.lcard.ltr.ltr22.TLTR22;

import static org.junit.Assert.assertEquals;
import static ru.lcard.ltr.StructUtil.assertSize;

public class Ltr22ApiTest {

    @Test
    public void testInit() {
        TLTR22 tltr22 = new TLTR22();
        assertEquals(0, Ltr22Api.INSTANCE.LTR22_Init(tltr22));
        assertSize(tltr22.Size.intValue(), tltr22);
    }
}
