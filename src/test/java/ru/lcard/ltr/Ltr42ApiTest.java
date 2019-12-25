package ru.lcard.ltr;

import org.junit.Test;
import ru.lcard.ltr.ltr42.Ltr42Api;
import ru.lcard.ltr.ltr42.TLTR42;

import static org.junit.Assert.assertEquals;
import static ru.lcard.ltr.StructUtil.assertSize;

public class Ltr42ApiTest {

    @Test
    public void testInit() {
        TLTR42 tltr42 = new TLTR42();
        assertEquals(0, Ltr42Api.INSTANCE.LTR42_Init(tltr42));
        assertSize(tltr42.Size.intValue(), tltr42);
    }
}
