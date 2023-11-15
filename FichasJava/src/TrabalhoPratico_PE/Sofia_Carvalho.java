package TrabalhoPratico_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sofia_Carvalho {

    /**
     * Método para imprimir o conteúdo de um ficheiro
     * @param caminhoFicheiro - string com o caminho do ficheiro
     * @throws FileNotFoundException - exceção
     */
    public static void imprimirConteudo(String caminhoFicheiro) throws FileNotFoundException {

        //Trazer o ficheiro para o programa
        Scanner fichOrigem = new Scanner(new File(caminhoFicheiro));

        //declarar variável
        String linha;

        //Enquanto o ficheiro tiver próxima linha ele vai imprimir
        while (fichOrigem.hasNextLine()) {
            linha = fichOrigem.nextLine();
            System.out.println(linha);
        }
    }

    /**
     * Método para contar as linhas de um ficheiro excluindo o cabeçalho
     * @param caminhoFicheiro vai receber uma string que é o caminho do ficheiro
     * @return contagemLinhas - com o número de linhas
     * @throws FileNotFoundException - exceção
     */
    public static int contarLinhasFicheiro(String caminhoFicheiro) throws FileNotFoundException {

        //trazer o ficheiro
        Scanner fichOrigem = new Scanner(new File(caminhoFicheiro));
        //declaração de variáveis
        int contagemLinhas = 0;

        //excluir a linha de cabeçalho
        fichOrigem.nextLine();

        //enquanto houver linha ele vai contar
        while (fichOrigem.hasNextLine()) {
            fichOrigem.nextLine();
            contagemLinhas++;
        }

        //vai retornar o número de linhas
        return contagemLinhas;
    }

    /**
     * Método para contar as colunas de um ficheiro
     * @param caminhoFicheiro - string com o caminho do ficheiro
     * @param delimitador - delimitador que separa as colunas no ficheiro
     * @return contagemColunas com o número de colunas
     * @throws FileNotFoundException . exceção
     */
    public static int contarColunasFicheiro(String caminhoFicheiro, String delimitador) throws FileNotFoundException {
        //trazer ficheiro
        Scanner fichOrigem = new Scanner(new File(caminhoFicheiro));

        //declaração de variáveis
        int contagemColunas;

        //na linha vai fazer o split para um vetor de strings, para separar dados por colunas
        String linha = fichOrigem.nextLine();
        String[] itensLinha = linha.split(delimitador);
        //o número de colunas é o tamanho do vetor de strings da linha
        contagemColunas = itensLinha.length;

        return contagemColunas;
    }

    /**
     * Método para ler ficheiro e tranformar dados numa matriz
     * @param caminhoFicheiro - string com o caminho do ficheiro
     * @return matriz com dados do ficheiro
     * @throws FileNotFoundException exceção
     */
    public static String[][] lerFicheiroParaMatriz(String caminhoFicheiro) throws FileNotFoundException {
        //Trazer ficheiro
        Scanner fichOrigem = new Scanner(new File(caminhoFicheiro));

        //Declarar e Contar numero de linhas
        int linhas = contarLinhasFicheiro(caminhoFicheiro);

        //declarar e contar numero de colunas
        int colunas = (contarColunasFicheiro(caminhoFicheiro, ";"));

        //declarar e inicializar a matriz de strings que vai receber informação ficheiro
        String[][] matriz = new String[linhas][colunas];

        //declarar a linha atual que é inicializada no cabeçalho do ficheiro
        String linhaAtual = fichOrigem.nextLine();

        //Declarar um contador para a linha da matriz e inicializamos no indice 0
        int linhaMatriz = 0;

        while (fichOrigem.hasNextLine()) {
            linhaAtual = fichOrigem.nextLine();//linha atual , dentro do ciclo, começa na primeira linha porque cabeçalho ja foi excluido
            String[] itensLinha = linhaAtual.split(";");//itens da linha é um vetor da linhaAtual

            for (int i = 0; i < itensLinha.length; i++) {// cada item da linha vai ser a coluna da linha da matriz
                matriz[linhaMatriz][i] = itensLinha[i];
            }
            linhaMatriz++;//incrementamos para a linha da matriz
        }
        return matriz;

    }

    /**
     * Método para imprimir a matriz na consola
     * @param matriz - matriz de strings qua vai receber para imprimir
     */
    public static void imprimirMatrizConsola(String [][] matriz){
        //vai percorrer para cada linha as colunas da matriz e imprimir
        for (int linha = 0; linha < matriz.length; linha++){
            System.out.println();
            for (int coluna = 0; coluna< matriz[0].length;coluna++){
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
        }
    }

    /**
     * Método para calcular o total das vendas
     * @param matriz - matriz de strings que vai receber
     */
    public static void vendasValorTotal (String [][] matriz){
        //declarar e inicializar a variável total que vai retornar o total das vendas
        double total=0;

        //ciclo que a cada linha da matriz vai converter o conteudo da coluna indice 8 em inteiro e somar
        for(int i= 0; i< matriz.length; i++){
            total += Double.parseDouble(matriz[i][8]);
        }
        System.out.printf("o valor total das vendas é: %.2f " , total); //arredondar para duas casas decimais como tinha apendido em linguagem c

    }

    /**
     * Método para calcular o lucro total das vendas
     * @param matriz - a matriz de strings para trabalhar com o valor de cada jogo
     * @return lucroTotal - valor do lucro total
     */
    public static Double lucroTotal(String [][] matriz){
        //declarar e inicializar a variável total que vai retornar o lucro total das vendas
        double lucroTotal=0;

        //ciclo que a cada linha da matriz vai converter o conteudo da coluna indice 8 em inteiro e somar o lucro de cada jogo
        for(int i= 0; i< matriz.length; i++){
            lucroTotal += (Double.parseDouble(matriz[i][8]))-((Double.parseDouble(matriz[i][8]))/1.20);//lucroTotal = (valor venda)-(valor venda/1.20);
        }
        return lucroTotal;
    }

    /**
     * Método para imprimir dados de um cliente que o utilizador dá o número
     * @param matriz - matriz recebida para analisar dados
     * @param codCliente - string com codigo cliente que queremos os dados
     */
    public static void imprimirDadosCliente(String [][] matriz, String codCliente){
        //declaração das variáveis
        int contCliente = 0;//para contar a posição no vetor de dados cliente

        //declarar vetor de strings para dados cliente
        String[] dadosCliente = new String[3];

        //para cada linha da matriz
        for(int i = 0; i < matriz.length; i++ ){
            if(codCliente.equals((matriz[i][1]))){//vai verificar se a String codCliente é igual à string na coluna indice 1 da matriz
                for(int j=2; j <= 4; j++){//se sim vai copiar os dados da coluna indice 2 até 4 para o vetor de strings
                    dadosCliente[contCliente]=matriz[i][j];
                    System.out.print(dadosCliente[contCliente]);
                    contCliente++;//incremento da posição no vetor dados cliente
                }
                break;//tive de quebrar porque se houvesse outra linha do mesmo cliente ele ia preencher o vetor outra vez
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

//        Declaração de variáveis
        String tipoUtilizador, password = "senha", senha = "", menuAdmin, numCliente ;
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
                    System.out.print("qual a password?");
                    senha = input.next();
                    if (senha.equals(password)) {//se admin com password correcta vai questionar opcao menu admin
                        System.out.println("escolha uma opcao:");
                        System.out.println("1. Imprimir conteúdo ficheiro.");
                        System.out.println("2. Imprimir quantas vendas foram executadas e o seu valor total");
                        System.out.println("3. Calcule o lucro total");
                        System.out.println("4. Imprimir informações associadas a um cliente?");
                        System.out.println("5. Qual o jogo mais caro e quais os clientes que o compraram?");
                        System.out.println("0. Sair");
                        menuAdmin = input.next();//opcao do utilizador no menu admin
                            switch (menuAdmin) {  //execucao da escolha do menu admin
                                case "1":
                                    imprimirConteudo(caminhoFicheiro);
                                    break;
                                case "2":
                                    System.out.println("a quantidade de vendas é: " + contarLinhasFicheiro(caminhoFicheiro));
                                    vendasValorTotal(matriz);
                                    break;
                                case "3":
                                    System.out.println(lucroTotal(matriz));
                                    break;
                                case "4":
                                    System.out.print("qual o número do cliente?");
                                    numCliente = input.next();
                                    imprimirDadosCliente(matriz,numCliente);
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
