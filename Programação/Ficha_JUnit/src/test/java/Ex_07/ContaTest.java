package Ex_07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    private Conta conta1;
    private Conta conta2;
    private Conta conta3;


    @BeforeEach
    void setUp() {
        conta1 = new Conta(0001,20000.00,"Ana");
        conta2 = new Conta(0002,10000.00,"Joana");
        conta3 = new Conta(0003,102000.00,"Rui");
    }


    @Test
    void processosTeste(){
        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta1.transferencia(conta2,25000.00);
        conta1.exibirSaldo();
        conta2.exibirSaldo();

        conta3.exibirSaldo();
        conta3. transferencia(conta2,2000.00);
        conta3.exibirSaldo();
        conta2.exibirSaldo();

        conta1.depositar(5000.00);
        conta1.exibirSaldo();

        conta1.levantar(26000.00);
        conta1.exibirSaldo();

        conta2.levantar(2000.00);
        conta2.exibirSaldo();
    }
    @Test
    void pedirEmprestimo() {
        assertTrue(conta1.pedirEmprestimo(2000.00));
        assertFalse(conta1.pedirEmprestimo(1000.00));
        conta1.exibirDados();

        assertFalse(conta2.pedirEmprestimo(9500.00));
        assertTrue(conta2.pedirEmprestimo(9000.00));
        conta2.exibirDados();

    }
}