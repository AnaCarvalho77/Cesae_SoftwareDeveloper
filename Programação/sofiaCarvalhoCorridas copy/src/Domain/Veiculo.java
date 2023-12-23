package Domain;

public abstract class Veiculo {
    private String id;
    private String marca;
    private String modelo;
    private int potenciaCV;
    private double pesoKg;
    private int desgaste;
    private int preco;

    /**
     * Método construtor da classe Veiculo com os seguintes parametros:
     * @param id (string) id do veiculo
     * @param marca (string) marca do veiculo
     * @param modelo (string) modelo do veiculo
     * @param potenciaCV (int) potencia do veiculo
     * @param pesoKg (double) peso do veiculo em kg
     * @param desgaste (int) valor desgaste do veiculo
     * @param preco (int) preço do veiculo
     */
    public Veiculo(String id, String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.pesoKg = pesoKg;
        this.desgaste = desgaste;
        this.preco = preco;
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

    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public void mostrarDetalhes(){
        System.out.print("Referência : " + this.id + "\t| Marca: " + this.marca + "\t| Modelo: " + this.modelo + "\t| POtência: " + this.potenciaCV + "\t| PesoKg: " + this.pesoKg + "\t| Desgaste: " + this.desgaste + "\t| Preço: " + this.preco);
    }
}
