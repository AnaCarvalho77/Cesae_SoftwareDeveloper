package Domain;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Mota extends Veiculo {
    private ArrayList<Habilidade> habilidadesMota;

    /**
     * Método construtor da subclasse Mota que recebe os seguintes parametros:
     *
     * @param id         (string) id do veiculo
     * @param marca      (string) marca do veiculo
     * @param modelo     (string) modelo do veiculo
     * @param potenciaCV (int) potencia do veiculo
     * @param pesoKg     (double) peso do veiculo
     * @param desgaste   (int) desgaste do veiculo
     * @param preco      (int) preço do veiculo
     */
    public Mota(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco) {
        super(id, marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.habilidadesMota = new ArrayList<>();
    }

    /**
     * Método para obter o arraylist de habilidade da mota
     *
     * @return arraylist de Habilidade da Mota
     */
    public ArrayList<Habilidade> getHabilidadesMota() {
        return habilidadesMota;
    }

    /**
     * Método para adicionar habilidades ao arralist de habilidades da Mota
     *
     * @param habilidadeNova para adicipnar ao arraylist
     */
    public void adicionarItensCorrida(Habilidade habilidadeNova) {
        this.habilidadesMota.add(habilidadeNova);
    }

    /**
     * Método para limpar o arraylist de itens de corrida da Mota
     */
    public void removerHabilidades() {
        this.habilidadesMota.removeAll(habilidadesMota);
    }

    /**
     * Método para imprimir o arraylist de habilidades
     */
    public void imprimirHabilidadesMota() {
        for (Habilidade itemAtual : habilidadesMota) {
            itemAtual.mostrarDetalhes();
        }
    }

    /**
     * Método para imprimir os detalhes de uma Mota
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println();
    }

}
