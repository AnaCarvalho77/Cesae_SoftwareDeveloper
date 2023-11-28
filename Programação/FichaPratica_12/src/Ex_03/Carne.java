package Ex_03;

import Ex_03.enums.OrigemIngrediente;
import Ex_03.enums.TipoCarne;
import Ex_03.enums.UnidadeMedida;

public class Carne extends Topping{
    TipoCarne tipo;

    public Carne(String codigo, String nome, UnidadeMedida unidadeMedida, double numCalorias, OrigemIngrediente origem, TipoCarne tipo) {
        super(codigo, nome, unidadeMedida, numCalorias, origem);
        this.tipo = tipo;
    }
}
