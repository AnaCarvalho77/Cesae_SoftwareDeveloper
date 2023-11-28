package Ex_03;

import Ex_03.enums.OrigemIngrediente;
import Ex_03.enums.TipoVegetal;
import Ex_03.enums.UnidadeMedida;

public class Vegetal extends Topping{
    TipoVegetal tipo;

    public Vegetal(String codigo, String nome, UnidadeMedida unidadeMedida, double numCalorias, OrigemIngrediente origem, TipoVegetal tipo) {
        super(codigo, nome, unidadeMedida, numCalorias, origem);
        this.tipo = tipo;
    }
}
