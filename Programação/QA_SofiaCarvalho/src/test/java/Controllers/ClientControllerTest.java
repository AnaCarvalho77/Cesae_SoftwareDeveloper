package Controllers;

import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClientControllerTest {
    private ClientController clientController;
    private ArrayList<Venda> vendas;
    @BeforeEach
    void setUp() throws FileNotFoundException {
        clientController = new ClientController("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/QA_SofiaCarvalho/src/test/resources/minimercadoTest.csv");

    }

    @Test
    void produtoMaisCaroTest() {
        assertEquals("Polvo",clientController.produtoMaisCaro().getProduto());
        assertEquals(25.99,clientController.produtoMaisCaro().getPrecoUnitario());
    }

    @Test
    void produtosDisponiveisSemDuplicadosTest() {
        assertEquals(9, clientController.produtosDisponiveisSemDuplicados().size());
        //Sem duplicados o "ambientador" tem de estar na posicao anterior
        assertEquals("Ambientador",clientController.produtosDisponiveisSemDuplicados().get(5).getProduto());
    }

    @Test
    void produtosDeCategoriaTest() {
        assertEquals(3,clientController.produtosDeCategoria("Alimentacao").size());
        assertEquals(3,clientController.produtosDeCategoria("Higiene").size());
        //Por categoria o "Cabrito" é o segundo elemento de Alimentação, logo na posição 1
        assertEquals("Cabrito",clientController.produtosDeCategoria("Alimentacao").get(1).getProduto());
    }

    @Test
    void produtoMaisBaratoTest() {
        assertEquals("Cerveja Super Bock",clientController.produtoMaisBarato().getProduto());
        assertEquals(0.99, clientController.produtoMaisBarato().getPrecoUnitario());
    }
}