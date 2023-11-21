package Ex_04;

public class Imovel {
    private String rua;
    private int numeroPorta;
    private String cidade;
    private Tipo tipo;
    private Acabamento acabamento;
    private double area;
    private int numQuartos;
    private int numCasaBanho;
    private double areaPiscina;


    public Imovel(String rua, int numeroPorta, String cidade, Tipo tipo, Acabamento acabamento, double area, int numQuartos, int numCasaBanho, double areaPiscina) {
        this.rua = rua;
        this.numeroPorta = numeroPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numCasaBanho = numCasaBanho;
        this.areaPiscina = areaPiscina;
    }

    public double valorImovel(){
        double valorTotal = 0;
        if(this.tipo.equals("apartamento")){
            valorTotal = this.area * 1000;
        } else if (this.tipo.equals("casa")){
            valorTotal = this.area * 3000;
        }else{
           valorTotal = this.area * 5000;
        }

        valorTotal += (this.numQuartos * 7500);
        valorTotal += (this.numCasaBanho * 10500);
        valorTotal += (this.areaPiscina * 1000);


        if(this.acabamento.equals("restauro")){
            valorTotal *= 0.5;
        }else if(this.acabamento.equals("usada")){
            valorTotal *= 0.9;
        }else if(this.acabamento.equals("altoAcabamento")){
            valorTotal *= 1.25;
        }
        return valorTotal;
    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }

    public void imprimirDescricao(){
        System.out.println("Rua: " + this.rua);
        System.out.println("numero da Porta: " + this.numeroPorta);
        System.out.println("cidade: " + this.cidade);
        System.out.println("tipo: " + this.tipo);
        System.out.println("acabamento: " + this.acabamento);
        System.out.println("area: " + this.area);
        System.out.println("numero de Quartos: " + this.numQuartos);
        System.out.println("numero de Casas de Banho: " + this.numCasaBanho);
        System.out.println("area a piscinas: " + this.areaPiscina);
    }

    public void compararImoveis(Imovel imovelNovo){
        System.out.println("o imóvel mais caro é: ");
        if(this.valorImovel() > imovelNovo.valorImovel()){
            this.imprimirDescricao();
        }else if(this.valorImovel() > imovelNovo.valorImovel()){
            imovelNovo.imprimirDescricao();
        }else{
            System.out.println("os imóveis tem o mesmo valor");
        }
    }
}
