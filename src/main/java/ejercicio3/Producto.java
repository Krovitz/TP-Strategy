package ejercicio3;

public class Producto {
    private double precio;
    private CalculadorDePrecio calculador;

    public Producto(double precio, CalculadorDePrecio calculador) {
        this.precio = precio;
        this.calculador = calculador;
    }

    public double precioFinal() {
        return calculador.calcularPrecio(precio);
    }
}

