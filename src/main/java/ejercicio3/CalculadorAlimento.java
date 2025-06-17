package ejercicio3;

public class CalculadorAlimento implements CalculadorDePrecio {
    @Override
    public double calcularPrecio(double precio) {
        double impuestos = 0.05;
        double descuentos = (precio > 100) ? 0.15 : 0;
        boolean envioGratis = precio > 200;
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) total -= 10;
        return total;
    }
}
