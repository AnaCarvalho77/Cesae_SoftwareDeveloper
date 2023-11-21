package Ex03;

public class main {
    public static void main(String[] args) {

        String [] alimentacao = {"carne", "biscoitos"};

        Animal cao = new Animal("lucky", "rafeiro", "portugal", 5.00,alimentacao);

        cao.comer("carne", 0.2);
        cao.imprimirPeso();


    }
}
