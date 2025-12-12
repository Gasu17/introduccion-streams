package com.ivancorrales.streams.numbers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberStreamsKataTest {

    private final NumberStreamsKata kata = new NumberStreamsKata();

    @Test
    void soloPositivos() {
        assertEquals(
                List.of(15, 42, 7, 42, 100, 3, 18, 60, 60, 1),
                kata.soloPositivos()
        );
    }

    @Test
    void positivosOrdenados() {
        assertEquals(
                List.of(1, 3, 7, 15, 18, 42, 42, 60, 60, 100),
                kata.positivosOrdenados()
        );
    }

    @Test
    void positivosUnicosOrdenados() {
        assertEquals(
                List.of(1, 3, 7, 15, 18, 42, 60, 100),
                kata.positivosUnicosOrdenados()
        );
    }

    @Test
    void top3UnicosDesc() {
        assertEquals(
                List.of(100, 60, 42),
                kata.top3UnicosDesc()
        );
    }

    @Test
    void sumaPositivos() {
        assertEquals(348, kata.sumaPositivos());
    }

    @Test
    void primerMultiploDe6Omenos1() {
        assertEquals(42, kata.primerMultiploDe6Omenos1());
    }

    @Test
    void hayLegendario() {
        assertTrue(kata.hayLegendario());
    }

    @Test
    void mediaPositivos() {
        assertEquals(34.8, kata.mediaPositivos(), 1e-9);
    }

    @Test
    void rangoPositivos() {
        assertEquals(99, kata.rangoPositivos()); // 100 - 1
    }

    @Test
    void todasLasRondasEnUnaLista() {
        assertEquals(
                List.of(10, 20, -5, 42, 7, 100, 0, 5, 18, 60, 60),
                kata.todasLasRondasEnUnaLista()
        );
    }

    @Test
    void top5UnicosPositivosDeTodasLasRondas() {
        assertEquals(
                List.of(100, 60, 42, 20, 18),
                kata.top5UnicosPositivosDeTodasLasRondas()
        );
    }

    @Test
    void sumaPositivosDeTodasLasRondas() {
        assertEquals(322, kata.sumaPositivosDeTodasLasRondas());
    }
}