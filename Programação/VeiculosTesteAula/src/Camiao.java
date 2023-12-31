public class Camiao extends Veiculo{
    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, double potencia, double cilindrada, double consumo, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo, TipoCombustivel.DIESEL);
        this.capacidadeCarga = capacidadeCarga;
    }

//    public double cargaAtual(double carga){
//        double cargaAtual = 0;
//        cargaAtual += carga;
//        return cargaAtual;
//    }


    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public double custoViagem(double distancia, double carga){
        double custo = 0;
        double aumentoConsumo= 0;
        aumentoConsumo = (carga/100) * 0.1;
        custo = (distancia/100)*(this.getConsumo() * (1+aumentoConsumo)) *1.95;
        return custo;
    }
    public void viagem (double distancia,double carga){
        double custoViagem = custoViagem(distancia,carga);
        if(this.capacidadeCarga >= carga){
            System.out.println("Camião tem capacidade para fazer a viagem");
            System.out.println("O Custo da viagem vai ser de: " + custoViagem);
        }else{
            System.out.println("Camião não pode fazer a viagem porque não suporta a carga!");
        }

    }
    @Override
    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("capacidade da carga: " + this.capacidadeCarga);

    }




}
