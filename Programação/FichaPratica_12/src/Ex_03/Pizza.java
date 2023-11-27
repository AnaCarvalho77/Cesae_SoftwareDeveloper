package Ex_03;

import java.util.ArrayList;

public class Pizza {
    private String codigo;
    private String nome, descricao;
    private double preco;
    private Tamanho tamanho;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>(5);

    public Pizza(String codigo, String nome, String descricao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public void addIngrediente(Ingrediente ingrediente, double quantidade){
        if(ingredientes.size()<5){
            ingredientes.add(ingrediente);
            ingrediente.setQuantidade(quantidade);
        }else{
            System.out.println("A pizza já tem os 5 ingredientes!!");
        }
    }

    public void removerIngrediente(Ingrediente ingrediente){
        int posicao = 0;
        posicao = ingredientes.indexOf(ingrediente);
        String ingredienteRemovido = ingredientes.remove(posicao).getCodigo();
    }

    public double totalCalorias(){
        double totalCalorias = 0;
        for (Ingrediente i: ingredientes){
            totalCalorias += i.getQuantidade()*i.getNumCalorias();
        }
        return totalCalorias;
    }

public void imprimirPizza(){
    System.out.println("***** " + this.nome + " *****");
    System.out.println("Código: " + this.codigo);
    System.out.println("Descricao: " + this.descricao);
    System.out.println("Preço: " + this.preco + "€");
    System.out.println("Tamanho: " + this.tamanho);
    int numIngrediente = 1;
    for (Ingrediente i: ingredientes){
        System.out.print("\ningrediente " + numIngrediente + ": ");
        i.imprimirIngrediente();
        numIngrediente++;
    }
}


}
