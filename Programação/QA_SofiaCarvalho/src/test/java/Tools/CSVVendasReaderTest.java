package Tools;

import Domain.Utilizador;
import Domain.Venda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CSVVendasReaderTest {

    private CSVVendasReader csvVendasReader;
    @BeforeEach
    void setUp() {
       csvVendasReader = new CSVVendasReader("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/QA_SofiaCarvalho/src/test/resources/minimercadoTest.csv");
    }

    @Test
    void readCSVToRepositoryTest() throws FileNotFoundException {
        ArrayList<Venda> arrayVendas = csvVendasReader.readCSVToRepository();

        assertEquals(10, arrayVendas.size());
        assertEquals("Alimentacao",arrayVendas.get(0).getTipoProduto());
    }
}