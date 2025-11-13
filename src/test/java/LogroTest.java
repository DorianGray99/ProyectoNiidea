import tics.itess.domain.Logro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LogroTest {

    @Test
    public void testConstructorAndGetters() {
        Logro logro = new Logro(1, "", "");

        assertEquals(1, logro.getId());
        assertEquals("", logro.getCategoria());
        assertEquals("", logro.getDescripcion());
    }

    @Test
    public void testSetters() {
        Logro logro = new Logro(1, "", "");
        logro.setId(2);
        logro.setCategoria("");
        logro.setDescripcion("");

        assertEquals(2, logro.getId());
        assertEquals("", logro.getCategoria());
        assertEquals("", logro.getDescripcion());
    }
}
