package Ex_05;

public class main {
    public static void main(String[] args) {
        Pessoa filipe = new Pessoa("Filipe", 28, "dghsfgk@fjlaehfi", "911111111");
        Pessoa joana = new Pessoa("Joana", 26, "dgafhasfgk@fjlaehfi", "912222222");

        Agenda aMinhaAgenda = new Agenda();

        aMinhaAgenda.addPessoa(filipe);
        aMinhaAgenda.addPessoa(joana);

        aMinhaAgenda.listarPessoas();


    }
}
