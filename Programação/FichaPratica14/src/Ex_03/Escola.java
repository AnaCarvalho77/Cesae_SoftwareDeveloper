package Ex_03;

import Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String localizacao;
    private int lotacaoMaxima;
    private ArrayList<Professor> listaProfessores;
    private ArrayList<Disciplina> listaDisciplinas;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Funcionario> listaFuncionários;


    public Escola(String nome, String localizacao, int lotacaoMaxima) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.lotacaoMaxima = lotacaoMaxima;
        this.listaProfessores = new ArrayList<>();
        this.listaDisciplinas = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
        this.listaFuncionários = new ArrayList<>();
    }

        public void addProfessor(Professor professorNovo){
            this.listaProfessores.add(professorNovo);
        }

        public void addDisciplina(Disciplina disciplinaNova){
            this.listaDisciplinas.add(disciplinaNova);
        }
        public void addCurso(Curso cursoNovo){
            this.listaCursos.add(cursoNovo);
        }
    public void addAluno(Aluno alunoNovo){
        this.listaAlunos.add(alunoNovo);
    }
    public void addFuncionario(Funcionario funcionarioNovo){
        this.listaFuncionários.add(funcionarioNovo);
    }

    public ArrayList<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public ArrayList<Funcionario> getListaFuncionários() {
        return listaFuncionários;
    }

    public void imprimirDisciplinas(){
            int contador=1;
            for(Disciplina i: this.listaDisciplinas){
                System.out.print(contador++ + ": ");
                i.exibirDetalhes();
            }
        System.out.println();
        }

    public void imprimirProfessoresCompetentes(AreaFormacao areaFormacao){
        int contador = 1;
        System.out.println("*** Professores Competentes ***");
        for(Professor i:  this.listaProfessores);
    }
}
