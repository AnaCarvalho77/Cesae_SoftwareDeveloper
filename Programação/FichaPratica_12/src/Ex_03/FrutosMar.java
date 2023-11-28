package Ex_03;

import Ex_03.enums.OrigemIngrediente;
import Ex_03.enums.TipoFrutosMar;
import Ex_03.enums.UnidadeMedida;

public class FrutosMar extends Topping{
    TipoFrutosMar tipo;

    public FrutosMar(String codigo, String nome, UnidadeMedida unidadeMedida, double numCalorias, OrigemIngrediente origem, TipoFrutosMar tipo) {
        super(codigo, nome, unidadeMedida, numCalorias, origem);
        this.tipo = tipo;
    }
}
