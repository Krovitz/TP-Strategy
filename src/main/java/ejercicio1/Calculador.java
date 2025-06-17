package ejercicio1;

import java.util.List;

public class Calculador {
    private EnvioDeProductos costoEnvio;

    public Calculador(EnvioDeProductos costoEnvio) {
        this.costoEnvio = costoEnvio;
    }


    public double calcularPrecioFinal(List<Producto> productos, String lugarEnvio) {
        double total = 0;
        for (Producto p : productos) {
            total += p.precio();
        }
        return total + costoEnvio.calcularEnvio(productos, lugarEnvio);
    }
}
