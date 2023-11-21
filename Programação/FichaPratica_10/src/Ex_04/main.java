package Ex_04;

public class main {
    public static void main(String[] args) {
        Imovel casa = new Imovel("bjjhgjegh", 24, "porto", Tipo.casa,Acabamento.usada,200, 4, 3, 12);
        Imovel apartamento = new Imovel("kajlfh", 86, "braga", Tipo.apartamento, Acabamento.altoAcabamento, 100, 2, 2, 0);


        System.out.println("********** descrição imóvel 'casa' **********");
        casa.imprimirDescricao();

        System.out.println("\n********************");

        Imovel maisCaro = casa.compararImoveis(apartamento);

        System.out.println("******* o valor total do imóvel mais caro ************");
        System.out.println(maisCaro.valorImovel());

        System.out.println("********** descrição imóvel mais caro **********");
        maisCaro.imprimirDescricao();


    }
}
