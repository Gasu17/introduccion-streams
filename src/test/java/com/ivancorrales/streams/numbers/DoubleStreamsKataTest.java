package com.ivancorrales.streams.numbers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleStreamsKataTest {

    private final DoubleStreamsKata kata = new DoubleStreamsKata();

    @Test
    void tiemposPositivos() {
        assertEquals(
                List.of(2.5, 1.2, 3.0, 2.5, 4.75, 1.2),
                kata.tiemposPositivos()
        );
    }

    @Test
    void tiemposPositivosUnicosOrdenados() {
        assertEquals(
                List.of(1.2, 2.5, 3.0, 4.75),
                kata.tiemposPositivosUnicosOrdenados()
        );
    }

    @Test
    void top2TiemposUnicosDesc() {
        assertEquals(
                List.of(4.75, 3.0),
                kata.top2TiemposUnicosDesc()
        );
    }

    @Test
    void mediaTiemposPositivos() {
        // (2.5 + 1.2 + 3.0 + 2.5 + 4.75 + 1.2) / 6 = 2.525
        assertEquals(2.525, kata.mediaTiemposPositivos(), 1e-9);
    }

    @Test
    void sumaMilisegundosRedondeados() {
        // 2.5->2500, 1.2->1200, 3.0->3000, 2.5->2500, 4.75->4750, 1.2->1200 => 15150
        assertEquals(15150, kata.sumaMilisegundosRedondeados());
    }

    @Test
    void preciosRedondeadosOrdenados() {
        // >=0: 9.999->10.0, 10.0->10.0, 4.555->4.56, 4.554->4.55, 12.345->12.35
        assertEquals(
                List.of(4.55, 4.56, 10.0, 10.0, 12.35),
                kata.preciosRedondeadosOrdenados()
        );
    }

    @Test
    void precioMaximo() {
        // max entre >=0 (sin redondear) es 12.345
        assertEquals(12.345, kata.precioMaximo(), 1e-9);
    }

    @Test
    void todosLosTiemposDeTodasLasSesiones() {
        assertEquals(
                List.of(1.2, 2.5, -0.5, 4.75, 1.2, 3.0, 2.5),
                kata.todosLosTiemposDeTodasLasSesiones()
        );
    }

    @Test
    void mediaTiemposPositivosDeTodasLasSesiones() {
        // positivos: 1.2, 2.5, 4.75, 1.2, 3.0, 2.5  => suma 15.15 / 6 = 2.525
        assertEquals(2.525, kata.mediaTiemposPositivosDeTodasLasSesiones(), 1e-9);
    }
}