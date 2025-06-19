package com.mycompany.mavenproject1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba para Mavenproject1.
 */
class Mavenproject1Test {
    @Test
    void testSumar() {
        assertEquals(5, Mavenproject1.sumar(2, 3));
    }
} 