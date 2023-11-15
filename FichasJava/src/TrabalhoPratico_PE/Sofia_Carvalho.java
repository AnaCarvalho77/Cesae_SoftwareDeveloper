package TrabalhoPratico_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sofia_Carvalho {


    public static void imprimirConteudo() throws FileNotFoundException {

        //Trazer o ficheiro para o programa
        Scanner fichOrigem = new Scanner(new File("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/FichasJava/Ficheiros/GameStart_V2.csv"));

        //declarar variável
        String linha;

        //Enquanto o ficheiro tiver próxima linha ele vai imprimir
        while (fichOrigem.hasNextLine()) {
            linha = fichOrigem.nextLine();
            System.out.println(linha);
        }
    }

    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {
        Scanner fichOrigem = new Scanner(new File(caminhoFicheiro));

        int contagemLinhas = 0;
        while (fichOrigem.hasNextLine()) {
            fichOrigem.nextLine();
            contagemLinhas++;
        }
        return contagemLinhas;
    }

    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {
        Scanner fichOrigem = new Scanner(new File(caminhoFicheiro));

        int contagemColunas = 0;

        String linha = fichOrigem.nextLine();
        String[] itensLinha = linha.split(delimitador);
        contagemColunas = itensLinha.length;

        return contagemColunas;
    }

    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro) throws FileNotFoundException {
        //Trazer ficheiro
        Scanner fichOrigem = new Scanner(new File(caminhoFicheiro));

        //Contar numero de linhas
        int linhas = (contarLinhasFicheiro(caminhoFicheiro)) - 1;

        int colunas = (contarColunasFicheiro(caminhoFicheiro, ";"));

        String[][] matriz = new String[linhas][colunas];

        String linhaAtual = fichOrigem.nextLine();
        int linhaMatriz = 0;

        while (fichOrigem.hasNextLine()) {
            linhaAtual = fichOrigem.nextLine();
            String[] itensLinha = linhaAtual.split(";");

            for (int i = 0; i < itensLinha.length; i++) {
                matriz[linhaMatriz][i] = itensLinha[i];
            }
            linhaMatriz++;
        }
        return matriz;

    }

    public static void imprimirMatrizConsola(String [][] matriz){
        for (int linha = 0; linha < matriz.length; linha++){
            System.out.println();
            for (int coluna = 0; coluna< matriz[0].length;coluna++){
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
        }
    }

    public static void VendasValorTotal (String [][] matriz){
        int total=0;
        for(int i= 0; i< matriz.length; i++){
            total += Integer.parseInt(matriz[i][8]);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

//        Declaração de variáveis
        String tipoUtilizador, password = "senha", senha = "", menuAdmin;
        int linhas, colunas;
        String caminhoFicheiro = "/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/FichasJava/Ficheiros/GameStart_V2.csv";
        String[][] matriz = lerFicheiroParaMatriz(caminhoFicheiro);

        //Questionar o tipo de utilizador
        do {   //Voltar a Questionar o tipo de utilizador se a senha errada
            System.out.println("Tipo Utilizador(digite numero correspondente:");
            System.out.println("1. ADMIN");
            System.out.println("2. CLIENTE");
            tipoUtilizador = input.next(); //opção do utilizador

            switch (tipoUtilizador) { //consoante o tipo de utilizador vai ser apresentado o seu menu
                case "1":
                    System.out.println("qual a password?");
                    senha = input.next();
                    if (senha.equals(password)) {//se admin com password correcta vai questionar opcao menu admin
                        System.out.println("escolha uma opcao:");
                        System.out.println("1. Imprimir conteúdo ficheiro.");
                        System.out.println("2. Imprimir quantas vendas foram executadas e o seu valor total");
                        System.out.println("3. Calcule o lucro total");
                        System.out.println("4. Qual o jogo mais caro e quais os clientes que o compraram?");
                        System.out.println("0. Sair");
                        menuAdmin = input.next();//opcao do utilizador no menu admin
                            switch (menuAdmin) {  //execucao da escolha do menu admin
                                case "1":
                                    imprimirConteudo();
                                    break;
                                case "2":
                                    System.out.println("a quantodade de colunas é: " + contarColunasFicheiro(caminhoFicheiro,";"));
                                    System.out.println("a quantidade de vendas é: " + contarLinhasFicheiro(caminhoFicheiro));
                                    imprimirMatrizConsola(matriz);
                                    break;
                                case "3":
                                    break;
                                case "4":
                                    break;
                                case "5":
                                    break;
                                case "0":
                                    break;
                            }

                    }
                    break;
                case "2":

                    break;
            }
        } while (!senha.equals(password));

    }
}
