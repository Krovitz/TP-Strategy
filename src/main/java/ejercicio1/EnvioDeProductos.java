package ejercicio1;

import java.util.List;

public interface EnvioDeProductos {
    public double calcularEnvio(List<Producto> productos, String lugarEnvio);
}
