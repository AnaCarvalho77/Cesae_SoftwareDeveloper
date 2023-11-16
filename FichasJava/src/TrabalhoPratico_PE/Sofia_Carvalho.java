package TrabalhoPratico_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sofia_Carvalho {

    /**
     * Método para imprimir o conteúdo de um ficheiro
     *
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
     *
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
     *
     * @param caminhoFicheiro - string com o caminho do ficheiro
     * @param delimitador     - delimitador que separa as colunas no ficheiro
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
     *
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
     *
     * @param matriz - matriz de strings qua vai receber para imprimir
     */
    public static void imprimirMatrizConsola(String[][] matriz) {
        //vai percorrer para cada linha as colunas da matriz e imprimir
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.println();
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t|\t");
            }
        }
    }

    /**
     * Método para calcular o total das vendas
     *
     * @param matriz - matriz de strings que vai receber
     */
    public static void vendasValorTotal(String[][] matriz) {
        //declarar e inicializar a variável total que vai retornar o total das vendas
        double total = 0;

        //ciclo que a cada linha da matriz vai converter o conteudo da coluna indice 8 em inteiro e somar
        for (int i = 0; i < matriz.length; i++) {
            total += Double.parseDouble(matriz[i][8]);
        }
        System.out.printf("o valor total das vendas é: %.2f ", total); //arredondar para duas casas decimais como tinha apendido em linguagem c

    }

    /**
     * Método para calcular o lucro total das vendas
     *
     * @param matriz - a matriz de strings para trabalhar com o valor de cada jogo
     * @return lucroTotal - valor do lucro total
     */
    public static Double lucroTotal(String[][] matriz) {
        //declarar e inicializar a variável total que vai retornar o lucro total das vendas
        double lucroTotal = 0;

        //ciclo que a cada linha da matriz vai converter o conteudo da coluna indice 8 em inteiro e somar o lucro de cada jogo
        for (int i = 0; i < matriz.length; i++) {
            lucroTotal += (Double.parseDouble(matriz[i][8])) - ((Double.parseDouble(matriz[i][8])) / 1.20);//lucroTotal = (valor venda)-(valor venda/1.20);
        }
        return lucroTotal;
    }

    /**
     * Método para imprimir dados de um cliente que o utilizador dá o número
     *
     * @param matriz     - matriz recebida para analisar dados
     * @param codCliente - string com codigo cliente que queremos os dados
     */
    public static void imprimirDadosCliente(String[][] matriz, String codCliente) {
        //declaração das variáveis
        int contCliente = 0;//para contar a posição no vetor de dados cliente

        //declarar vetor de strings para dados cliente
        String[] dadosCliente = new String[3];

        //para cada linha da matriz
        for (int i = 0; i < matriz.length; i++) {
            if (codCliente.equals((matriz[i][1]))) {//vai verificar se a String codCliente é igual à string na coluna indice 1 da matriz
                for (int j = 2; j <= 4; j++) {//se sim vai copiar os dados da coluna indice 2 até 4 para o vetor de strings
                    dadosCliente[contCliente] = matriz[i][j];
                    System.out.print(dadosCliente[contCliente]);
                    contCliente++;//incremento da posição no vetor dados cliente
                }
                break;//tive de quebrar porque se houvesse outra linha do mesmo cliente ele ia preencher o vetor outra vez
            }
        }
    }

    /**
     * Método para encontrar o jogo mais caro
     *
     * @param matriz - matriz de strings para analisar os dados
     * @return - jogoMaisCaro - nome do jogo mais caro
     */
    public static String jogoMaisCaro(String[][] matriz) {
        //declaração de variáveis
        double maior = Double.parseDouble(matriz[0][8]);//iniciei com o valor do primeiro jogo
        String jogoMaisCaro = matriz[0][7];//Iniciei com o nome do primeiro jogo

        //para cada linha da matriz vou verificar se o valor do jogo é maior que o "maior"
        for (int i = 1; i < matriz.length; i++) {
            if (Double.parseDouble(matriz[i][8]) > maior) {
                maior = Double.parseDouble(matriz[i][8]);//se sim guardar o valor desse jogo
                jogoMaisCaro = matriz[i][7];//e guardar o nome desse jogo
            }
        }
        return jogoMaisCaro;
    }

    /**
     * Método para enquantrar quantidade de jogoMaisCaro vendidas
     *
     * @param matriz   - matriz de strings com os dados  a analisar
     * @param jogoCaro - o nome do jogo mais caro
     * @return contJogoMaisCaro - retorna a quantidade de jogo mais caro vendidas
     */
    public static int quantJogoMaisCaro(String[][] matriz, String jogoCaro) {
        //declaração de variáveis
        int contJogoMaisCaro = 0;//contador de jogo mais caro

        //verificar a cada linha quantas vezes encontra nome jogo mais caro
        for (int i = 0; i < matriz.length; i++) {
            if (jogoCaro.equals(matriz[i][7]))
                contJogoMaisCaro++;
        }
        return contJogoMaisCaro;
    }

    /**
     * Método para saber o nome dos clientes que compraram o jogo mais caro
     *
     * @param matriz   - matriz de strings que vamos analisar
     * @param jogoCaro - nome do jogo mais caro para analisar
     */
    public static void clienteJogo(String[][] matriz, String jogoCaro) {
        //declaração das variáveis
        int contCliente = 0;//para contar a posição no vetor de dados cliente

        //declarar vetor de strings para dados cliente
        String[] clienteJogoMaisCaro = new String[quantJogoMaisCaro(matriz, jogoCaro)];

        //para cada linha da matriz
        for (int i = 0; i < matriz.length; i++) {
            if (jogoCaro.equals((matriz[i][7]))) {//vai verificar se o nome do jogo é igual ao da coluna indice 7 da matriz
                clienteJogoMaisCaro[contCliente] = matriz[i][2]; //guardar nome cliente no vetor
                System.out.println(clienteJogoMaisCaro[contCliente]);
                contCliente++;//incremento da posição no vetor  com nome clientes
            }

        }
    }

    /**
     * Método para registar cliente e imprimir informação do registo
     */
    public static void registarCliente() {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        //Declaração de variáveis
        String nome, contato, email;

        //inputs do cliente
        System.out.println("\nInserir Cliente");
        System.out.print("Insira Nome: ");
        nome = input.next();
        System.out.print("Insira Contato: ");
        contato = input.next();
        System.out.print("Insira Email: ");
        email = input.next();

        System.out.println("\nCliente inserido com Sucesso: " + nome + "|" + contato + "|" + email + "\n");

    }

    /**
     * Método para saber quantos números triangulares multiplos de 5 existem até 121
     *
     * @return contNumeros - quantidade
     */
    public static int contarNumerosTriangularesMultiplos5() {
        //Declaração Variáveis
        int resultado = 0, contNumeros = 0;

        //Ciclo que vai analisar quai os numeros triangulares multiplos de 5 até 121
        for (int i = 1; i < (121 / 2); i++) {//limite de metado do numero máximo porque quero que o resultado seja menor que 121
            resultado += i;
            if (resultado <= 121 && resultado % 5 == 0) {
                contNumeros++;
            }

        }
        return contNumeros;
    }

    /**
     * Método para verificar quais os estacionamentos vagos atraves do numeros triangulares multiplos de 5
     *
     * @param contNumeros - quantidade de numeros traingulares multiplos de 5
     */
    public static void estacionamentosVagos(int contNumeros) {
        //Declaração de variáveis
        int[] numerosTriangulares = new int[contNumeros];//vetor que vai receber os numeros triangulares multiplos de 5

        int resultado = 0, posicaoVetor = 0;

        System.out.println("Estacionamentos Disponíveis: ");
        //ciclo que vai imprimir os numeros triangulares multiplos de 5
        for (int i = 1; i <= 121; i++) {
            resultado += i;
            if (resultado <= 121 && resultado % 5 == 0) {
                numerosTriangulares[posicaoVetor] = resultado;
                System.out.print(numerosTriangulares[posicaoVetor] + "|");
                posicaoVetor++;
            }

        }
    }

    /**
     * Método para imprimir os titulos dos jogos
     *
     * @param matriz -matriz de strings com os dados a ser analisados
     */
    public static void imprimirTitulosJogos(String[][] matriz) {
        //declaração de variáveis
        int posicaoVetor = 1; //posição do vetor de nome jogos iniciada em 1 porque a posição 0 vai iniciar com valor
        int contIgual = 0;//contador para ver se há nome de jogos iguais

        String[] nomeJogos = new String[matriz.length];
        nomeJogos[0] = matriz[0][7];

        //ciclo para correr linhas da matriz
        for (int i = 1; i < matriz.length; i++) {
            for (int j = posicaoVetor - 1; j >= 0; j--) {//ciclo pra percorrer vetor nos dados anteriores ao atual
                if (matriz[i][7].equals(nomeJogos[j])) {//verificar se valor linha matriz tem igual nas posições anteriores do vetor
                    contIgual++;//se tem igual incrementa o contador
                }
            }
            if (contIgual == 0) { // se o contador for igual a 0 quer dizer que não havia igual no vetor
                nomeJogos[posicaoVetor] = matriz[i][7];//se não havia igual então o vetor na posição atual vai ser igual ao valor da matriz
                posicaoVetor++;//passa para a posição a seguir do vetor
            }
            contIgual = 0;//iniciamos o contador
        }

        //imprimir o vetor de nomes dos jogos
        for (int i = 0; i < nomeJogos.length; i++) {
            if (nomeJogos[i] != null)
                System.out.println(nomeJogos[i]);
        }

    }

    public static void imprimirCategoriasJogosEditora(String[][] matriz) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        String editora;
        int cont = 0;

        boolean existe = false;

        String[] categoria = new String[matriz.length];
        int posicaoVetorCategoria = 0;
        String[] jogosImp = new String[matriz.length];
        int posicaoJogosImp = 0;

        System.out.println("Qual o nome da editora: ");
        editora = input.nextLine();
        System.out.println("\n****" + editora + "****");

        for (int linhaMatriz = 0; linhaMatriz < matriz.length; linhaMatriz++) {
            if (matriz[linhaMatriz][5].equals(editora)) {
                for (int colCategoria = 0; colCategoria < categoria.length; colCategoria++) {
                    if (categoria[colCategoria] != null && categoria[colCategoria].equals(matriz[linhaMatriz][6])) {
                        existe = true;
                        break;
                    }

                }
                if (!existe) {
                    categoria[posicaoVetorCategoria] = matriz[linhaMatriz][6];
                    posicaoVetorCategoria++;
                }
                existe = false;
            }
        }


        for (int colCategoria = 0; colCategoria < categoria.length; colCategoria++) {
            if (categoria[colCategoria] != null) {
                System.out.println("\n--" + categoria[colCategoria] + "--");
                for (int linhaMatriz = 0; linhaMatriz < matriz.length; linhaMatriz++) {
                    if (matriz[linhaMatriz][5].equals(editora) && matriz[linhaMatriz][6].equals(categoria[colCategoria])) {
                        for (int colJogoImp = 0; colJogoImp < jogosImp.length; colJogoImp++) {
                            if (jogosImp[colJogoImp] != null && jogosImp[colJogoImp].equals(matriz[linhaMatriz][7])) {
                                existe = true;
                                break;
                            }
                        }
                        if (!existe) {
                            System.out.println(matriz[linhaMatriz][7]);
                            jogosImp[posicaoJogosImp] = matriz[linhaMatriz][7];
                            posicaoJogosImp++;
                        }
                        existe = false;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

//        Declaração de variáveis
        String tipoUtilizador, password = "senha", senha = "", menuAdmin, numCliente, jogoCaro, menuCliente;
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
                    System.out.print("qual a password? ");
                    senha = input.next();
                    if (senha.equals(password)) {//se admin com password correcta vai questionar opcao menu admin
                        do {
                            System.out.println("\n\nescolha uma opcao:");
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
                                    imprimirDadosCliente(matriz, numCliente);
                                    break;
                                case "5":
                                    jogoCaro = jogoMaisCaro(matriz);
                                    System.out.println("o jogo mais caro é o: " + jogoCaro);
                                    System.out.println("\nOs clientes que compraram o jogo mais caro são:");
                                    clienteJogo(matriz, jogoCaro);
                                    break;
                                case "0":
                                    break;
                                default:
                                    System.out.println("Erro! opção não contemplado.");
                            }
                        } while (!menuAdmin.equals("0"));
                    } else {
                        System.out.println("\nPassword Incorreta!!\n");
                    }
                    break;
                case "2":
                    do {
                        System.out.println("\n\nescolha uma opcao:");
                        System.out.println("1. Registar Cliente.");
                        System.out.println("2. Procurar Estacionamento");
                        System.out.println("3. Imprimir todos os títulos de jogos");
                        System.out.println("4. Imprimir todos os jogos de uma editora por categoria");
                        System.out.println("0. Sair");

                        menuCliente = input.next();//opcao do utilizador no menu admin

                        switch (menuCliente) {
                            case "1":
                                registarCliente();
                                break;
                            case "2":
                                estacionamentosVagos(contarNumerosTriangularesMultiplos5());
                                break;
                            case "3":
                                imprimirTitulosJogos(matriz);
                                break;
                            case "4":
                                imprimirCategoriasJogosEditora(matriz);
                            case "0":
                                break;
                            default:
                                System.out.println("Erro! opção não contemplado.");
                        }
                    } while (!menuCliente.equals("0"));
                    break;
            }
        } while (!senha.equals(password) && !tipoUtilizador.equals("2"));

    }
}
