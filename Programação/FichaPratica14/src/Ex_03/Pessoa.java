package Ex_03;

public abstract class Pessoa {
    private String nome;
    private int anoNascimento;
    private String email;
    private String telemovel;

    public abstract double obetrFuncao();

    public Pessoa(String nome, int anoNascimento, String email, String telemovel) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.telemovel = telemovel;
    }

    public void exibirDetalhes() {
        System.out.println("nome: " + this.nome + "\t| Ano Nascimento: " + this.anoNascimento + "\t| Email: " + this.email + "\t| Telemovel: " + this.telemovel);
    }

        public abstract void imprimirHorario();

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }
}
