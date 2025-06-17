package ejercicio1;

import java.util.List;

public class ColectivoSur implements EnvioDeProductos {

    @Override
    public double calcularEnvio(List<Producto> productos, String lugarEnvio) {
        double costoEnvio = 3000;
        int pesoTotal = 0;
        if (lugarEnvio.equals("Capital Federal"))
            costoEnvio = 1000;
        if (lugarEnvio.equals("Gran Buenos Aires"))
            costoEnvio = 1500;

        for (Producto p : productos) {
            pesoTotal += p.peso();
        }
        if (pesoTotal > 5 && pesoTotal < 30)
            costoEnvio += 500;
        if (pesoTotal > 30)
            costoEnvio += 2000;

        return costoEnvio;
    }
}
