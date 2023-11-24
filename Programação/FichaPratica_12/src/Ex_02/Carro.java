package Ex_02;

public class Carro extends Veiculo{
    private int quantPassageiros;

    public Carro(String marca, String modelo, int anoFabrico, double potencia, double cilindrada, double consumo, TipoCombustivel tipoCombustivel, int quantPassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo, tipoCombustivel);
        this.quantPassageiros = quantPassageiros;
    }

    public double calcularCusto(double km){
        double combustivel = 0;
       double consumoTotal = (km/100)*this.getConsumo();

       if (this.getTipoCombustivel().equals("GASOLINA")){
           combustivel = 2.10;
       }else if(this.getTipoCombustivel().equals("DIESEL")){
        combustivel = 1.95;
       }
       else if(this.getTipoCombustivel().equals("GPL")){
           combustivel = 1.15;
       }else if(this.getTipoCombustivel().equals("ELETRICO")){
           combustivel = 0.12;
       }
        double custoTotal = consumoTotal * combustivel;
        return custoTotal;
    }



}



