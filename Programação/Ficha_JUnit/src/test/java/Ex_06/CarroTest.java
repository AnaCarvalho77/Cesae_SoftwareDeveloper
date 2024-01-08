package Ex_06;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    private Carro carro1;
    private Carro carro2;
    private Carro carro3;
    private Carro carro4;
    private Carro carro5;
    private Carro carro0;
    private Carro carro01;

    @BeforeEach
    void setUp() {
        carro1 = new Carro("toyota", "yaris",1987,90.00,1400.00,5.50,TipoCombustivel.GASOLEO);
        carro2 = new Carro("opel", "corsa",1987,110,1600,7,TipoCombustivel.GASOLINA);
        carro3 = new Carro("dacia", "duster", 2021,260,1600,5,TipoCombustivel.GPL);
        carro4 = new Carro("opel", "corsa",2021,110,1700,7,TipoCombustivel.GASOLINA);
        carro5 = new Carro("opel", "corsa",2022,110,1700,7,TipoCombustivel.GASOLINA);
        carro0 = new Carro();
        carro01 = new Carro();

    }

    @Test
    void corrida() {
        carro0.ligar();
        carro1.ligar();
        carro1.ligar(2024);
        carro2.ligar(2024);
        carro3.ligar();
        carro3.ligar(2024);
        carro4.ligar(2024);
        assertEquals(carro2,carro1.corrida(carro2,2024));
        assertEquals(carro3, carro3.corrida(carro2,2024));
        assertEquals(carro4, carro2.corrida(carro4,2024));
        assertEquals(carro4,carro4.corrida(carro2,2024));
        assertEquals(carro4, carro4.corrida(carro5,2024));
        assertEquals(carro4, carro5.corrida(carro4,2024));
        assertEquals(null, carro0.corrida(carro01,2024));
        carro1.exibirDetalhes();
    }

    @Test
    void getMarca() {
        assertEquals("toyota",carro1.getMarca());
        assertEquals("opel",carro2.getMarca());
    }

    @Test
    void valorConsumido() {
        assertEquals(5.50,carro1.valorConsumido(100));
        assertEquals(15.4,carro2.valorConsumido(220));
    }

}