package modelo; // Cambiado para que coincida con tu carpeta 'modelo'

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Importamos la clase Modelo desde su paquete original
import modelo.Modelo; 

class ModeloTest {

    @Test
    void testFactorial() {
        Modelo m = new Modelo();
        // Verifica el factorial de 5 (debe ser 120)
        assertEquals(120, m.calculatef(5), "El factorial de 5 debe ser 120");
    }

    @Test
    void testExponente() {
        Modelo m = new Modelo();
        // Verifica 2 elevado a 3 (debe ser 8)
        assertEquals(8.0, m.calculatee(2, 3), "2 elevado a 3 debe ser 8");
    }
}