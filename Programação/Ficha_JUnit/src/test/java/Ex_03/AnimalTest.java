package Ex_03;

import Ex_01.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    private Animal cao;

    @BeforeEach
    public void setUp() {
        cao = new Animal("boby",Alimento.CARNE);
    }

    @Test
    public void getNomeTest(){
        assertEquals("boby", cao.getNome());
    }

    public void isComFomeTest(){
        assertTrue(cao.isComFome());
    }

    public void getTipoAlimentacaoTest(){
        assertEquals(Alimento.CARNE,cao.getTipoAlimentacao());
    }

    public void comerTest(){
        assertEquals("boby comeu CARNE.", cao.comer(Alimento.CARNE));
    }
}
