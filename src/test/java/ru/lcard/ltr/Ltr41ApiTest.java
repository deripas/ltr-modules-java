package ru.lcard.ltr;

import org.junit.Test;
import ru.lcard.ltr.ltr41.Ltr41Api;
import ru.lcard.ltr.ltr41.TLTR41;

import static org.junit.Assert.assertEquals;
import static ru.lcard.ltr.StructUtil.assertSize;

public class Ltr41ApiTest {

    @Test
    public void testInit() {
        TLTR41 tltr41 = new TLTR41();
        assertEquals(0, Ltr41Api.INSTANCE.LTR41_Init(tltr41));
        assertSize(tltr41.Size.intValue(), tltr41);
    }
}
