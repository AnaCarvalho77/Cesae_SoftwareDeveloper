package Ex_06;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String paisOrigem;


    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }

    public void dadosAtleta(){
        System.out.println("nome: " + this.nome +  "\t|" + "modalidade: " + this.modalidade +  "\t|" + "altura: " + this.altura +  "\t|" + "peso: " + this.peso +  "\t|" + "pais de Origem: " + this.paisOrigem);
    }
}
