import tics.itess.domain.Portafolio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PortafolioTest {

    @Test
    public void testConstructorAndGetters() {
        Portafolio portafolio = new Portafolio("Sistema de control escolar");

        assertEquals("Sistema de control escolar", portafolio.getProyectos());
    }

    @Test
    public void testSetters() {
        Portafolio portafolio = new Portafolio("Sistema de control escolar");
        portafolio.setProyectos("Aplicación móvil");

        assertEquals("Aplicación móvil", portafolio.getProyectos());
    }
}
