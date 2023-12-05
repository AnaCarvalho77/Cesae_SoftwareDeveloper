package Ex_03;

import Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;
    private ArrayList<DisciplinaCurso> planoCurricular;
    private boolean longaDuracao;

    public Curso(Escola escola) {
        Scanner input = new Scanner(System.in);

        //Declarar variaveis
        String nome;
        int codigoDisciplina;
        int quantidadeDisciplinas;

        System.out.println("*** Novo curso ***");

        //Nome
        System.out.print("nome: ");
        nome = input.nextLine();

        //Quantidade Disciplinas
        System.out.print("\nQuantidade Disciplinas: ");
        quantidadeDisciplinas = input.nextInt();

        //ciclo para adicionar disciplinas  curso
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            escola.imprimirDisciplinas();
            System.out.print("Código Disciplina: ");
            codigoDisciplina = input.nextInt();
            codigoDisciplina--;

           Disciplina disciplina = escola.getListaDisciplinas().get(codigoDisciplina);

           ArrayList<Professor> professoresCompetentes  = new ArrayList<>();

           for(Professor professorAtual: escola.getListaProfessores()){
               for(AreaFormacao areaFormacaoAtual: professorAtual.getAreaFormacao()){
                   if (areaFormacaoAtual.equals(disciplina.getArea())) {
                       professoresCompetentes.add(professorAtual);
                   }
               }
           }
            System.out.println(" *** Professores Competentes ****);
                    int contador = 1;
            for(Professor professorAtual: professoresCompetentes){
                System.out.println();
            }


        }
    }







    public ArrayList<DisciplinaCurso> getDisciplinas() {
        return planoCurricular;
    }
}
