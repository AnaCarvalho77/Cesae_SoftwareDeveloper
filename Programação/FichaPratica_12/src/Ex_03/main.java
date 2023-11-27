package Ex_03;

public class main {
    public static void main(String[] args) {

        Base preferida = new Base("I9999", "MassaAlta", UnidadeMedida.Gramas,1.5,BasePizza.MassaAlta,"massa alta e fofa");
        Topping nham = new Topping("I8888", "Mozzarela", UnidadeMedida.Gramas,30,OrigemIngrediente.Nacional);

        PizzaIngrediente baseAlta = new PizzaIngrediente(preferida,200);

        PizzaIngrediente mozzarela = new PizzaIngrediente(nham,75);
        Ingrediente  chourico = new Ingrediente("I4445", "Rodela Chouriça de Mirandela", UnidadeMedida.Unidades,35);
        PizzaIngrediente tres = new PizzaIngrediente(chourico,10);
        Ingrediente molhoTomate = new Ingrediente("I0015", "Molho Tomate",UnidadeMedida.Litros,325);
        PizzaIngrediente quatro = new PizzaIngrediente(molhoTomate,0.09);
        Ingrediente pimento = new Ingrediente("I0900","Fatia Pimento Verde", UnidadeMedida.Unidades, 4);
        PizzaIngrediente cinco = new PizzaIngrediente(pimento,6);

        Pizza portugal = new Pizza("P1991", "Pizza Portugal", "Pizza tradicional com ingredientes nacionais que promete levar quem a come numa viagme pela cultura de Portugal", 19.90,Tamanho.Grande, baseAlta, mozzarela);

        portugal.addIngrediente(tres);
        portugal.addIngrediente(quatro);
        portugal.addIngrediente(cinco);

        portugal.removerIngrediente(tres);

        portugal.imprimirPizza();

        System.out.println();

        tres.imprimirIngrediente();


    }
}
