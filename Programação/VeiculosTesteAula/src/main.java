import java.io.FileNotFoundException;
import java.util.Scanner;



public class main {
    public static Veiculo criarVeiculo(String tipoVeiculo){
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

        String marca, modelo, nomeVeiculo;
        int anoFabrico, quantidadePassageiros,indexCombustivel;
        double potencia, cilindrada, consumo, capacidadeCarga;
        TipoCombustivel tipoCombustivel = null;

            System.out.println("Qual a marca?");
            marca = input.next();
            System.out.println("Qual o modelo?");
            modelo = input.nextLine();
            System.out.println("Qual o ano de fabrico?");
            anoFabrico = input.nextInt();
            System.out.println("Qual a potência?");
            potencia = input.nextDouble();
            System.out.println("Qual a cilindrada?");
            cilindrada = input.nextDouble();
            System.out.println("Qual o consumo?");
            consumo = input.nextDouble();
            if(!tipoVeiculo.equals("camiao")){
                System.out.println("Tipos de combustivel:");
                int contador = 1;
                for(TipoCombustivel i:TipoCombustivel.values()){
                    System.out.println(contador++ + ": " + i);
                }

                System.out.println("Qual o combustivel: ");
                indexCombustivel = input.nextInt();

                contador = 1;
                for (TipoCombustivel i: TipoCombustivel.values()){
                    if(indexCombustivel == contador){
                        tipoCombustivel = i;
                    }
                    contador++;
                }
            }
        if(tipoVeiculo.equals("carro")){
            System.out.println("Qual a quantidade de passageiros?");
            quantidadePassageiros = input.nextInt();
            Carro carro1 = new Carro(marca,modelo,anoFabrico,potencia,cilindrada,consumo,tipoCombustivel,quantidadePassageiros);
            return carro1;

        } else if(tipoVeiculo.equals("camiao")){
            System.out.println("Qual a capacidade de carga do camião?");
            capacidadeCarga = input.nextDouble();
            Camiao camiao1 = new Camiao(marca, modelo, anoFabrico, potencia,cilindrada,consumo,capacidadeCarga);
            return camiao1;
        } else if(tipoVeiculo.equals("mota")){
            Mota mota1= new Mota(marca,modelo,anoFabrico,potencia,cilindrada,consumo,tipoCombustivel);
            return mota1;
        }
return null;
    }




    public static void main(String[] args) throws FileNotFoundException {

        Carro nissan = new Carro("nissan","qashqai",2016,110,1.6,5.5,TipoCombustivel.DIESEL,5);

        Camiao man = new Camiao("Man","TGX",2021,471,15.2,24,500);
        Mota ktm = new Mota("KTM","450 SX-F",2023,63,449.9,3,TipoCombustivel.GASOLINA);

        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);


        //Declaração de variáveis
        String opcao, tipoVeiculo;
Veiculo veiculo=null;
Veiculo veiculoVencedor=null;

            System.out.println("Escolha o veiculo a criar:");
            System.out.println("1 - Carro");
            System.out.println("2 - Camião");
            System.out.println("3 - Mota");
            System.out.println("0 - Sair");
            opcao = input.next();
        switch (opcao) {
            case "1":
                tipoVeiculo = "carro";
                veiculo = criarVeiculo(tipoVeiculo);
            case "2":
                tipoVeiculo = "camiao";
                veiculo = criarVeiculo(tipoVeiculo);

            case "3":
                tipoVeiculo = "mota";
                veiculo = criarVeiculo(tipoVeiculo);
            default:
                System.out.println("Opção não ccontemplada");
        }

            do {//imprimir enquanto opcao diferente 0
                System.out.println("\n\nescolha uma opcao:");
                System.out.println("1. Criar Veiculo");
                System.out.println("2. Calcular Consumo");
                System.out.println("3. Fazer uma corrida com o Carro");
                System.out.println("4. Fazer uma corrida com a Mota");
                System.out.println("5. Fazer uma corrida com o Camião");
                System.out.println("6. Se Camião, permite calcular custos viagem de transporte de carga");
                System.out.println("7. Se mota, imprime imagem");
                System.out.println("0. Sair");
                opcao = input.next();//opcao do utilizador
                switch (opcao) {  //execucao da escolha do menu admin
                    case "1":
                        do {
                            System.out.println("Escolha o veiculo a criar:");
                            System.out.println("1 - Carro");
                            System.out.println("2 - Camião");
                            System.out.println("3 - Mota");
                            System.out.println("0 - Sair");
                            opcao = input.next();
                            switch (opcao) {
                                case "1":
                                    tipoVeiculo = "carro";
                                   veiculo = criarVeiculo(tipoVeiculo);
                                case "2":
                                    tipoVeiculo = "camiao";
                                    veiculo = criarVeiculo(tipoVeiculo);

                                case "3":
                                    tipoVeiculo = "mota";
                                    veiculo = criarVeiculo(tipoVeiculo);
                                default:
                                    System.out.println("Opção não ccontemplada");
                            }
                        } while (!opcao.equals("0"));
                        break;
                    case "2":
                            double km;
                            System.out.println("quantos km?");
                            km = input.nextDouble();
                            System.out.println("o valor conumido é de: " + veiculo.valorConsumido(km));
                        break;
                    case "3":
                        System.out.print("\nO carro é: ");
                        nissan.imprimirDados();
                        veiculoVencedor = veiculo.corrida(nissan,2023);
                        System.out.println("O vencedor da corrida é: " );
                        veiculoVencedor.imprimirDados();

                        break;
                    case "4":
                        System.out.print("\nA mota é: ");
                        nissan.imprimirDados();
                        veiculoVencedor =  veiculo.corrida(ktm,2023);
                        veiculoVencedor.imprimirDados();



                        break;
                    case "5":
                        System.out.print("\nO camiao é: ");
                        man.imprimirDados();
                        veiculoVencedor = veiculo.corrida(man,2023);
                        System.out.println("O vencedor da corrida é: " );
                        veiculoVencedor.imprimirDados();
                        break;

                    case "6":
                        if(tipoVeiculo.equals("camiao")){
                            Double carga, distancia;
                            carga = veiculo.
                            System.out.println("quantos km?");
                            distancia = input.nextDouble();
                            veiculo.viagem()
                    case "0":
                        break;
                    default:
                        System.out.println("\nErro! opção não contemplado.");
                }
            }while (!opcao.equals("0")) ;

        }

        String caminhoFicheiro = "/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Programação/FichaPratica_12/src/Ex_02/Mota.txt";




        Veiculo vencedorCorrida = nissan.corrida(toyota,2023);
        System.out.println("********* o carro vencedor foi *******");
        vencedorCorrida.imprimirDados();
        System.out.println();

        Veiculo vencedorCorrida2 = man.corrida(nissan,2023);
        System.out.println("************ o veiculo vencedor foi *************");
       vencedorCorrida2.imprimirDados();
        System.out.println();

        System.out.println("o custo da viagem foi: " + toyota.calcularCusto(150));
        System.out.println();

        man.viagem(300,300);
        System.out.println();
        man.viagem(200,550);
        System.out.println();



        ktm.imprimirDados();
        ktm.imagem(caminhoFicheiro);








    }
}
