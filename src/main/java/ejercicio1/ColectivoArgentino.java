package ejercicio1;

import java.util.List;

public class ColectivoArgentino implements EnvioDeProductos {
    private CostoDistancia calculadorDeDistancia;

    public ColectivoArgentino(CostoDistancia calculadorDeDistancia) {
        this.calculadorDeDistancia = calculadorDeDistancia;
    }


    @Override
    public double calcularEnvio(List<Producto> productos, String lugarEnvio) {
        double costoEnvio = 800;
        int pesoTotal = 0;
        if (lugarEnvio.equals("Capital Federal"))
            costoEnvio = 500;

        return costoEnvio + 5 * calculadorDeDistancia.calcularDistancia(lugarEnvio);
    }
}
