package Ex_03;

import Ex_03.enums.Tamanho;

import java.util.ArrayList;

public class Pizza {
    private String codigo;
    private String nome, descricao;
    private double preco;
    private Tamanho tamanho;
    private ArrayList<PizzaIngrediente> ingredientes = new ArrayList<>(5);
    private boolean addBase = false;

    public Pizza(String codigo, String nome, String descricao, double preco, Tamanho tamanho, PizzaIngrediente base , PizzaIngrediente topping) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        ingredientes.add(base);
        addBase = true;
        ingredientes.add(topping);
    }

    public void addIngrediente(PizzaIngrediente ingrediente){
        boolean addbase = false;
        if(ingredientes.size()<5){
            for(PizzaIngrediente i: ingredientes) {
                if (i.getIngrediente() instanceof Base) {
                    addBase = true;
                    break;
                }
            }
            if(addbase){
                if(ingrediente.getIngrediente()instanceof Base){
                    System.out.println("A pizza já tem uma base. Não pode adicionar outra.Adicone ingredientes Topping");
                }else{
                    if(ingrediente.getIngrediente()instanceof Carne || ingrediente.getIngrediente()instanceof Queijo || ingrediente.getIngrediente()instanceof Vegetal || ingrediente.getIngrediente()instanceof FrutosMar){
                        ingredientes.add(ingrediente);
                    }else{
                        System.out.println("Só pode colocar Topping");
                    }
                }
            }else{
                System.out.println("A pizza ainda não tem base");
            }
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
