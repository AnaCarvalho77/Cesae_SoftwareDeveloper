package Ex_02;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String telemovel;


    public Pessoa(String nome, int idade, String email, String telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public void dadosPessoa(){
        System.out.println("nome: " + this.nome +  "\t|" + "idade: " + this.idade +  "\t|" + "email: " + this.email +  "\t|" + "telenovel: " + this.telemovel);
    }

    public int getIdade() {
        return idade;
    }
}
