package Ex_09;

public class Produto {
    private String nome;
    private Double Preço;
    private int quantStock = 0;

    public Produto() {
    }

    public void comprar(int quant){
        this.quantStock += quant;
        System.out.println("\ncomprou "+ quant+ " e ficou com " + this.quantStock + " unidades em stock.");
    }
    public void vender(int quant){
        if(this.quantStock >= quant){
            this.quantStock -= quant;
            System.out.println("\nvendeu "+ quant+ " e ficou com " + this.quantStock + " unidades em stock.");
        }else{
            System.out.println("\nquantidade de stock insuficiente!!");
        }

    }

}


