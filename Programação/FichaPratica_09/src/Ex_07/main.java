package Ex_07;

public class main {
    public static void main(String[] args) {
            Livro livro1 = new Livro("As palavras que nunca te direi", "Nicholas Sparks", "Romance", 304, "2578578125263");
            Livro livro2 = new Livro("Fortaleza Digital", "Dan Brown", "Mistério", 448, "7882572867546");


            livro1.exibirDetalhes(livro1);
        System.out.println();
            livro2.exibirDetalhes(livro2);
    }
}
