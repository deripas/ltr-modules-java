package ru.lcard.ltr;

import jnr.ffi.Struct;
import org.junit.Test;
import ru.lcard.ltr.ltrapi.LtrApi;
import ru.lcard.ltr.ltrapi.TLTR;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LtrApiTest {

    @Test
    public void testInit() {
        TLTR tltr = new TLTR();
        assertEquals(0, LtrApi.INSTANCE.LTR_Init(tltr));
        assertEquals(40, Struct.size(tltr));
    }
}
