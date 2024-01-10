package Tools;

import Domain.Utilizador;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CSVLoginReaderTest {
    private CSVLoginReader csvLoginReader;
    @BeforeEach
    void setUp(){
        csvLoginReader = new CSVLoginReader("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/QA_SofiaCarvalho/src/test/resources/login_grandesNegociosTest.csv");
    }

    @Test
    void readCSVToRepositoryTest() throws FileNotFoundException {

        ArrayList<Utilizador> arrayUsers = csvLoginReader.readCSVToRepository();

        assertEquals(11, arrayUsers.size());
        assertEquals("cesae",arrayUsers.get(10).getPassword());
    }


}