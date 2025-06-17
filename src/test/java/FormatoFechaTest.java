import ejercicio2.FormatoCorto;
import ejercicio2.FormatoLargo;
import ejercicio2.Persona;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatoFechaTest {

    @Test
    public void fechaNacimientoFormatoCorto() {
        Persona persona = new Persona("Juan", LocalDate.of(1986, 6, 3), new FormatoCorto());
        assertEquals("3-6-1986", persona.fechaNacimiento());
    }

    @Test
    public void fechaNacimientoFormatoLargo() {
        Persona persona = new Persona("Ana", LocalDate.of(1986, 6, 3), new FormatoLargo());
        assertEquals("3 de Junio de 1986", persona.fechaNacimiento());
    }
}
