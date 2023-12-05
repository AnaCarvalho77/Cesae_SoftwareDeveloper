package Ex_03;

import Ex_03.Enums.Funcao;

public class Funcionario extends Pessoa{
    private Funcao funcao;

    public Funcionario(String nome, int anoNascimento, String email, String telemovel, Funcao funcao) {
        super(nome, anoNascimento, email, telemovel);
        this.funcao = funcao;
    }


    @Override
    public double obetrFuncao() {
        return 0;
    }

    @Override
    public void imprimirHorario() {

    }
}
