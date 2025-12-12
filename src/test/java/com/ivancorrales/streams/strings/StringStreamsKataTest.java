package com.ivancorrales.streams.strings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringStreamsKataTest {

    private final StringStreamsKata kata = new StringStreamsKata();

    @Test
    void paisesQueTerminanEnA() {
        assertEquals(
                List.of("Italia", "España", "Irlanda", "Noruega", "Francia"),
                kata.paisesQueTerminanEnA()
        );
    }

    @Test
    void paisesQueTerminanEnAOrdenados() {
        assertEquals(
                List.of("España", "Francia", "Irlanda", "Italia", "Noruega"),
                kata.paisesQueTerminanEnAOrdenados()
        );
    }

    @Test
    void paisesMinusculasUnicosOrdenados() {
        assertEquals(
                List.of("españa", "francia", "irlanda", "italia", "noruega", "portugal"),
                kata.paisesMinusculasUnicosOrdenados()
        );
    }

    @Test
    void usuariosNormalizadosSinRepetir() {
        assertEquals(
                List.of("noa", "leo", "ana", "mario"),
                kata.usuariosNormalizadosSinRepetir()
        );
    }

    @Test
    void hashtagsUnicosOrdenados() {
        assertEquals(
                List.of("#dam", "#fp", "#java", "#streams"),
                kata.hashtagsUnicosOrdenados()
        );
    }

    @Test
    void sumaLetrasPaisesEnA() {
        // italia(6) + españa(6) + irlanda(7) + noruega(7) + francia(7) = 33
        assertEquals(33, kata.sumaLetrasPaisesEnA());
    }

    @Test
    void mediaLongitudHashtagsUnicos() {
        // hashtags únicos: #dam(4), #fp(3), #java(5), #streams(8) => media = 5.0
        assertEquals(5.0, kata.mediaLongitudHashtagsUnicos(), 1e-9);
    }

    @Test
    void longitudMaximaHashtag() {
        // el más largo es "#streams" (8)
        assertEquals(8, kata.longitudMaximaHashtag());
    }

    @Test
    void comentariosUnicosLimpiosOrdenados() {
        assertEquals(
                List.of("brutal", "buenísimo", "gracias!", "me sirve", "sin comentarios", "top"),
                kata.comentariosUnicosLimpiosOrdenados()
        );
    }

    @Test
    void hashtagsUnicosDesdeComas() {
        assertEquals(
                List.of("#dam", "#fp", "#java", "#streams"),
                kata.hashtagsUnicosDesdeComas()
        );
    }
}