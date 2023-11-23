package Ex_02;

import Ex_01.Musica;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private ArrayList<Pessoa> participantes = new ArrayList <Pessoa>();

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
        Random random = new Random();
        int posicao = random.nextInt(0,participantes.size());
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
