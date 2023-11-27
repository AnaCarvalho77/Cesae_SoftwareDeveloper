package Ex_03;

public class main {
    public static void main(String[] args) {

        Base preferida = new Base("I9999", "MassaAlta", UnidadeMedida.Gramas,1.5,BasePizza.MassaAlta,"massa alta e fofa");
        Topping nham = new Topping("I8888", "Mozzarela", UnidadeMedida.Gramas,30,OrigemIngrediente.Nacional);

        Ingrediente massaAlta = new Ingrediente("I9922","Massa Alta", UnidadeMedida.Gramas,1.5);
        PizzaIngrediente um = new PizzaIngrediente(massaAlta,200);
        Ingrediente queijoCabra = new Ingrediente("I3476", "Qeuijo de Carbra",UnidadeMedida.Gramas, 2.8);
        PizzaIngrediente dois = new PizzaIngrediente(queijoCabra,75);
        Ingrediente  chourico = new Ingrediente("I4445", "Rodela Chouriça de Mirandela", UnidadeMedida.Unidades,35);
        PizzaIngrediente tres = new PizzaIngrediente(chourico,10);
        Ingrediente molhoTomate = new Ingrediente("I0015", "Molho Tomate",UnidadeMedida.Litros,325);
        PizzaIngrediente quatro = new PizzaIngrediente(molhoTomate,0.09);
        Ingrediente pimento = new Ingrediente("I0900","Fatia Pimento Verde", UnidadeMedida.Unidades, 4);
        PizzaIngrediente cinco = new PizzaIngrediente(pimento,6);

        Pizza portugal = new Pizza("P1991", "Pizza Portugal", "Pizza tradicional com ingredientes nacionais que promete levar quem a come numa viagme pela cultura de Portugal", 19.90,Tamanho.Grande,);

        portugal.addIngrediente(um);
        portugal.addIngrediente(dois);
        portugal.addIngrediente(tres);
        portugal.addIngrediente(quatro);
        portugal.addIngrediente(cinco);

        portugal.removerIngrediente(dois);

        portugal.imprimirPizza();

        System.out.println();

        dois.imprimirIngrediente();


    }
}
