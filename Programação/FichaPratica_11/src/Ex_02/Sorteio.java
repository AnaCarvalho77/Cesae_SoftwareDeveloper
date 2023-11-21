package Ex_02;

import Ex_01.Musica;

import java.util.ArrayList;

public class Sorteio {
    ArrayList<Pessoa> participantes = new ArrayList <Pessoa>();

    public Sorteio() {
    }

    public void addParticipante(Pessoa nova){
        if(nova.getIdade()>=18){
            participantes.add(nova);
        }else{
            System.out.println("É menor de idade, por isso não pode participar!!");
        }
    }

    public void sortear(){
        double posicao = Math.random()*participantes.size();
        System.out.println("**************** O vencedor é *************************");
        participantes.get((int) posicao).dadosPessoa();

    }

    public void imprimirListaParticipantes(){
        for(int i = 0; i< participantes.size();i++){
            System.out.print("Participante " + (i+1) + ": "  );
            participantes.get(i).dadosPessoa();
        }
    }

}
