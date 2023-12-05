package Ex_03;

import Ex_03.Enums.AreaFormacao;

import java.util.Scanner;

public class Disciplina {
    private String nome;
    private AreaFormacao area;
    private int duracaoHoras;


    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    /**
     * Método construtor a partir da consola
     */
    public Disciplina(){
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        String nome;
        AreaFormacao area = null;
        int indexArea;
        int duracaoHoras;

        System.out.println("***Nova Disciplina**");

        //nome da disciplina
        System.out.print("Nome: ");
        nome = input.nextLine();

        //area
        System.out.println("\nÁreas de Formação");
        int contador = 1;
        for (AreaFormacao i: AreaFormacao.values()) {
            System.out.println(contador++ + ": " + i);
        }
        System.out.print("\nÁrea de Formação: ");
        indexArea = input.nextInt();

        contador = 1;
        for (AreaFormacao i: AreaFormacao.values()) {
            if(indexArea == contador){
                area = i;
            }
            contador++;
        }
        System.out.println("Área escolhida: " + area);

        //duracao
        System.out.print("\n Duracao(h): ");
        duracaoHoras = input.nextInt();

        //construir objeto
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    public String getNome() {
        return nome;
    }

    public AreaFormacao getArea() {
        return area;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome + "\t| Área Formação: " + this.area + "\t| Duracção: " + this.duracaoHoras);
    }
}
