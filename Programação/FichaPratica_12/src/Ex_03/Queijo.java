package Ex_03;

public class Queijo extends Topping{
    TipoQueijo tipo;

    public Queijo(String codigo, String nome, UnidadeMedida unidadeMedida, double numCalorias, OrigemIngrediente origem, TipoQueijo tipo) {
        super(codigo, nome, unidadeMedida, numCalorias, origem);
        this.tipo = tipo;
    }
}
