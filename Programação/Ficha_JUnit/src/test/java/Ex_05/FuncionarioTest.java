package Ex_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    private Funcionario sofia;
    private Funcionario ana;

    @BeforeEach
    void setUp() {
        ana = new Funcionario("ana", 4000.00,"informática");
        sofia = new Funcionario("sofia", 2500.00, "contabilidade");
    }

 @Test
 void getSalarioTest(){
        assertEquals(4000.00,ana.getSalario());
        ana.aumentarSalario(10.00);
        assertEquals(4400.00,ana.getSalario());

        assertEquals(2500.00,sofia.getSalario());
        sofia.aumentarSalario(20.00);
        assertEquals(3000, sofia.getSalario());
 }


}