package Ex_03;

import Ex_03.Enums.AreaFormacao;

import java.util.ArrayList;

public class Professor extends Pessoa {
    ArrayList<AreaFormacao> areaFormacao;
    int nivelAcademico;

    public Professor(String nome, int anoNascimento, String email, String telemovel, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.nivelAcademico = nivelAcademico;
        this.areaFormacao = new ArrayList<>();
    }

    public ArrayList<AreaFormacao> getAreaFormacao() {
        return areaFormacao;
    }

    @Override
    public double obetrFuncao() {
        return 0;
    }

    @Override
    public void imprimirHorario() {

    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
    }

    public void exibirDetalhesMinimos(){
        System.out.print(super.getNome());
    }
}
