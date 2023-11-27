package Ex_03;

import java.util.ArrayList;

public class Pizza {
    private String codigo;
    private String nome, descricao;
    private double preco;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>(5);

    public Pizza(String codigo, String nome, String descricao, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void imprimirPizza(){

    }

    public void addIngrediente(Ingrediente ingrediente){
        if(ingredientes.size()<5){
            ingredientes.add(ingrediente);
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
    }



}
