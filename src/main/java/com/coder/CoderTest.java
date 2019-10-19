package main.java.com.coder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoderTest {

    @Test
    public void testEncode() {
        String e5 = Coder.encode("e", 5);
        assertEquals("j", e5);
        String z1 = Coder.encode("z", 1);
        assertEquals("a", z1);
        String x7 = Coder.encode("X", 7);
        assertEquals("E", x7);
        String hello5 = Coder.encode("HELLO", 5);
        assertEquals("MJQQT", hello5);
    }

    @Test
    public void testDecode() {
        String j = Coder.decode("j", 5);
        assertEquals("e", j);
        String a = Coder.decode("a", 1);
        assertEquals("z", a);
        String e = Coder.decode("E", 7);
        assertEquals("X", e);
        String iuhur5 = Coder.decode("BTWQI", 5);
        assertEquals("WORLD", iuhur5);
    }
}
