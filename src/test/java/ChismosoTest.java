import tics.itess.domain.Chismoso;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChismosoTest {

    @Test
    public void testConstructorAndGetters() {
        Chismoso chismoso = new Chismoso("Buen promedio");

        assertEquals("Buen promedio", chismoso.getInformacionAcademica());
    }

    @Test
    public void testSetters() {
        Chismoso chismoso = new Chismoso("Buen promedio");
        chismoso.setInformacionAcademica("Reprobó matemáticas");

        assertEquals("Reprobó matemáticas", chismoso.getInformacionAcademica());
    }
}
