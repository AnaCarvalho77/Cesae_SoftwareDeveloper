package Ex_01;

public class Pessoa {

    //Definir atributos de instância
    private String nome;
    private int idade;
    private double altura;

    /**
     * Método construtor de Pessoa
     * @param nome Nome da Pessoa
     * @param idade idade da Pessoa
     * @param altura altura da Pessoa
     */
    Pessoa(String nome, int idade, double altura ){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}


