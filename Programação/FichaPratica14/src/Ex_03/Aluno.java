package Ex_03;

import Ex_03.Enums.Curso;

import java.util.ArrayList;

public class Aluno extends Pessoa{
        private Curso curso;
        private double mediaNotas;
        private String [][] pauta;

        public Aluno(String nome, int anoNascimento, String email, String telemovel, Curso curso, double mediaNotas, String[][] pauta) {
                super(nome, anoNascimento, email, telemovel);
                this.curso = curso;
                this.mediaNotas = mediaNotas;
                this.pauta = new String [10][2];
        }

        @Override
        public double obetrFuncao() {
                return 0;
        }

        @Override
        public void imprimirHorario() {

        }
}
