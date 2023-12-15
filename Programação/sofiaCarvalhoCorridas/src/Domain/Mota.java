package Domain;

import java.util.ArrayList;

public class Mota extends Veiculo{
    ArrayList<Habilidade>habilidadesMota;

    public Mota(String marca, String modelo, int potenciaCV, double pesoKg, int preco) {
        super(marca, modelo, potenciaCV, pesoKg, preco);
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
    }
}
