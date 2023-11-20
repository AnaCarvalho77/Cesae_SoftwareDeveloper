package Ex_08;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private Double media;

    public Aluno(String nome, int idade, String curso, Double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public void situacao(){
        if(this.media >= 9.5){
            System.out.println(this.nome + " está Aprovado! Tem uma média de " + this.media + " valores.");
        }else{
            System.out.println(this.nome + " está Reprovado! Tem uma média de " + this.media + " valores.");
        }
    }
}


