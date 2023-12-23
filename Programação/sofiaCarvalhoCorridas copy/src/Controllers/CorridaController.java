package Controllers;

import Domain.Momento;
import Domain.Piloto;
import Domain.Pista;
import Domain.Veiculo;

import java.util.ArrayList;

public class CorridaController {
    /**
     * Metodo construtor vazio da classe CorridaController
     */
    public CorridaController(){
    }

    /**
     * Método para fazer uma corrida numa pista, que calcula o tempo da corrida para o carro atual do piloto e atualiza dados do veiculo do piloto após corrida
     * @param pistaCorrida pista onde vai ser feita a corrida
     * @param pilotoAtual recebe um piloto como parametro para saber qual o veiculo atual do piloto
     * @return
     */
    public double corrida(Pista pistaCorrida, Piloto pilotoAtual){
        //Declaração de variáveis
        double tempoVolta, tempoTotal = 0;
        int voltasPista = pistaCorrida.getQuantidadeVoltas();
        int premiorecord = 20000;
        double tempoRecord = pistaCorrida.getTempoRecordeSeg();
        double tempoAtraso = 0;

        ArrayList <Momento> momentosPista = new ArrayList<Momento>();
        momentosPista = pistaCorrida.getMomentosPista();

        Veiculo veiculoPiloto = pilotoAtual.getVeiculoAtual();

        // cálculo com fórmula dada com o professor.
        double auxiliarCalculo;
        auxiliarCalculo = (1.6*veiculoPiloto.getPotenciaCV())-(0.2*veiculoPiloto.getPesoKg())-(0.5* veiculoPiloto.getDesgaste());
        if(auxiliarCalculo > 0){//acrescentei esta condições porque com o incremento do desgaste o tempo pode ficar negativo e não estava a fazer sentido, pelo menos na minha cabeça
            tempoVolta = pistaCorrida.getDistanciaVoltaM()/auxiliarCalculo;
        }else{
            tempoVolta = pistaCorrida.getDistanciaVoltaM()/(1.6*veiculoPiloto.getPotenciaCV());
        }

        //calcular os atrasos dos momentos das pista
        for(Momento momentoAtual: momentosPista) {
            tempoAtraso = ((veiculoPiloto.getPesoKg() * momentoAtual.getAtrasoPeso()) + (veiculoPiloto.getPotenciaCV() * momentoAtual.getAtrasoPotencia())) / 100;
        }

        //calcular o tempo total de todas as voltas da pista
        for(int i = 0; i < voltasPista;i++ ){
                tempoTotal += tempoVolta + tempoAtraso;
                veiculoPiloto.setDesgaste(veiculoPiloto.getDesgaste()+ 20);
            }

        //verificar se bateu o record da pista de corrida
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
