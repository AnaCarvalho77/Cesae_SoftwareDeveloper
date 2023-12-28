package Domain;

public class Momento {
    private String nome;
    private double atrasoPeso;
    private double atrasoPotencia;

    /**
     * Método construtor da classe Momento que recebe os seguintes parametros:
     * @param nome (string) o nome do momento
     * @param atrasoPeso (double) o valor do atraso do momento
     * @param atrasoPotencia (double) o valor do atraso da potencia
     */
    public Momento(String nome, double atrasoPeso, double atrasoPotencia) {
        this.nome = nome;
        this.atrasoPeso = atrasoPeso;
        this.atrasoPotencia = atrasoPotencia;
    }

    /**
     * Método para saber o valor da variável atrasoPeso
     * @return (double) retorna o valor de atraso de peso do momento
     */
    public double getAtrasoPeso() {
        return atrasoPeso;
    }

    /**
     * Método para saber o valor da variável atrasoPotencia
     * @return (double) retorna o valor de atraso de potencia do momento
     */
    public double getAtrasoPotencia() {
        return atrasoPotencia;
    }
}
