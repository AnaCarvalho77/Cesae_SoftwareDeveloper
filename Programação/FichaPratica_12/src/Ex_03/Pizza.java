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

    public Pizza(String codigo, String nome, String descricao, double preco, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public void addIngrediente(PizzaIngrediente ingrediente){

        if(ingredientes.size()<5){
            for(PizzaIngrediente i: ingredientes) {
                if (i.getIngrediente() instanceof Base) {
                    addBase = true;
                }
            }
            if(addBase){
                if(ingrediente.getIngrediente()instanceof Base){
                    System.out.println("A pizza já tem uma base. Não pode adicionar outra.Adicone ingredientes Topping");
                }else{
                    if(ingrediente.getIngrediente()instanceof Carne || ingrediente.getIngrediente()instanceof Queijo || ingrediente.getIngrediente()instanceof Vegetal || ingrediente.getIngrediente()instanceof FrutosMar){
                        ingredientes.add(ingrediente);
                        System.out.println("foi adicionado o ingrediente " + ingrediente.getIngrediente().getNome());
                    }else{
                        System.out.println("Só pode colocar Topping");
                    }
                }
            }else{
                if(ingrediente.getIngrediente()instanceof Base){
                    ingredientes.add(ingrediente);
                    System.out.println("foi adicionado o ingrediente " + ingrediente.getIngrediente().getNome());
                }else{
                    System.out.println("A pizza ainda não tem base");
                }
            }
        }else{
            System.out.println("A pizza já tem os 5 ingredientes!! Assim já não pode ser adicionado o ingrediente " + ingrediente.getIngrediente().getNome());
        }
    }


    public void mudarQuantidadeIngrediente(Ingrediente ingrediente, double quantidadeNova){
        for(PizzaIngrediente i: this.ingredientes){
            //Se o Ingrediente do IngredientePizza for igual ao passado por parametro
            if(i.getIngrediente()==ingrediente){
                //vou alterar a quantidade do IngredientePizza
                i.setQuantidade(quantidadeNova);
            }
        }
    }
    public void removerIngrediente(String codigoIngredienteRemover){
        int posicao = 0;
        if(posicao >= 1 && posicao <=5){
            for(PizzaIngrediente i: ingredientes){
                if(i.getIngrediente().getCodigo().equals(codigoIngredienteRemover) ){
                    this.ingredientes.remove(posicao);
                    System.out.println("o ingrediente removido foi: " + i.getIngrediente().getNome());
                }
            }

        }else if (posicao==0){
            addBase = false;
        }

    }

    public double totalCalorias(){
        double totalCalorias = 0;
        for (PizzaIngrediente i: this.ingredientes){
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
