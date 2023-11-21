package Ex_02;

import Ex_01.MusicPlayer;

public class main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("luis", 25, "911111111", "jskshf2@hdgfd");
        Pessoa pessoa2 = new Pessoa("joana", 22, "912222222", "jskshf2@hdgfd");
        Pessoa pessoa3 = new Pessoa("joao", 30, "913333333", "jskshf2@hdgfd");
        Pessoa pessoa4 = new Pessoa("ana", 28, "914444444", "jskshf2@hdgfd");
        Pessoa pessoa5 = new Pessoa("luisa", 41, "915555555", "jskshf2@hdgfd");

        Sorteio meuSorteio = new Sorteio();

        meuSorteio.addParticipante(pessoa1);
        meuSorteio.addParticipante(pessoa2);
        meuSorteio.addParticipante(pessoa3);
        meuSorteio.addParticipante(pessoa4);
        meuSorteio.addParticipante(pessoa5);

        meuSorteio.imprimirListaParticipantes();

        meuSorteio.sortear();



    }
}
