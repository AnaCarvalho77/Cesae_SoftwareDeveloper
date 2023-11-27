package Ex_03;

public class Ingrediente {
    private String codigo;
    private String nome;
    private UnidadeMedida unidadeMedida;
    private double numCalorias;
    private double quantidade;

    public Ingrediente(String codigo, String nome, UnidadeMedida unidadeMedida, double numCalorias) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        this.numCalorias = numCalorias;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }



    public double getNumCalorias() {
        return numCalorias;
    }

    public void imprimirIngrediente(){
        String abrevMedida= "";
        if(this.unidadeMedida.equals(UnidadeMedida.Gramas)){
            abrevMedida = "g";
        }else if (this.unidadeMedida.equals(UnidadeMedida.Unidades)){
            abrevMedida = "uni";
        }else if(this.unidadeMedida.equals(UnidadeMedida.Litros)){
            abrevMedida = "L";
        }

        System.out.print("[ " + this.codigo + " | " + this.nome + " | " + this.unidadeMedida + " | " + this.numCalorias + " Kcal ] : " + this.quantidade + " " + abrevMedida + ".");
    }


}
