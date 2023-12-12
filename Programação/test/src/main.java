public class main {
    public static void main(String[] args) {
        Fabrica fabricaA = new FabricaProdutoA();
        Produto produtoA = fabricaA.criarProduto();
        produtoA.exibir();
    }
}
