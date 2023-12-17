package teste2;

public class ADogsLife {
    public static void main(String[] args) {
        Cao fido = new Cao("Fido");
        System.out.println(fido.nome);
        System.out.println(fido.raca);
        System.out.println(fido.latido);
        System.out.println(fido.idade);

        System.out.println("--------------------");

        Cao spot = new Cao("Spot","Pastor Alemão", "ruff!",3);
        System.out.println(spot.nome);
        System.out.println(spot.raca);
        System.out.println(spot.latido);
        System.out.println(spot.idade);
    }
}
