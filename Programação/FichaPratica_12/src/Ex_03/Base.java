package Ex_03;

public class Base  extends Ingrediente{
    private BasePizza tipoMassa;
    private String descricao;


    public Base(String codigo, String nome, UnidadeMedida unidadeMedida, double numCalorias, BasePizza tipoMassa, String descricao) {
        super(codigo, nome, unidadeMedida, numCalorias);
        this.tipoMassa = tipoMassa;
        this.descricao = descricao;
    }



}
