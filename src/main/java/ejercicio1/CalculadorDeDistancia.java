package ejercicio1;

import java.util.concurrent.ThreadLocalRandom;

public class CalculadorDeDistancia implements CostoDistancia {

    @Override
    public int calcularDistancia(String destino) {
        if (destino.equals("Capital Federal"))
            return 0;
        return ThreadLocalRandom.current().nextInt(100, 5001); // 5001 porque el límite superior es exclusivo
    }

}
