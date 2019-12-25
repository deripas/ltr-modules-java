package ru.lcard.ltr;

import org.junit.Test;
import ru.lcard.ltr.lrt27.Ltr27Api;
import ru.lcard.ltr.lrt27.TLTR27;
import ru.lcard.ltr.ltr22.Ltr22Api;
import ru.lcard.ltr.ltr22.TLTR22;

import static org.junit.Assert.assertEquals;
import static ru.lcard.ltr.StructUtil.assertSize;

public class Ltr27ApiTest {

    @Test
    public void testInit() {
        TLTR27 tltr27 = new TLTR27();
        assertEquals(0, Ltr27Api.INSTANCE.LTR27_Init(tltr27));
        assertSize(tltr27.Size.intValue(), tltr27);
    }
}
