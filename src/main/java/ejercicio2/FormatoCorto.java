package ejercicio2;

import java.time.LocalDate;

public class FormatoCorto implements FormatoFechaNacimiento {

    @Override
    public String formatear(LocalDate fecha) {
        return fecha.getDayOfMonth() + "-" + fecha.getMonthValue() + "-" + fecha.getYear();
    }
}
