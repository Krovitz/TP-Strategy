package ejercicio2;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FormatoLargo implements FormatoFechaNacimiento {
    @Override
    public String formatear(LocalDate fecha) {
        String mes = fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("es"));
        return fecha.getDayOfMonth() + " de " + capitalize(mes) + " de " + fecha.getYear();
    }

    private String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
