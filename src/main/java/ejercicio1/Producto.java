package ejercicio1;

public class Producto {
    private String nombre;
    private int pesoEnKilogramos;
    private double precio;

    public Producto(String nombre, int pesoEnKilogramos, double precio) {
        this.nombre = nombre;
        this.pesoEnKilogramos = pesoEnKilogramos;
        this.precio = precio;
    }


    public int peso() {
        return pesoEnKilogramos;
    }

    public double precio() {
        return precio;
    }

    public String nombre() {
        return nombre;
    }
}
