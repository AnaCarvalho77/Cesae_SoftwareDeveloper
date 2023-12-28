package Domain;

/**
 * superclasse abstrata Veiculo para veiculos
 */
public abstract class Veiculo {
    /**
     * variável do tipo string para guardar o id do veiculo
     */
    private String id;
    /**
     * variável do tipo string para guadar a marca do veiculo
     */
    private String marca;
    /**
     *  variável do tipo string para guardar o modelo do veiculo
     */
    private String modelo;
    /**
     * variável do tipo inteiro para guardar a potência em cavalos do veiculo
     */
    private int potenciaCV;
    /**
     * variável do tipo double para guadar o peso em kg do veiculo
     */
    private double pesoKg;
    /**
     * variavel do tipo inteiro para guardar o valor de desgaste do veiculo
     */
    private int desgaste;
    /**
     * variável do tipo inteiro para guardar o preço em fichas de corrida do veiculo
     */
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

    /**
     * Método para obter o valor da potencia em cavalos
     * @return (int) o valor da variável Potência CV
     */
    public int getPotenciaCV() {
        return potenciaCV;
    }

    /**
     * Método para obter o valor do peso em kilogramas
     * @return (double) valor da variável PesoKg
     */
    public double getPesoKg() {
        return pesoKg;
    }

    /**
     * Método para obter o valor do desgaste
     * @return( double) valor da variável desgaste
     */
    public int getDesgaste() {
        return desgaste;
    }

    /**
     * Método para obter o preço (quantidade de fichas)
     * @return (int) valor da variável preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * Método para alterar o valor da variável desgaste
     * @param desgaste recebe o novo valor de desgaste
     */
    public void setDesgaste(int desgaste) {
        this.desgaste = desgaste;
    }

    /**
     * Método para alterar a variável pesoKg
     * @param pesoKg recebe o novo peso em kg como parametro
     */
    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    /**
     * Método para alterar a variável potenciaCV
     * @param potenciaCV recebe o novo valor de potencia em cavalos como parametro
     */
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    /**
     * Método para imprimir os detalhes de um veiculo
     */
    public void mostrarDetalhes(){
        System.out.print("Referência : " + this.id + "\t| Marca: " + this.marca + "\t| Modelo: " + this.modelo + "\t| POtência: " + this.potenciaCV + "\t| PesoKg: " + this.pesoKg + "\t| Desgaste: " + this.desgaste + "\t| Preço: " + this.preco);
    }
}
