package Ex_03;

import Ex_03.enums.OrigemIngrediente;
import Ex_03.enums.UnidadeMedida;

public class Topping extends Ingrediente{
    private OrigemIngrediente origem;

    public Topping(String codigo, String nome, UnidadeMedida unidadeMedida, double numCalorias, OrigemIngrediente origem) {
        super(codigo, nome, unidadeMedida, numCalorias);
        this.origem = origem;
    }
}
