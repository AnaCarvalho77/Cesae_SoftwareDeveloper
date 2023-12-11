import java.util.Scanner;

public class Carro extends Veiculo{
    private int quantPassageiros;

    public Carro(String marca, String modelo, int anoFabrico, double potencia, double cilindrada, double consumo, TipoCombustivel tipoCombustivel, int quantPassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo, tipoCombustivel);
        this.quantPassageiros = quantPassageiros;
    }


    public double calcularCusto(double km){
        double combustivel = 0;
       double consumoTotal = (km/100)*this.getConsumo();

       if (this.getTipoCombustivel().equals(TipoCombustivel.GASOLINA)){
           combustivel = 2.10;
       }else if(this.getTipoCombustivel().equals(TipoCombustivel.DIESEL)){
        combustivel = 1.95;
       }
       else if(this.getTipoCombustivel().equals(TipoCombustivel.GPL)){
           combustivel = 1.15;
       }else if(this.getTipoCombustivel().equals(TipoCombustivel.ELETRICO)){
           combustivel = 0.12;
       }
        double custoTotal = consumoTotal * combustivel;
        return custoTotal;
    }

    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("quantidade de passageiros: " + this.quantPassageiros);
    }


    public void ligar() {

        System.out.println("O carro está ligado!");
    }

    public void ligar(int anoAtual) {
        if (anoAtual - this.getAnoFabrico() > 30) {
            if (this.getTipoCombustivel().equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado!\nVrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar… O carro está ligado!\nVrum-vum-vrum");
            }

        } else {
            if (this.getPotencia() < 250) {
                System.out.println("O carro está ligado!\nVruummmmmmm");
            } else {
                System.out.println("O carro está ligado!\nVRUUMMMMMM");
            }
        }
    }



    }




