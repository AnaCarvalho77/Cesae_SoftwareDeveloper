package Domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {
    private Venda vendaAlimentacao;
    private Venda vendaHigiene;
    @BeforeEach
    void setUp() {
        vendaAlimentacao = new Venda("Alimentacao","Cabrito",9,5.99);
        vendaHigiene = new Venda("Higiene","Lixívia",15,1.99 );
    }

    @Test
    void getTipoProdutoTest() {
        assertEquals("Higiene", vendaHigiene.getTipoProduto());
        assertEquals("Alimentacao",vendaAlimentacao.getTipoProduto());

        assertNotEquals("higiene", vendaAlimentacao.getTipoProduto());
        assertNotEquals("",vendaHigiene.getTipoProduto());
        assertNotEquals(132,vendaAlimentacao.getTipoProduto());
    }

    @Test
    void getProdutoTest() {
        assertEquals("Lixívia", vendaHigiene.getProduto());
        assertEquals("Cabrito",vendaAlimentacao.getProduto());

        assertNotEquals("Lixivia", vendaAlimentacao.getProduto());
        assertNotEquals(" ",vendaHigiene.getProduto());
        assertNotEquals(132,vendaAlimentacao.getProduto());
    }

    @Test
    void getQuantidadeVendidaTest() {
        assertEquals(15, vendaHigiene.getQuantidadeVendida());
        assertEquals(9.0,vendaAlimentacao.getQuantidadeVendida());

        assertNotEquals(51, vendaHigiene.getQuantidadeVendida());
        assertNotEquals("",vendaHigiene.getQuantidadeVendida());
        assertNotEquals(9.2,vendaAlimentacao.getQuantidadeVendida());
    }

    @Test
    void getPrecoUnitarioTest() {
        assertEquals(1.99, vendaHigiene.getPrecoUnitario());
        assertEquals(5.99,vendaAlimentacao.getPrecoUnitario());

        assertNotEquals("5.99", vendaAlimentacao.getPrecoUnitario());
        assertNotEquals(1,vendaHigiene.getPrecoUnitario());
        assertNotEquals(6,vendaAlimentacao.getPrecoUnitario());

        //Para passar no exibir detalhes
        vendaHigiene.exibirDetalhesProduto();
        vendaAlimentacao.exibirDetalhesProduto();

    }
}