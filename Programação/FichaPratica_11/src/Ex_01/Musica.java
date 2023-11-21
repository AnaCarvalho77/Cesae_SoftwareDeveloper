package Ex_01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracao;

    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }

    public void imprimirMusica(){
        System.out.println(titulo + "\t|" + genero + "\t|" + artista +"\t|" + duracao);
    }

    public int getDuracao() {
        return duracao;
    }
}
