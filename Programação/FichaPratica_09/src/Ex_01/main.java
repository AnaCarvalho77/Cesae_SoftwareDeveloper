package Ex_01;

public class main {
    public static void main(String[] args){
        Pessoa vitor = new Pessoa("Vitor S.", 24, 1.7);
        Pessoa francisca = new Pessoa("Francisca A.", 40, 1.6);


        //imprimir os detalhes da primeira pessoa
        System.out.println("Nome: "+vitor.getNome());
        System.out.println("Idade: "+vitor.getIdade());
        System.out.println("Altura: "+vitor.getAltura());

        //imprimir os detalhes da segunda pessoa
        System.out.println("Nome: "+francisca.getNome());
        System.out.println("Idade: "+francisca.getIdade());
        System.out.println("Altura: "+francisca.getAltura());




    }
}
