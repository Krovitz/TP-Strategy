import ejercicio1.Calculador;
import ejercicio1.ColectivoArgentino;
import ejercicio1.ColectivoSur;
import ejercicio1.Producto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {

    @Test
    public void calcularCostoColectivoSur() {
        var listaProductos = List.of(new Producto("producto 1", 5, 20000),
                new Producto("producto 2", 10, 10000));
        var calculador = new Calculador(new ColectivoSur());

        assertEquals(31500, calculador.calcularPrecioFinal(listaProductos, "Capital Federal"));
    }

    @Test
    public void calcularCostoColectivoSurPesaMas30Kg() {
        var listaProductos = List.of(new Producto("producto 1", 25, 20000),
                new Producto("producto 2", 10, 10000));
        var calculador = new Calculador(new ColectivoSur());

        assertEquals(33000, calculador.calcularPrecioFinal(listaProductos, "Capital Federal"));
    }

    @Test
    public void calcularCostoColectivoArgentinoCapitalFederal() {
        var listaProductos = List.of(new Producto("producto 1", 5, 20000),
                new Producto("producto 2", 10, 10000));
        var calculador = new Calculador(new ColectivoArgentino(new CalculadorDeDistanciaFake()));

        assertEquals(30500, calculador.calcularPrecioFinal(listaProductos, "Capital Federal"));
    }

    @Test
    public void calcularCostoColectivoArgentinoOtroDestino() {
        var listaProductos = List.of(new Producto("producto 1", 5, 20000),
                new Producto("producto 2", 10, 10000));
        var calculador = new Calculador(new ColectivoArgentino(new CalculadorDeDistanciaFake()));

        assertEquals(31800, calculador.calcularPrecioFinal(listaProductos, "Viedma"));
    }
}
