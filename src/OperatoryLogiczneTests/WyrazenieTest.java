import static org.junit.Assert.*;

import OperatoryLogiczne.False;
import OperatoryLogiczne.True;
import OperatoryLogiczne.Wyrazenie;
import OperatoryLogiczne.Zmienna;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WyrazenieTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void tak() {
        Wyrazenie t = dajTak();
        assertEquals("1", t.toString());
        assertEquals(true, t.oblicz(false));
        assertEquals(true, t.and(t).oblicz(false));
    }

    @Test
    public void nie() {
        Wyrazenie n  = dajNie();
        assertEquals("0", n.toString());
        assertEquals(false, n.oblicz(true));
        assertEquals(false, n.and(n).oblicz(true));
    }

    @Test
    public void and() {
        Wyrazenie t = dajTak();
        Wyrazenie n = dajNie();
        assertEquals("1", t.and(t).toString());
        assertEquals("0", n.and(n).toString());
        assertEquals("0", n.and(t).toString());
        assertEquals("0", t.and(n).toString());


        assertEquals(true, t.and(t).oblicz(true));
        assertEquals(false, n.and(n).oblicz(false));
        assertEquals(false, t.and(n).oblicz(true));
    }

    @Test
    public void or() {
        Wyrazenie t = dajTak();
        Wyrazenie n = dajNie();
        assertEquals("1", t.or(t).toString());
        assertEquals("0", n.or(n).toString());
        assertEquals("1", n.or(t).toString());
        assertEquals("1", t.or(n).toString());


        assertEquals(true, t.or(t).oblicz(true));
        assertEquals(false, n.or(n).oblicz(false));
        assertEquals(true, t.or(n).oblicz(true));
    }

    @Test
    public void priorytet() {
        Wyrazenie x = dajZmienna();
        assertEquals("x&(x||x)", x.and(x.or(x)).toString() );
        assertEquals("(x||x)&x", x.or(x).and(x).toString() );
        assertEquals("!(x&(x^x))", x.and(x.xor(x)).not().toString());
        assertEquals("x&((x^!x)&x)||x", x.and(x.xor(x.not()).and(x)).or(x).toString());
    }

    @Test
    public void zmienna() {
        Wyrazenie x = dajZmienna();
        assertEquals("x", x.toString() );
        assertEquals("x&x", x.and(x).toString());
        assertEquals("x&1", x.and(dajTak()).toString());
        assertEquals(true, x.and(x).oblicz(true));
    }

    @Test
    public void not() {
        Wyrazenie x = dajZmienna();
        Wyrazenie n = dajNie();

        assertEquals(true, n.not().oblicz(true ));
        assertEquals("1", n.not().toString());
        assertEquals("!x", x.not().toString());
        assertEquals("x||!(x&x)", x.or(x.and(x).not()).toString());
        assertEquals(true, x.or(x.and(x).not()).oblicz(false));
        assertEquals("x", x.not().not().toString());
    }

    @Test
    public void xor() {
        Wyrazenie x = dajZmienna();
        Wyrazenie n = dajNie();
        Wyrazenie t = dajTak();

        assertEquals("0", n.xor(n).toString());
        assertEquals("1", n.xor(t).toString());
        assertEquals("x^0", x.xor(n).toString());
        assertEquals("x^(x^1)", x.xor(x.xor(t)).toString());
        assertEquals(false, n.xor(n).oblicz(true));
        assertEquals(true, x.xor(x.xor(t)).oblicz(true));
    }

    private Wyrazenie dajTak() {
        return True.daj();
    }

    private Wyrazenie dajNie() {
        return False.daj();
    }

    private Wyrazenie dajZmienna() {
        return Zmienna.daj();
    }
}