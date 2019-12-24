package ru.lcard.ltr;

import org.junit.Test;
import ru.lcard.ltr.ltrapi.LtrApi;
import ru.lcard.ltr.ltrapi.TLTR;

import static org.junit.Assert.assertEquals;
import static ru.lcard.ltr.StructUtil.assertSize;

public class LtrApiTest {

    @Test
    public void testInit() {
        TLTR tltr = new TLTR();
        assertEquals(0, LtrApi.INSTANCE.LTR_Init(tltr));
        assertSize(40, tltr);
    }
}
