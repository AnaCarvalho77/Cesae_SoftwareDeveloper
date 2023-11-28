package Ex_03;

import Ex_03.enums.BasePizza;
import Ex_03.enums.UnidadeMedida;

public class Base  extends Ingrediente{
    private BasePizza tipoMassa;
    private String descricao;


    public Base(String codigo, String nome, double numCalorias, BasePizza tipoMassa, String descricao) {
        super(codigo, nome, UnidadeMedida.Gramas, numCalorias);
        this.tipoMassa = tipoMassa;
        this.descricao = descricao;
    }



}
