package Ex_11;

public class main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(123456, 10000.00, "Sofia");

        conta1.depositar(1000);
        conta1.levantar(120);

        Conta conta2 = new Conta(32145, 5000.00, "Joana");
        Conta conta3 = new Conta(45678, 3000.00, "nuno");

        conta2.transferencia(conta3, 1000.00);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();



    }
}
