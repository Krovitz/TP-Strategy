package ejercicio3;

//Podria aplicar Method Template para evitar codigo duplicado

public class CalculadorOtro implements CalculadorDePrecio {
    @Override
    public double calcularPrecio(double precio) {
        double impuestos = 0.15;
        double descuentos = (precio > 50) ? 0.05 : 0;
        boolean envioGratis = precio > 200;
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) total -= 10;
        return total;
    }
}
