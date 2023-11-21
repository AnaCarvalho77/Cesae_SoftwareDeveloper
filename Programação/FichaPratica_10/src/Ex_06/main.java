package Ex_06;

public class main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("nuno", "natação", 1.8, 67, "Portugal");
        Atleta atleta2 = new Atleta("alvaro", "natação", 1.7, 70, "Portugal");
        Atleta atleta3 = new Atleta("rui", "natação", 1.9, 72, "Portugal");
        Atleta atleta4 = new Atleta("filipe", "box", 1.75, 65, "Portugal");
        Atleta atleta5 = new Atleta("carlos", "box", 1.65, 68, "Portugal");
        Atleta atleta6 = new Atleta("tiago", "box", 1.7, 71, "Portugal");


        Competicao natacaoMasculino = new Competicao("Natacao Masculino", "Portugal");

        Competicao boxMasculino = new Competicao("Box Masculino", "Portugal");

        natacaoMasculino.addAtleta(atleta1);
        natacaoMasculino.addAtleta(atleta2);
        natacaoMasculino.addAtleta(atleta3);

        boxMasculino.addAtleta(atleta4);
        boxMasculino.addAtleta(atleta5);
        boxMasculino.addAtleta(atleta6);

        natacaoMasculino.dadosCompeticao();
        natacaoMasculino.listarAtletas();

        System.out.println("*********************");

        boxMasculino.dadosCompeticao();
        boxMasculino.listarAtletas();



    }
}
