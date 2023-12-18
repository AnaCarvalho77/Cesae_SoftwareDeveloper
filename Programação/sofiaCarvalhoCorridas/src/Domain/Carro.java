package Domain;

import java.util.ArrayList;

public class Carro extends Veiculo{
    private TipoCarro tipoCarro;
    ArrayList<Modificacao>kitCorrida;

    public Carro(String marca, String modelo, int potenciaCV, double pesoKg, int preco, TipoCarro tipoCarro) {
        super(marca, modelo, potenciaCV, pesoKg, preco);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.print("\t| " + this.tipoCarro);
    }
}
