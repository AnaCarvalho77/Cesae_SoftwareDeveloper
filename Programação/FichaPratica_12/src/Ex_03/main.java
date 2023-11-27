package Ex_03;

public class main {
    public static void main(String[] args) {

        Ingrediente massaAlta = new Ingrediente("I9922","Massa Alta", UnidadeMedida.Gramas,1.5);
        Ingrediente queijoCabra = new Ingrediente("I3476", "Qeuijo de Carbra",UnidadeMedida.Gramas, 2.8);
        Ingrediente  chourico = new Ingrediente("I4445", "Rodela Chouriça de Mirandela", UnidadeMedida.Unidades,35);
        Ingrediente molhoTomate = new Ingrediente("I0015", "Molho Tomate",UnidadeMedida.Litros,325);
        Ingrediente pimento = new Ingrediente("I0900","Fatia Pimento Verde", UnidadeMedida.Unidades, 4);

        Pizza portugal = new Pizza("P1991", "Pizza Portugal", "Pizza tradicional com ingredientes nacionais que promete levar quem a come numa viagme pela cultura de Portugal", 19.90,Tamanho.Grande);

        portugal.addIngrediente(massaAlta,200);
        portugal.addIngrediente(queijoCabra, 75);
        portugal.addIngrediente(chourico,10);
        portugal.addIngrediente(molhoTomate, 0.09);
        portugal.addIngrediente(pimento, 6);

        portugal.removerIngrediente(queijoCabra);

        portugal.imprimirPizza();

        System.out.println();

        queijoCabra.imprimirIngrediente();
    }
}
