package Domain;

import java.util.ArrayList;

/**
 * subclasse Carro da superclasse veiculo para carros
 */
public class Carro extends Veiculo{
    /**
     * variável tipoCarro que guarda um tipo de carro da enumeração TipoCarro
     */
    private TipoCarro tipoCarro;
    /**
     * Arraylist de modificações que o carro tem
     */
    private ArrayList<Modificacao>kitCorrida;

    /**
     * Método Construtor da Classe Carro que recebe os seguintes parametros
     * @param id (string) identificação do Veiculo
     * @param marca (string) marca do Veiculo
     * @param modelo (string) modelo do Veiculo
     * @param potenciaCV (int) potencia do Veiculo
     * @param pesoKg (double) peso do Veiculo
     * @param desgaste (int) desgaste do Veiculo
     * @param preco (int) preço do Veículo
     * @param tipoCarro (TipoCarro) tipo de carro do carro
     */
    public Carro(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro) {
        super(id, marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoCarro = tipoCarro;
        this.kitCorrida = new ArrayList<>();
    }

    /**
     * Método para adicionar itens ao Kit de corrida (arraylist de Modificacao)
     * @param modificacaoNova recebe como parametro uma Modificacao para adicionar
     */
    public void adicionarItensCorrida(Modificacao modificacaoNova){
            kitCorrida.add(modificacaoNova);
        }

    /**
     * Método para saber o arraylist de Modificacao, kit de corrida
     * @return retorna o kit de corrida
     */
    public ArrayList<Modificacao> getKitCorrida() {
        return kitCorrida;
    }

    /**
     * Método para limpar o  kit de corrida do carro
     */
    public void removerMoficacao(){
        this.kitCorrida.removeAll(kitCorrida);
    }

    /**
     * Método para imprimir o arraylist kit de corrida de um Carro
     */
    public void imprimirKitCorrida(){
        for(Modificacao itemAtual: kitCorrida){
            itemAtual.mostrarDetalhes();
        }
    }

    /**
     * Método para imprimir os detalhes de um Carro
     */
    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.print("\t| Tipo Carro: " + this.tipoCarro + "\n");
//        imprimirKitCorrida();
//        System.out.println();
    }

    /**
     * Método para saber o TipoCarro do Carro
     * @return (TipoCarro) retorna o tipo de carro
     */
    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }
}
