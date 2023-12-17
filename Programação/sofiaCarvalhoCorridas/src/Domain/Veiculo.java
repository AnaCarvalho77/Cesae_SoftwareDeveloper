package Domain;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int potenciaCV;
    private double pesoKg;
    private int desgaste;
    private int preco;

    public Veiculo(String marca, String modelo, int potenciaCV, double pesoKg, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.pesoKg = pesoKg;
        this.preco = preco;
    }

    public void mostrarDetalhes(){
        System.out.println(this.marca + "\t| " + this.modelo + "\t| " + this.potenciaCV + "\t| " + this.pesoKg + "\t| " + this.preco);
    }
}
