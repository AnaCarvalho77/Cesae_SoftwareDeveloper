package Domain;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Mota extends Veiculo{
    private ArrayList<Habilidade>habilidadesMota;

    public Mota(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco) {
        super(id, marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.habilidadesMota = new ArrayList<>();
    }

    public Mota() {
    }

    public ArrayList<Habilidade> getHabilidadesMota() {
        return habilidadesMota;
    }

    public void adicionarItensCorrida(Habilidade habilidadeNova){
        habilidadesMota.add(habilidadeNova);
    }


    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.print("\t|" + this.habilidadesMota + "\n");
    }

    public void mostrarHbilidadesMota(){
        for(Habilidade itemAtual: habilidadesMota){
            itemAtual.mostrarDetalhes();
        }
    }
}
