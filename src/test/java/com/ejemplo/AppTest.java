package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testSumar() {
        App app = new App();
        int resultado = app.sumar(2, 3);
        assertEquals(5, resultado, "El resultado de la suma debe ser 5");
    }
}