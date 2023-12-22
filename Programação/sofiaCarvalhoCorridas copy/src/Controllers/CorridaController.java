package Controllers;

import Domain.Momento;
import Domain.Piloto;
import Domain.Pista;
import Domain.Veiculo;

import java.util.ArrayList;

public class CorridaController {
    public CorridaController(){
    }

    public double corrida(Pista pistaCorrida, Piloto pilotoAtual){
        double tempoVolta, tempoTotal = 0;
        int voltasPista = pistaCorrida.getQuantidadeVoltas();
        int premiorecord = 20000;
        ArrayList <Momento> momentosPista = new ArrayList<Momento>();
        momentosPista = pistaCorrida.getMomentosPista();
//        ArrayList <Double> tempoMomentosPista = new ArrayList<Double>();
//        for(Momento momentoAtual: momentosPista){
//            tempoMomentosPista.add(momentoAtual.getAtrasoPeso());
//            tempoMomentosPista.add(momentoAtual.getAtrasoPotencia());
//        }
        Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();
        double tempoRecord = pistaCorrida.getTempoRecordeSeg();
        double tempoAtraso = 0;
        tempoVolta = pistaCorrida.getDistanciaVoltaM()/((1.6*veiculoPiloto.getPotenciaCV())-(0.2*veiculoPiloto.getPesoKg())-(0.5* veiculoPiloto.getDesgaste()));
        for(Momento momentoAtual: momentosPista) {
            tempoAtraso = (veiculoPiloto.getPesoKg() * momentoAtual.getAtrasoPeso()) + (veiculoPiloto.getPotenciaCV() * momentoAtual.getAtrasoPotencia()) / 100;
        }

        for(int i = 0; i < voltasPista;i++ ){
                tempoTotal += tempoVolta + tempoAtraso;
                veiculoPiloto.setDesgaste(veiculoPiloto.getDesgaste()+ 20);
            }

        if(tempoTotal < tempoRecord){
            pilotoAtual.setFichasCorrida(pilotoAtual.getFichasCorrida()+premiorecord);
            pilotoAtual.setVitorias(pilotoAtual.getVitorias() + 1);
            System.out.println("Superou o Record da pista! Completou a corrida em : " + tempoTotal + " e o tempo recorde era de " + tempoRecord);
        }else{
            pilotoAtual.setFichasCorrida(pilotoAtual.getFichasCorrida()+(premiorecord/2));
            System.out.println("Não bateu o Record da pista! Completou a corrida em : " + tempoTotal + " e o tempo recorde era de " + tempoRecord);
        }
        return tempoTotal;

    }
}
