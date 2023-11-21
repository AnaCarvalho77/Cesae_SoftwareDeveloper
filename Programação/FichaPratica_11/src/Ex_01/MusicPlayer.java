package Ex_01;

import java.util.ArrayList;

public class MusicPlayer {
    ArrayList <Musica> programacao = new ArrayList <Musica>();

    public MusicPlayer() {
    }

    public void addMusica(Musica nova){
        programacao.add(nova);
    }

    public void trocarMusica(Musica musica1,Musica musica2){
      int posicaoMusica1 = programacao.indexOf(musica1);
      int posicaoMusica2 = programacao.indexOf(musica2);
      programacao.set(posicaoMusica1,musica2);
      programacao.set(posicaoMusica2,musica1);
    }

    public void removerMusica(Musica musicaRemover){
        int posicao = programacao.indexOf(musicaRemover);
        programacao.remove(posicao);
    }

    public void removerTodasMusicas(){
        programacao.clear();
    }

public void imprimirRelatorio(){
       for(int i = 0; i< programacao.size();i++){
           System.out.print("Musica " + (i+1) + ": "  );
           programacao.get(i).imprimirMusica();
       }
}

}
