package Ex_03;

import Ex_01.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    private Animal boby;
    private Animal tareco;
    private Animal rafeiro;
    private Animal lucky;

    @BeforeEach
    public void setUp() {
        boby = new Animal("boby",Alimento.CARNE);
        tareco = new Animal("tareco",Alimento.PEIXE);
        rafeiro = new Animal("rafeiro", Alimento.FRUTAS);
        lucky = new Animal("lucky", Alimento.VEGETAIS);
    }



    @Test
    public void getNomeTest(){
        assertEquals("boby", boby.getNome());
        assertEquals("tareco", tareco.getNome());
        assertEquals("rafeiro", rafeiro.getNome());
        assertEquals("lucky", lucky.getNome());
    }

    @Test
    public void isComFomeTest(){
        assertTrue(boby.isComFome());
        boby.comer(Alimento.CARNE);
        assertFalse(boby.isComFome());

        assertTrue(tareco.isComFome());
        tareco.comer(Alimento.CARNE);
        assertTrue(tareco.isComFome());


    }

    @Test
    public void getTipoAlimentacaoTest(){
        assertEquals(Alimento.CARNE,boby.getTipoAlimentacao());
        assertEquals(Alimento.PEIXE,tareco.getTipoAlimentacao());
        assertEquals(Alimento.FRUTAS,rafeiro.getTipoAlimentacao());
        assertEquals(Alimento.VEGETAIS, lucky.getTipoAlimentacao());
    }


}
