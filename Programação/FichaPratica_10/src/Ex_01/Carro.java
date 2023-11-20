package Ex_01;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;
    private double potencia;
    private double cilindrada;
    private double consumo;
    private TipoCombustivel tipoCombustivel;


    public Carro(String marca, String modelo, int anoFabrico, double potencia, double cilindrada, double consumo, TipoCombustivel tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.consumo = consumo;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void ligar() {

        System.out.println("O carro está ligado!");
    }

    public void ligar(int anoAtual) {
        if (anoAtual - this.anoFabrico > 30) {
            if (this.tipoCombustivel.equals(TipoCombustivel.GASOLEO)) {
                System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado!\nVrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar… O carro está ligado!\nVrum-vum-vrum");
            }

        } else {
            if (this.potencia < 250) {
                System.out.println("O carro está ligado!\nVruummmmmmm");
            } else {
                System.out.println("O carro está ligado!\nVRUUMMMMMM");
            }
        }
    }

    public Carro corrida(Carro carro, int anoAtual) {
        if (carro.potencia > this.potencia) {
            return carro;
        } else if (carro.potencia < this.potencia) {
            return this;
        } else if (carro.potencia == this.potencia) {
            if (carro.cilindrada > this.cilindrada) {
                return carro;
            } else if (carro.cilindrada < this.cilindrada) {
                return this;
            } else if (carro.cilindrada == this.cilindrada) {
                if (anoAtual - carro.anoFabrico > anoAtual - this.anoFabrico) {
                    return carro;
                } else if (anoAtual - carro.anoFabrico < anoAtual - this.anoFabrico) {
                    return this;
                }

            }
        }

        return null;
    }

    public String getMarca() {
        return marca;
    }

    public double valorConsumido(double distancia){
        double valorConsumido = (distancia/100) * this.consumo;
        return valorConsumido;

    }

public void exibirDetalhes(){
    System.out.println(this.marca);
    System.out.println(this.modelo);
    System.out.println(this.anoFabrico);
    System.out.println(this.potencia);
    System.out.println(this.cilindrada);
}


}


