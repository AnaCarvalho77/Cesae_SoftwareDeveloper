package Ex_03;

import Ex_03.enums.*;

public class main {
    public static void main(String[] args) {

        Base preferida = new Base("I9999", "MassaAlta",1.5, BasePizza.MassaAlta,"massa alta e fofa");
        Topping nham = new Topping("I8888", "Mozzarela", UnidadeMedida.Gramas,30, OrigemIngrediente.Nacional);
        Queijo chedar = new Queijo("I7777", "Queijo chedar", UnidadeMedida.Gramas,40,OrigemIngrediente.Nacional, TipoQueijo.Cheddar);
        Carne frango = new Carne("I6666", "Carne de Frango", UnidadeMedida.Gramas,35,OrigemIngrediente.Nacional,TipoCarne.Frango);
        Vegetal ananas = new Vegetal("I5555", "Ananás", UnidadeMedida.Gramas,15,OrigemIngrediente.Nacional,TipoVegetal.ananas);
        FrutosMar camarao = new FrutosMar("I4444", "camarão", UnidadeMedida.Gramas,40,OrigemIngrediente.Nacional,TipoFrutosMar.Camarao);
        FrutosMar atum = new FrutosMar("I3333", "Atum",UnidadeMedida.Gramas,45,OrigemIngrediente.Importado,TipoFrutosMar.Atum);
        Vegetal molho = new Vegetal("I2222","molho de tomate", UnidadeMedida.Litros,56,OrigemIngrediente.Nacional,TipoVegetal.molhoTomate);

        PizzaIngrediente baseAlta = new PizzaIngrediente(preferida,200);

        PizzaIngrediente mozzarela = new PizzaIngrediente(nham,75);
        Ingrediente  chourico = new Ingrediente("I4445", "Rodela Chouriça de Mirandela", UnidadeMedida.Unidades,35);
        PizzaIngrediente tres = new PizzaIngrediente(chourico,10);
        Ingrediente molhoTomate = new Ingrediente("I0015", "Molho Tomate",UnidadeMedida.Litros,325);
        PizzaIngrediente quatro = new PizzaIngrediente(molhoTomate,0.09);
        Ingrediente pimento = new Ingrediente("I0900","Fatia Pimento Verde", UnidadeMedida.Unidades, 4);
        PizzaIngrediente cinco = new PizzaIngrediente(pimento,6);

        Pizza portugal = new Pizza("P1991", "Pizza Portugal", "Pizza tradicional com ingredientes nacionais que promete levar quem a come numa viagme pela cultura de Portugal", 19.90, Tamanho.Grande, baseAlta, mozzarela);

        portugal.addIngrediente(tres);
        portugal.addIngrediente(quatro);
        portugal.addIngrediente(cinco);

        portugal.removerIngrediente(tres);

        portugal.imprimirPizza();

        System.out.println();

        tres.imprimirIngrediente();


    }
}
