package Ex_03;

import java.util.ArrayList;

public class Pizza {
    private String codigo;
    private String nome, descricao;
    private double preco;
    private Tamanho tamanho;
    private ArrayList<PizzaIngrediente> ingredientes = new ArrayList<>(5);

    public Pizza(String codigo, String nome, String descricao, double preco, Tamanho tamanho, PizzaIngrediente base , PizzaIngrediente topping) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        ingredientes.add(base);
        ingredientes.add(topping);
    }

    public void addIngrediente(PizzaIngrediente ingrediente){
        if(ingredientes.size()<5){
            ingredientes.add(ingrediente);
        }else{
            System.out.println("A pizza já tem os 5 ingredientes!!");
        }
    }

    public void removerIngrediente(PizzaIngrediente ingrediente){
        int posicao = 0;
        posicao = ingredientes.indexOf(ingrediente);
        ingredientes.remove(posicao);
    }

    public double totalCalorias(){
        double totalCalorias = 0;
        for (PizzaIngrediente i: ingredientes){
            totalCalorias += i.totalCaloriasIngrediente();
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
    for (PizzaIngrediente i: ingredientes){
        System.out.print("\ningrediente " + numIngrediente + ": ");
        i.imprimirIngrediente();
        numIngrediente++;
    }
}


}
