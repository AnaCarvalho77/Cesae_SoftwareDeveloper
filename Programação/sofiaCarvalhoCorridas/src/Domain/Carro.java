package Domain;

import java.util.ArrayList;

public class Carro extends Veiculo{
    private TipoCarro tipoCarro;
    ArrayList<Modificacao>kitCorrida;

    public Carro(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro) {
        super(id, marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoCarro = tipoCarro;
    }

    public Carro(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro, ArrayList<Modificacao> kitCorrida) {
        super(id, marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoCarro = tipoCarro;
        this.kitCorrida = kitCorrida;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.print("\t| " + this.tipoCarro);
    }
}
