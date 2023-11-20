package Ex_11;

public class Conta {
    private int numConta;
    private Double saldo;
    private String titular;


    public Conta(int numConta, Double saldo, String titular) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void transferencia(Conta contaDestino, double valor){
           if(contaDestino.saldo >= valor){
               contaDestino.saldo += valor;
               this.saldo -= valor;
               System.out.println("\ntransferiu " + valor + " euros para a conta de " + contaDestino.titular + " e ficou com " + this.saldo + " euros.");
           } else {
               System.out.println("\nNão tem saldo suficiente para tranferir esse valor.");
           }

    }


    public void depositar(int valor){
        this.saldo += valor;
        System.out.println("\nDepositou " + valor + " euros e ficou com " + this.saldo + " euros.");
    }

    public void levantar(int valor){
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


}
