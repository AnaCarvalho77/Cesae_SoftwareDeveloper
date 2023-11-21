package Ex_06;

import Ex_05.Pessoa;

public class Competicao {
    private String nomeCompeticao;
    private String localizacao;
    Atleta [] participantes = new Atleta[1000];

    public Competicao(String nomeCompeticao, String localizacao) {
        this.nomeCompeticao = nomeCompeticao;
        this.localizacao = localizacao;

    }

    public void addAtleta(Atleta novo){
        for(int i = 0; i < participantes.length; i++ ){
            if(participantes[i] == null){
                participantes[i] = novo;
                return;
            }
        }
    }

    public void listarAtletas(){
        for(int i = 0; i < participantes.length; i++){
            if(participantes[i] != null){
                System.out.print("Atleta numero " + (i+1) + " ----> ");
                participantes[i].dadosAtleta();
            }
        }
    }

    public void dadosCompeticao(){
        System.out.println("nome da competição: " + this.nomeCompeticao +  "\t|" + "localização: " + this.localizacao +  "\t|");
    }
}
