package Ex_03;

import Ex_03.enums.*;

public class main {
    public static void main(String[] args) {

        Base preferida = new Base("I9999", "MassaAlta",1.5, BasePizza.MassaAlta,"massa alta e fofa");
        Base tipica = new Base("I1111", "massa normal", 1.2,BasePizza.MassaFina,"massa fina e crocante");
        Queijo chedar = new Queijo("I7777", "Queijo chedar", UnidadeMedida.Gramas,40,OrigemIngrediente.Nacional, TipoQueijo.Cheddar);
        Carne frango = new Carne("I6666", "Carne de Frango", UnidadeMedida.Gramas,35,OrigemIngrediente.Nacional,TipoCarne.Frango);
        Vegetal ananas = new Vegetal("I5555", "Ananás", UnidadeMedida.Gramas,15,OrigemIngrediente.Nacional,TipoVegetal.ananas);
        FrutosMar camarao = new FrutosMar("I4444", "camarão", UnidadeMedida.Gramas,40,OrigemIngrediente.Nacional,TipoFrutosMar.Camarao);
        FrutosMar atum = new FrutosMar("I3333", "Atum",UnidadeMedida.Gramas,45,OrigemIngrediente.Importado,TipoFrutosMar.Atum);
        Vegetal molho = new Vegetal("I2222","molho de tomate", UnidadeMedida.Litros,56,OrigemIngrediente.Nacional,TipoVegetal.molhoTomate);

        PizzaIngrediente baseAlta = new PizzaIngrediente(preferida,200);
        PizzaIngrediente baseFina = new PizzaIngrediente(tipica,200);

//        PizzaIngrediente mozzarela = new PizzaIngrediente(chedar,35);
//        PizzaIngrediente chicken = new PizzaIngrediente(frango,50);
//        PizzaIngrediente molhoTomate = new PizzaIngrediente(molho,0.09);
//        PizzaIngrediente abacaxi = new PizzaIngrediente(ananas,50);
//        PizzaIngrediente tuna = new PizzaIngrediente(atum,25);



        Pizza portugal = new Pizza("P1991", "Pizza Portugal", "Pizza tradicional com ingredientes nacionais que promete levar quem a come numa viagme pela cultura de Portugal", 19.90, Tamanho.Grande);

        portugal.addIngrediente(baseAlta);
        portugal.addIngrediente(baseFina);
        portugal.addIngrediente(new PizzaIngrediente(molho,0.1));
        portugal.addIngrediente(new PizzaIngrediente(chedar,35));
        portugal.addIngrediente(new PizzaIngrediente(frango,50));
        portugal.addIngrediente(new PizzaIngrediente(ananas,50));
        portugal.addIngrediente(new PizzaIngrediente(atum,25));
        System.out.println();

        portugal.removerIngrediente("I6666");

        portugal.imprimirPizza();

        System.out.println();


        portugal.addIngrediente(new PizzaIngrediente(atum,25));
        System.out.println();
        portugal.imprimirPizza();


    }
}
