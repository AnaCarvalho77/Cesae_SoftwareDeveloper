package Ex_02;

public class main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(00003,5000.00,"Carlos Soares");

        System.out.println(conta1.pedirEmprestimo(1000.00));
        conta1.exibirDados();

    }
}
