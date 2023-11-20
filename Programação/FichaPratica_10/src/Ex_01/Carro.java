package Ex_01;

public class Carro {
        private String marca;
        private String modelo;
        private int anoFabrico;
        private double potencia;
        private double cilindrada;
        private double consumo;
        private TipoCombustivel tipoCombustivel;

        public Carro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.anoFabrico = ano;

        }



        public void ligar(){

            System.out.println("O carro está ligado!");
        }

        public void ligar(int anoAtual){
           if(this.anoFabrico > (anoAtual - this.anoFabrico)) {
                if(this.tipoCombustivel.equals("Gasoleo")){
                    System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado! Vrum-vrum-vrum");
                }else{
                    System.out.println("Custa a pegar… O carro está ligado! Vrum-vum-vrum");
                }

            }else{
               if(this.potencia < 250){
                   System.out.println("O carro está ligado! Vruummmmmmm");
               }else {
                   System.out.println("O carro está ligado! VRUUMMMMMM");
               }
           }
        }

        public Carro corrida(Carro carro, int anoAtual){
            if(carro.potencia > this.potencia){
                if(carro.cilindrada > this.cilindrada ){
                    if(ano )
                }else if(carro.cilindrada < this.cilindrada){
                    return this;
                }
            }else if (carro.potencia < this.potencia){
                return this;
            }
        }

}
