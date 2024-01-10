package Controllers;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioControllerTest {
    FuncionarioController funcionarioController;
    static String ficheiroPath = "/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/QA_SofiaCarvalho/src/test/resources/minimercadoTest.csv";
    static String ficheiroPathOriginal="/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/QA_SofiaCarvalho/src/test/resources/minimercadoTestOriginal.csv";
    @BeforeEach
    void setUp() throws FileNotFoundException {
        funcionarioController = new FuncionarioController(ficheiroPath);
    }

    @Test
    void addVendaTest() throws IOException {
        funcionarioController.addVenda("Alimentacao","Bifes", 13,4.99,ficheiroPath);
        funcionarioController.addVenda("Coisas","Coisinha",12,1.99,ficheiroPath);
    }

    @Test
    void consultarStockProdutoTest() throws FileNotFoundException {
        assertEquals(1191,funcionarioController.consultarStockProduto("Cabrito"));
        assertEquals(1187,funcionarioController.consultarStockProduto("Bifes"));
        //Este teste passa mas poderia ser alterado o programa só para aceitar determinados tipos de produtos como por exemplo existir um ENUM para os tipos de produtos
        assertEquals(1188,funcionarioController.consultarStockProduto("Coisinha"));

    }

    @AfterAll //fiz um afterAll para poder testar stock dos meus produtos adicionados porque assim também comprovo que foram adicionados
    static void tearDown() throws IOException {
        File fileOriginal = new File(ficheiroPathOriginal);
        Scanner scanner = new Scanner(fileOriginal);

        File fileAlterado = new File(ficheiroPath);
        FileWriter fW = new FileWriter(fileAlterado);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            fW.write(linha);
            if(scanner.hasNextLine())
                fW.write("\n");
        }
        fW.close();
    }
}