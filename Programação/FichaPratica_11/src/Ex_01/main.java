package Ex_01;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 260);
        Musica musica2 = new Musica("Bohemian Rapsody", "Rock", "Queen", 359);
        Musica musica3 = new Musica("Mestre da Culinária", "Heavy Metal", "Quim Barreiros", 233);

        MusicPlayer minhasmusicas = new MusicPlayer();

        minhasmusicas.addMusica(musica1);
        minhasmusicas.addMusica(musica2);
        minhasmusicas.addMusica(musica3);

        minhasmusicas.imprimirRelatorio();


        }


    }

