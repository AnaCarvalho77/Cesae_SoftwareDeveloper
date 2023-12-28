package Domain;

/**
 * classe Momento para os momentos existentes nas pistas de corrida
 */
public class Momento {
    /**
     * variável do tipo string para guardar o nome do momento
     */
    private String nome;
    /**
     * variável do tipo double para armazenar o valor de atraso peso provocado pelo momento
     */
    private double atrasoPeso;
    /**
     * variável do tipo double para guardar o valor de atraso potência provocado pelo momento
     */
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
