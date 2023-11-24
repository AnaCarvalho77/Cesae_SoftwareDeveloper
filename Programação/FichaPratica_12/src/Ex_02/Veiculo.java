package Ex_02;

public class Veiculo {
    private String marca, modelo;
    private int anoFabrico;
    private double potencia,cilindrada,consumo;
    private TipoCombustivel tipoCombustivel;

    public Veiculo(String marca, String modelo, int anoFabrico, double potencia, double cilindrada, double consumo, TipoCombustivel tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumo = consumo;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getMarca() {
        return marca;
    }


    public double getConsumo() {
        return consumo;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }
}
