package ejercicio1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var calculador = new Calculador(new ColectivoSur());
        var carrito = new ArrayList<Producto>();

        carrito.addAll(List.of(new Producto("Televisor", 20, 80000),
                new Producto("Celular", 6, 60000),
                new Producto("Play 5", 13, 1000000)));

        calculador.calcularPrecioFinal(carrito, "Gran Buenos Aires");

    }
}