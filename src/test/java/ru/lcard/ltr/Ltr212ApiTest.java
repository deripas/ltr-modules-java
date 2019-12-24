package ru.lcard.ltr;

import org.junit.Test;
import ru.lcard.ltr.ltr212.Ltr212Api;
import ru.lcard.ltr.ltr212.TLTR212;

import static org.junit.Assert.assertEquals;
import static ru.lcard.ltr.StructUtil.assertSize;

public class Ltr212ApiTest {

    @Test
    public void testInit() {
        TLTR212 tltr212 = new TLTR212();
        assertEquals(0, Ltr212Api.INSTANCE.LTR212_Init(tltr212));
        assertSize(tltr212.Size.intValue(), tltr212);
    }
}
