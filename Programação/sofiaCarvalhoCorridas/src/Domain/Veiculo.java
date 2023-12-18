package Domain;

public abstract class Veiculo {
    private String id;
    private String marca;
    private String modelo;
    private int potenciaCV;
    private double pesoKg;
    private int desgaste;
    private int preco;

    public Veiculo(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.pesoKg = pesoKg;
        this.desgaste = desgaste;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public int getDesgaste() {
        return desgaste;
    }

    public int getPreco() {
        return preco;
    }

    public void mostrarDetalhes(){
        System.out.print(this.id + "\t| " + this.marca + "\t| " + this.modelo + "\t| " + this.potenciaCV + "\t| " + this.pesoKg + "\t| " + this.preco);
    }
}
