package Ex_07;

public class Conta {
    private int numConta;
    private Double saldo;
    private String titular;
    private int anoAbertura;

    private double margemCredito;

    private double valorDivida;

    public Conta(int numConta, Double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
        this.anoAbertura = 2023;
        this.margemCredito = 0.90*this.saldo;
        this.valorDivida = 0;
    }

    public void transferencia(Conta contaDestino, double valor){
        if(this.saldo >= valor){
            contaDestino.saldo += valor;
            this.saldo -= valor;
            System.out.println("\ntransferiu " + valor + " euros para a conta de " + contaDestino.titular + " e ficou com " + this.saldo + " euros.");
        } else {
            System.out.println("\nNão tem saldo suficiente para tranferir esse valor.");
        }

    }


    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("\nDepositou " + valor + " euros e ficou com " + this.saldo + " euros.");
    }

    public void levantar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("\nLevantou " + valor + " euros e ficou com " + this.saldo + " euros.");
        }else{
            System.out.println("\nNão consegue lavantar esse valor porque o seu saldo é insuficiente. Tem um saldo de "+ this.saldo + " euros");
        }
    }

    public void exibirSaldo(){
        System.out.println("O seu saldo é de: " + this.saldo + " euros");
    }

    public boolean pedirEmprestimo(double valor){
        if(this.valorDivida == 0 && this.margemCredito >= valor){
            this.valorDivida = valor;
            this.saldo += valor;
            return true;
        }else{
            return false;
        }

    }

    public void exibirDados(){
        System.out.println("Conta : " + this.numConta);
        System.out.println(("Titula: " + this.titular));
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Valor em dívida: "+ this.valorDivida);
        System.out.println("Margem Crédito: " + this.margemCredito);

    }
}
