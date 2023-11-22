package Ex_03;

import java.util.ArrayList;

public class BarcoPesca {
    private String nome, cor, anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marca;
    private ArrayList<Peixe>peixesPescados = new ArrayList<>();
    private ArrayList<Marisco>mariscoPescado = new ArrayList<>();

    public BarcoPesca(String nome, String cor, String anoFabrico, int tripulacao, double capacidadeCarga, Marca marca) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marca = marca;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public double capacidadeAtual(){
        double pesoAtual = 0 ;
        for(Peixe i : peixesPescados){
            pesoAtual += i.getPeso();
        }
        for(Marisco i: mariscoPescado){
            pesoAtual += i.getPeso();
        }
        return pesoAtual;
    }

    public void adicionar(Peixe peixe){
        if(this.capacidadeCarga >= this.capacidadeAtual() + peixe.getPeso()){
            peixesPescados.add(peixe);
            System.out.println("o peixe adicionado foi o: " + peixe.getEspecie() + " que pesava " + peixe.getPeso() + "Kg");
        }else{
            System.out.println("O barco não suporte o peso do " + peixe.getEspecie() + " porque pesa " + peixe.getPeso() + "Kg");
        }
    }

    public void adicionar(Marisco marisco){
        if(this.capacidadeCarga >= this.capacidadeAtual() + marisco.getPeso()){
            mariscoPescado.add(marisco);
            System.out.println("o marisco adicionado foi o: " + marisco.getEspecie() + " que pesava " + marisco.getPeso() + "Kg");
        }else{
            System.out.println("O barco não suporte o peso do " + marisco.getEspecie() + " porque pesa " + marisco.getPeso() + "Kg");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (Peixe i : peixesPescados){
            total += (i.getPreco()*i.getPeso());
        }
        for( Marisco i : mariscoPescado){
            total += (i.getPreco()*i.getPeso());
        }
        return total;
    }

    public void largarPeixe(int posicao){
        if(posicao >= 0 && posicao < peixesPescados.size()){
            Peixe peixeRemovido = peixesPescados.remove(posicao);
            System.out.println("O peixe removido foi: " + peixeRemovido.getEspecie() + " que pesava " + peixeRemovido.getPeso() + "Kg");
        }else{
            System.out.println("não existe essa posição");
        }

    }
    public void largarMarisco(int posicao){
        if(posicao >= 0 && posicao < mariscoPescado.size()){
            Marisco mariscoRemovido = mariscoPescado.remove(posicao);
            System.out.println("O marisco removido foi: " + mariscoRemovido.getEspecie() + " que pesava " + mariscoRemovido.getPeso() + "Kg");
        }else{
            System.out.println("não existe essa posição");
        }
    }

public double salarioTripulacao(double total){
      double salarios = 0;
      salarios = (total*0.6)/this.tripulacao;
      return salarios;
}

}
