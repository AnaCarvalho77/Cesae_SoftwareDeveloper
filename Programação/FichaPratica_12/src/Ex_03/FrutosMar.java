package Ex_03;

public class FrutosMar extends Topping{
    TipoFrutosMar tipo;

    public FrutosMar(String codigo, String nome, UnidadeMedida unidadeMedida, double numCalorias, OrigemIngrediente origem, TipoFrutosMar tipo) {
        super(codigo, nome, unidadeMedida, numCalorias, origem);
        this.tipo = tipo;
    }
}
