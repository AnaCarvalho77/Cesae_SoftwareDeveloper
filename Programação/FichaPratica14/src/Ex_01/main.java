package Ex_01;

public class main {
    public static void main(String[] args) {
        Retangulo terreno1 = new Retangulo("Preto", 200, 10);
        Retangulo terreno2 = new Retangulo("Castanho", 20,40);

        Circulo terreno3 = new Circulo("Amarelo", 10);

        Triangulo terreno4 = new Triangulo("Azul", 10,5);

        GestorTerrenos gt = new GestorTerrenos("Vitor");

        gt.addTerreno(terreno1);
        gt.addTerreno(terreno2);
        gt.addTerreno(terreno3);
        gt.addTerreno(terreno4);

        

        System.out.println(gt.calcularAreaTerrenos());


    }

}
