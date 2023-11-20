package Ex_10;

public class main {
    public static void main(String[] args) {
        Funcionario tiago = new Funcionario("tiago", 10000.00, "informática" );

        tiago.aumentarSalario(10.0);
        tiago.exibirDados();

    }
}
