package com.ivancorrales.streams.objects;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ObjectStreamsKataTest {

    private final ObjectStreamsKata kata = new ObjectStreamsKata();

    @Test
    void contarRecomendadas() {
        // >= 4.5: Midnight Run, Refactor, Streams Day, Refactor (repetida) => 4
        assertEquals(4, kata.contarRecomendadas());
    }

    @Test
    void titulosDeArtista() {
        assertEquals(List.of("Campus Life", "Streams Day"),
                kata.titulosDeArtista("Leo"));

        assertEquals(List.of("Midnight Run", "Refactor", "Refactor"),
                kata.titulosDeArtista("Noa"));
    }

    @Test
    void titulosRecomendadosUnicosOrdenados() {
        assertEquals(List.of("Midnight Run", "Refactor", "Streams Day"),
                kata.titulosRecomendadosUnicosOrdenados());
    }

    @Test
    void top2PorRatingLuegoDuracion() {
        // Distinct elimina la repetida.
        // Orden por rating desc y luego seconds desc:
        // Refactor (4.9,240), Streams Day (4.7,195), Midnight Run (4.6,210), ...
        assertEquals(List.of("Refactor", "Streams Day"),
                kata.top2PorRatingLuegoDuracion());
    }

    @Test
    void duracionTotal() {
        // Incluye repetida:
        // 210 + 180 + 240 + 200 + 195 + 240 + 230 = 1495
        assertEquals(1495, kata.duracionTotal());
    }

    @Test
    void mediaRatingPlaylist() {
        // (4.6 + 4.1 + 4.9 + 3.8 + 4.7 + 4.9 + 4.2) / 7 = 4.457142857142857
        assertEquals(4.457142857142857, kata.mediaRatingPlaylist(), 1e-12);
    }

    @Test
    void csvTitulosBuenosOrdenados() {
        // rating >= 4.0, distinct, orden por artista y luego título, y luego solo títulos:
        // Ana: Clean Code
        // Leo: Campus Life, Streams Day
        // Noa: Midnight Run, Refactor
        assertEquals("Clean Code, Campus Life, Streams Day, Midnight Run, Refactor",
                kata.csvTitulosBuenosOrdenados());
    }

    // -------------------- EXTRAS --------------------

    @Test
    void hayCancionLarga() {
        // Hay canciones de 240 segundos
        assertTrue(kata.hayCancionLarga());
    }

    @Test
    void tituloCancionMasCorta() {
        // Más corta: Campus Life (180)
        assertEquals("Campus Life", kata.tituloCancionMasCorta());
    }

    @Test
    void top3DeArtistaPorRating() {
        // Noa: Midnight Run (4.6), Refactor (4.9) (repetida)
        // Sin repetidos => Refactor, Midnight Run (orden rating desc y luego título asc)
        assertEquals(List.of("Refactor", "Midnight Run"),
                kata.top3DeArtistaPorRating("Noa"));

        // Ana: Clean Code (4.2), Bug Hunter (3.8) => top3 => Clean Code, Bug Hunter
        assertEquals(List.of("Clean Code", "Bug Hunter"),
                kata.top3DeArtistaPorRating("Ana"));

        // Artista inexistente => lista vacía
        assertEquals(List.of(),
                kata.top3DeArtistaPorRating("Zoe"));
    }

    @Test
    void duracionMaximaDeBuenas() {
        // rating >= 4.0: 210, 180, 240, 195, 240, 230 -> max = 240
        assertEquals(240, kata.duracionMaximaDeBuenas());
    }

    @Test
    void artistasUnicosOrdenados() {
        assertEquals(List.of("Ana", "Leo", "Noa"),
                kata.artistasUnicosOrdenados());
    }
}