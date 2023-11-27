package Ex_03;

public class Ingrediente {
    private String codigo;
    private String nome;
    private UnidadeMedida unidadeMedida;
    private double numCalorias, quantidade;


    public Ingrediente(String codigo, String nome, UnidadeMedida unidadeMedida, double numCalorias) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.numCalorias = numCalorias;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getNumCalorias() {
        return numCalorias;
    }
}
