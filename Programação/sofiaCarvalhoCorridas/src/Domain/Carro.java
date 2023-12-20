package Domain;

import java.util.ArrayList;

public class Carro extends Veiculo{
    private TipoCarro tipoCarro;
    private ArrayList<Modificacao>kitCorrida;

    public Carro(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro) {
        super(id, marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoCarro = tipoCarro;
        this.kitCorrida = new ArrayList<>();
    }

    public Carro(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro, ArrayList<Modificacao> kitCorrida) {
        super(id, marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoCarro = tipoCarro;
        this.kitCorrida = kitCorrida;
    }

    public void adicionarItensCorrida(Modificacao modificacaoNova){
            kitCorrida.add(modificacaoNova);
        }


    public ArrayList<Modificacao> getKitCorrida() {
        return kitCorrida;
    }

    public void imprimirKitCorrida(){
        for(Modificacao itemAtual: kitCorrida){
            itemAtual.mostrarDetalhes();
        }
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.print("\t| " + this.tipoCarro + "\t|");
        imprimirKitCorrida();
        System.out.println();
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }
}
