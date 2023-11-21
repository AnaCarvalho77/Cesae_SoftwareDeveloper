package Ex_01;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Musica musica1 = new Musica("The Scientist", "Rock Alternativo", "Coldplay", 260);
        Musica musica2 = new Musica("Bohemian Rapsody", "Rock", "Queen", 359);
        Musica musica3 = new Musica("Mestre da Culinária", "Heavy Metal", "Quim Barreiros", 233);
        Musica musica4 = new Musica("Circles", "Grunge", "Post Malone", 200);
        Musica musica5 = new Musica("Traitor", "Pop", "Olivia Rodrigo", 280);
        Musica musica6 = new Musica("Black", "Grunge", "Pearl Jam", 342);

        MusicPlayer minhasmusicas = new MusicPlayer();

        minhasmusicas.addMusica(musica1);
        minhasmusicas.addMusica(musica2);
        minhasmusicas.addMusica(musica3);
        minhasmusicas.addMusica(musica4);
        minhasmusicas.addMusica(musica5);
        minhasmusicas.addMusica(musica6);

        minhasmusicas.trocarMusica(musica1,musica6);

        minhasmusicas.imprimirRelatorio();

        minhasmusicas.calculoDuracao();

        System.out.println("**********************");

        minhasmusicas.removerMusica(musica3);

        minhasmusicas.imprimirRelatorio();
        minhasmusicas.calculoDuracao();

        System.out.println("**********************");
        minhasmusicas.removerTodasMusicas();
        minhasmusicas.calculoDuracao();






        }


    }

