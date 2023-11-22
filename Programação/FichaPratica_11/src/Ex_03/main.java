package Ex_03;

import Ex_02.Sorteio;

public class main {
    public static void main(String[] args) {
        Peixe pargo = new Peixe("Pargo", 1005, 5.99);
        Peixe salmao = new Peixe("Salmão", 3050, 8.99);
        Peixe pescada = new Peixe("Pescada", 4001, 9.99);
        Marisco camarao = new Marisco("camarão", 1100, 6.99);
        Marisco sapateira = new Marisco("sapateira", 2000, 24.99);
        Marisco caranguejo = new Marisco("caranguejo", 1300, 22.99);

        BarcoPesca meuBarco = new BarcoPesca("golias", "vermelho", "2015", 20, 5000,Marca.Mazury);

        meuBarco.adicionar(pargo);
        System.out.print("A carga atual do barco é: " + meuBarco.capacidadeAtual() + " e a capacidade total é: " + meuBarco.getCapacidadeCarga() + "\n");
        meuBarco.adicionar(camarao);
        System.out.print("A carga atual do barco é: " + meuBarco.capacidadeAtual() + " e a capacidade total é: " + meuBarco.getCapacidadeCarga() + "\n");
        meuBarco.largarPeixe(0);
        System.out.print("A carga atual do barco é: " + meuBarco.capacidadeAtual() + " e a capacidade total é: " + meuBarco.getCapacidadeCarga() + "\n");
        meuBarco.adicionar(salmao);
        System.out.print("A carga atual do barco é: " + meuBarco.capacidadeAtual() + " e a capacidade total é: " + meuBarco.getCapacidadeCarga() + "\n");
        meuBarco.adicionar(sapateira);
        System.out.print("A carga atual do barco é: " + meuBarco.capacidadeAtual() + " e a capacidade total é: " + meuBarco.getCapacidadeCarga() + "\n");
        meuBarco.adicionar(pescada);
        System.out.print("A carga atual do barco é: " + meuBarco.capacidadeAtual() + " e a capacidade total é: " + meuBarco.getCapacidadeCarga() + "\n");
        meuBarco.largarMarisco(0);
        System.out.print("A carga atual do barco é: " + meuBarco.capacidadeAtual() + " e a capacidade total é: " + meuBarco.getCapacidadeCarga() + "\n");
        meuBarco.adicionar(caranguejo);
        System.out.print("A carga atual do barco é: " + meuBarco.capacidadeAtual() + " e a capacidade total é: " + meuBarco.getCapacidadeCarga() + "\n");

        System.out.println(meuBarco.calcularTotal());
        System.out.println(meuBarco.salarioTripulacao(meuBarco.calcularTotal()));


    }
}
