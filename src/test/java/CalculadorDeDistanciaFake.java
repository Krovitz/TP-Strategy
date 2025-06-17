import ejercicio1.CostoDistancia;

public class CalculadorDeDistanciaFake implements CostoDistancia {
    @Override
    public int calcularDistancia(String destino) {
        if (destino.equals("Capital Federal"))
            return 0;
        return 200; // 200 kilometros
    }
}
