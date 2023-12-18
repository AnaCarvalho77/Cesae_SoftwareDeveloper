package Domain;

import java.util.ArrayList;

public class Mota extends Veiculo{
    ArrayList<Habilidade>habilidadesMota;

    public Mota(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco) {
        super(id, marca, modelo, potenciaCV, pesoKg, desgaste, preco);
    }

    public Mota(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, ArrayList<Habilidade> habilidadesMota) {
        super(id, marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.habilidadesMota = habilidadesMota;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
    }
}
