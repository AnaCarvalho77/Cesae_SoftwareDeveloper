package Domain;

import java.util.ArrayList;

/**
 * classe pista para pistas de corrida
 */
public class Pista {
    /**
     * variável do tipo string para guardar o nome da pista de corrida
     */
    private String nome;
    /**
     * variável do tipo double para guardar o tempo da pista de corrida
     */
    private double tempo;
    /**
     * variável do tipo double para guardar o tempo recorde em segundos da pista de corrida
     */
    private double tempoRecordeSeg;
    /**
     * variável do tipo double para guardar o distância em metros da pista de corrida
     */
    private double distanciaVoltaM;
    /**
     * variável do tipo inteiro para guardar a quantidades de voltas da pista de corrida
     */
    private int quantidadeVoltas;
    /**
     * arraylist de momentos para guaradr os momentos da pista de corrida
     */
    private ArrayList<Momento>momentosPista;

    /**
     * Método construtor da classe Pista que recebe como parametros:
     * @param nome (string) o nome da pista
     * @param tempo (double) o tempo da pista
     * @param tempoRecordeSeg (double) o tempo record em segundo da pista
     * @param distanciaVoltaM (double) a distancia em metros da pista
     * @param quantidadeVoltas (int) a quantidade de voltas da pista
     */
    public Pista(String nome, double tempo, double tempoRecordeSeg, double distanciaVoltaM, int quantidadeVoltas) {
        this.nome = nome;
        this.tempo = tempo;
        this.tempoRecordeSeg = tempoRecordeSeg;
        this.distanciaVoltaM = distanciaVoltaM;
        this.quantidadeVoltas = quantidadeVoltas;
        this.momentosPista = new ArrayList<>();
    }

    /**
     * Método para saber o nome da pista
     * @return (string) nome da pista
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para saber o valor da variável Tempo da pista
     * @return (double) o tempo da pista
     */
    public double getTempo() {
        return tempo;
    }

    /**
     * Método para saber o tempo record em segundo da pista
     * @return (double) o tempo record da pista
     */
    public double getTempoRecordeSeg() {
        return tempoRecordeSeg;
    }

    /**
     * Método para saber o valor da variavel distanciaVoltaM
     * @return (double) o valor da distancia de uma volta da pista em metros
     */
    public double getDistanciaVoltaM() {
        return distanciaVoltaM;
    }

    /**
     * Método para saber o valor da variável QuantidadeVoltas
     * @return (int) o número de voltas da pista
     */
    public int getQuantidadeVoltas() {
        return quantidadeVoltas;
    }

    /**
     * Método para obter o arraylist de momento da pista
     * @return arraylist de Momento da Pista
     */
    public ArrayList<Momento> getMomentosPista() {
        return momentosPista;
    }

    /**
     * Método para adivionar momentos ao arraylist de momentos da pista
     * @param novoMomento para adicionar ao arraylist
     */
    public void adicionarMomento(Momento novoMomento){
        momentosPista.add(novoMomento);
    }

    /**
     * Método para imprimir os detalhes da pista
     */
    public void imprimirPista(){
        System.out.println(this.nome + "\t| " + this.tempo + "\t| " + this.tempoRecordeSeg + "\t| " + this.distanciaVoltaM + "\t| " + this.quantidadeVoltas + "\t| " + this.momentosPista);
    }
}
