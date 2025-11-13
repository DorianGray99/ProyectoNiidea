 import tics.itess.domain.Alumno;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlumnoTest {

    @Test
    public void testConstructorAndGetters() {
        Alumno alumno = new Alumno("", "");

        assertEquals("", alumno.getNombre());
        assertEquals("", alumno.getNivel());
    }

    @Test
    public void testSetters() {
        Alumno alumno = new Alumno("", "");
        alumno.setNombre("");
        alumno.setNivel("");

        assertEquals("", alumno.getNombre());
        assertEquals("", alumno.getNivel());
    }
}
