import tics.itess.domain.FJMP;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FJMPTest {

    @Test
    public void testConstructorAndGetters() {
        FJMP fjmp = new FJMP("Excelente en programación");

        assertEquals("Excelente en programación", fjmp.getSeguimientoHabilidades());
    }

    @Test
    public void testSetters() {
        FJMP fjmp = new FJMP("Excelente en programación");
        fjmp.setSeguimientoHabilidades("Necesita mejorar en bases de datos");

        assertEquals("Necesita mejorar en bases de datos", fjmp.getSeguimientoHabilidades());
    }
}
