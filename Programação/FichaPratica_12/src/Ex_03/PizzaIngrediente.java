package Ex_03;

public class PizzaIngrediente {
    Ingrediente ingrediente;
    private double quantidade;

    public PizzaIngrediente(Ingrediente ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double totalCaloriasIngrediente(){
        double totalCaloriasIngrediente = 0;
        totalCaloriasIngrediente = ingrediente.getNumCalorias()*quantidade;
        return totalCaloriasIngrediente;
    }

    public void imprimirIngrediente(){
        String abrevMedida= "";
        if(ingrediente.getUnidadeMedida().equals(UnidadeMedida.Gramas)){
            abrevMedida = "g";
        }else if (ingrediente.getUnidadeMedida().equals(UnidadeMedida.Unidades)){
            abrevMedida = "uni";
        }else if(ingrediente.getUnidadeMedida().equals(UnidadeMedida.Litros)){
            abrevMedida = "L";
        }

        double totalCalorias = ingrediente.getNumCalorias()*this.quantidade;

                System.out.print("[ " + ingrediente.getCodigo() + " | " + ingrediente.getNome() + " | " + ingrediente.getUnidadeMedida() + " | " + totalCalorias + " Kcal ] : " + this.quantidade + " " + abrevMedida + ".");
    }


}
