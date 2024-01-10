package Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilizadorTest {

    private Utilizador adminPatrao;
    private Utilizador funcLara;


    @BeforeEach
    void setUp() {
        adminPatrao = new Utilizador("ADMIN","patrao","grandesnegocios");
        funcLara = new Utilizador("FUNC", "lara","bolinhosDeChocolate");
    }

    @Test
    void getTipoContaTest() {
        assertEquals("ADMIN",adminPatrao.getTipoConta());
        assertEquals("FUNC", funcLara.getTipoConta());
        assertNotEquals("CLIENTE",funcLara.getTipoConta());
        assertNotEquals("",adminPatrao.getTipoConta());
    }

    @Test
    void getUsernameTest() {
        assertEquals("patrao",adminPatrao.getUsername());
        assertEquals("lara", funcLara.getUsername());
        assertNotEquals("sofia",funcLara.getUsername());
        assertNotEquals("",adminPatrao.getUsername());
    }

    @Test
    void getPasswordTest() {
        assertEquals("grandesnegocios",adminPatrao.getPassword());
        assertEquals("bolinhosDeChocolate", funcLara.getPassword());
        assertNotEquals("bolinhosdechocolate",funcLara.getPassword());
        assertNotEquals(123456,funcLara.getPassword());
        assertNotEquals(" ",adminPatrao.getPassword());
    }
}