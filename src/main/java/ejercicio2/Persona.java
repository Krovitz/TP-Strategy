package ejercicio2;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private FormatoFechaNacimiento formato;

    public Persona(String nombre, LocalDate fechaNacimiento, FormatoFechaNacimiento formato) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.formato = formato;
    }

    public String fechaNacimiento() {
        return formato.formatear(fechaNacimiento);
    }

    public void cambiarFormato(FormatoFechaNacimiento nuevoFormato) {
        this.formato = nuevoFormato;
    }
}

