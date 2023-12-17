package teste2;

public class Cao {
    String nome = "Fido";
    String raca = "Boerboel";
    String latido = "wooof!";
    int idade = 6;

    Cao(String nome_temp){
        this.nome = nome_temp;
    }


    public Cao(String nome, String raca, String latido, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.latido = latido;
        this.idade = idade;
    }
}
