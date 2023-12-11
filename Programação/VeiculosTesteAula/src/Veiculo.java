public class Veiculo {
    private String marca, modelo;
    private int anoFabrico;
    private double potencia, cilindrada, consumo;
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

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }


    public double getConsumo() {
        return consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public double getPotencia() {
        return potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void imprimirDados() {
        System.out.println("marca: " + this.marca);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ano de fabrico: " + this.anoFabrico);
        System.out.println("potencia: " + this.potencia);
        System.out.println("cilindrada: " + this.cilindrada);
        System.out.println("tipo de combustivel: " + this.tipoCombustivel);
        System.out.println("consumo: " + this.consumo);
    }

    public Veiculo corrida(Veiculo veiculo, int anoAtual) {
        if (veiculo.potencia > this.potencia) {
            return veiculo;
        } else if (veiculo.potencia < this.potencia) {
            return this;
        } else if (veiculo.potencia == this.potencia) {
            if (veiculo.cilindrada > this.cilindrada) {
                return veiculo;
            } else if (veiculo.cilindrada < this.cilindrada) {
                return this;
            } else if (veiculo.cilindrada == this.cilindrada) {
                if (anoAtual - veiculo.anoFabrico > anoAtual - this.anoFabrico) {
                    return veiculo;
                } else if (anoAtual - veiculo.anoFabrico < anoAtual - this.anoFabrico) {
                    return this;
                }

            }
        }

        return null;
    }


    public double valorConsumido(double distancia) {
        double valorConsumido = (distancia * this.getConsumo()) / 100;
        return valorConsumido;


    }
}

