package Ex_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTest {
    private Retangulo quadrado;
    private Retangulo retangulo;

    @BeforeEach
    void setUp() {
        quadrado = new Retangulo(4,4);
        retangulo = new Retangulo(5,3);
    }

    @Test
    void calcularAreaTest() {
        assertEquals(16,quadrado.calcularPerimetro());
        assertEquals(15,retangulo.calcularPerimetro());
    }

    @Test
    void calcularPerimetroTest() {
        assertEquals(16,quadrado.calcularArea());
        assertEquals(16,retangulo.calcularArea());
    }
}
