package Domain;

import java.util.ArrayList;

public class Pista {
    private String nome;
    private double tempo;
    private double tempoRecordeSeg;
    private double distanciaVoltaM;
    private int quantidadeVoltas;
    private ArrayList<Momento>momentosPista;

    public Pista(String nome, double tempo, double tempoRecordeSeg, double distanciaVoltaM, int quantidadeVoltas) {
        this.nome = nome;
        this.tempo = tempo;
        this.tempoRecordeSeg = tempoRecordeSeg;
        this.distanciaVoltaM = distanciaVoltaM;
        this.quantidadeVoltas = quantidadeVoltas;
    }

    public String getNome() {
        return nome;
    }

    public double getTempo() {
        return tempo;
    }

    public double getTempoRecordeSeg() {
        return tempoRecordeSeg;
    }

    public double getDistanciaVoltaM() {
        return distanciaVoltaM;
    }

    public int getQuantidadeVoltas() {
        return quantidadeVoltas;
    }

    public ArrayList<Momento> getMomentosPista() {
        return momentosPista;
    }

    public void adicionarMomento(Momento novoMomento){
        momentosPista.add(novoMomento);
    }

    public void imprimirPista(){
        System.out.println(this.nome + "\t| " + this.tempo + "\t| " + this.tempoRecordeSeg + "\t| " + this.distanciaVoltaM + "\t| " + this.quantidadeVoltas + "\t| " + this.momentosPista);
    }
}
