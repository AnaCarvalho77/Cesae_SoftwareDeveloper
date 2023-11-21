package Ex03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String [] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double peso, String [] alimentacao) {

        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;

    }
    public void comer(String alimento, double pesoAlimento){
        for(int i = 0; i < this.alimentacao.length; i++){
            if(alimento.equals(this.alimentacao[i])) {
                this.peso += pesoAlimento;
                System.out.println("O animal comeu");
                break;
            }else{
                System.out.println("O animal recusou essa comida");
            }
        }

    }

    public void imprimirPeso(){
        System.out.println("o peso do " + this.nome + " é de " + this.peso + " Kg.");
    }




}


