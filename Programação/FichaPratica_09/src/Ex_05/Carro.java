package Ex_05;

public class Carro {
    private String marca;
    private String modelo;
    private String data;

    public Carro(String marca, String modelo, String data) {
        this.marca = marca;
        this.modelo = modelo;
        this.data = data;
    }

    public void ligar(){
        System.out.println("O carro está ligado!");
    }

}
