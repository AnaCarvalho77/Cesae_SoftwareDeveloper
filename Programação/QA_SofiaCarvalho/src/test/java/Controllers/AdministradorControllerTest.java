package Controllers;

import Domain.Utilizador;
import Domain.Venda;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorControllerTest {
    private AdministradorController administradorController;
    private LoginController loginController;
    private String ficheiroPath = "/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/QA_SofiaCarvalho/src/test/resources/login_grandesNegociosTest.csv";

    private String ficheiroPathOriginal = "/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/QA_SofiaCarvalho/src/test/resources/login_grandesNegociosTestOriginal.csv";

    @BeforeEach
    void setUp() throws FileNotFoundException {
        administradorController = new AdministradorController("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/QA_SofiaCarvalho/src/test/resources/minimercadoTest.csv");
    }

    @Test
    void produtoMaisVendidoTest() {
        assertEquals("Produtos para Casa", administradorController.produtoMaisVendido().getTipoProduto());
        assertEquals("Cerveja Super Bock", administradorController.produtoQueMaisVendeu().getProduto());
    }

    @Test
    void produtoQueMaisVendeuTest() {
        assertEquals("Produtos para Casa", administradorController.produtoMaisVendido().getTipoProduto());
        assertEquals("Luvas de Borracha", administradorController.produtoMaisVendido().getProduto());
    }

    @Test
    void vendaMaisValorTest() {
        assertEquals("Produtos para Casa", administradorController.vendaMaisValor().getTipoProduto());
        assertEquals("Luvas de Borracha", administradorController.vendaMaisValor().getProduto());
    }

    @Test
    void valorVendasTest() {
        assertEquals(2457.11,administradorController.valorVendas());
    }

    @Test
    void mediaVendasTest() {
        assertEquals(245.711,administradorController.mediaVendas());
    }

    @Test
    void adicionarUtilizadorValidoTest() throws IOException {
        loginController = new LoginController(ficheiroPath);

        assertFalse(loginController.validarLogin("ADMIN","ana","ana"));


        administradorController.adicionarUtilizador("ADMIN","ana","ana", ficheiroPath);
        loginController = new LoginController(ficheiroPath);

        assertTrue(loginController.validarLogin("ADMIN","ana","ana"));

        File file = new File(ficheiroPath);
        Scanner scanner = new Scanner(file);

         String tipoUtilizador="";
         String username = "";
         String password = "";

         while(scanner.hasNextLine()) {
             String linha = scanner.nextLine();
             String[] linhaSeparada = linha.split(";");

             tipoUtilizador = linhaSeparada[0];
             username = linhaSeparada[1];
             password = linhaSeparada[2];
         }

         assertEquals("ADMIN",tipoUtilizador);
         assertEquals("ana",username);
         assertEquals("ana",password);
    }
    @Test
    void adicionarUtilizadorInvalidoTest() throws IOException {
        loginController = new LoginController(ficheiroPath);

        assertFalse(loginController.validarLogin("CLIENTE","ana","ana"));


        administradorController.adicionarUtilizador("CLIENTE","ana","ana", ficheiroPath);
        loginController = new LoginController(ficheiroPath);

        //Deixou criar tipo de utilizador sem ser ADMIN ou FUNC, para tal o código teria de prever só tipo_conta válidos através de um ENUM por exemplo
        assertTrue(loginController.validarLogin("CLIENTE","ana","ana"));

        File file = new File(ficheiroPath);
        Scanner scanner = new Scanner(file);

        String tipoUtilizador="";
        String username = "";
        String password = "";

        while(scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] linhaSeparada = linha.split(";");

            tipoUtilizador = linhaSeparada[0];
            username = linhaSeparada[1];
            password = linhaSeparada[2];
        }

        assertNotEquals("cliente",tipoUtilizador);
        assertNotEquals("",username);
        assertNotEquals("132654",password);




    }
    @AfterEach
    void tearDown() throws IOException {
        File fileOriginal = new File(this.ficheiroPathOriginal);
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