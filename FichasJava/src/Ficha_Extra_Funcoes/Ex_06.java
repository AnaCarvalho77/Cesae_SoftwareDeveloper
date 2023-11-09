package Ficha_Extra_Funcoes;

import java.util.Scanner;

public class Ex_06 {
    static double somatorio(int num) {

        int soma = 0, i, cont = 0, numVetor, numAtual;


        numAtual = num;

//        String numero = Integer.toString(num);
//        char[]  arrayNumero = numero.toCharArray();
//        int [] array = new int[arrayNumero.length];
//
//        for(i=0; i< arrayNumero.length; i++ ){
//            array[i] = Integer.parseInt(String.valueOf(arrayNumero[i]));
//        }
//
//        for(i=0; i< arrayNumero.length;i++){
//            soma += array[i];
//        }

        while (numAtual >= 10) {
            if (numAtual % 10 != 0) {
                numVetor = num % 10;
                numAtual = numAtual - numVetor;
                if(numAtual % 10 ==0){
                    numAtual = numAtual/10;
                    if (numAtual < 10){
                        cont++;
                    }
                }
                cont++;

            } else {
                while (numAtual >= 10 || numAtual <= -10) {
                    if (numAtual % 10 == 0) {
                        cont++;
                        numAtual = numAtual / 10;
                        if (numAtual < 10) {
                            cont++;
                        }
                    } else {
                        numAtual = numAtual / 10;
                        if (numAtual < 10) {
                            numVetor = numAtual;
                            cont++;
                        } else {
                            numVetor = numAtual % 10;
                            if (numVetor == 0) {
                                cont++;
                            } else {
                                numAtual = numAtual - numVetor;
                                cont++;
                            }
                        }
                    }
                }
            }
        }


        numAtual = num;
        int [] vetor = new int[cont];

        for(i = (vetor. length-1); i >= 0; i--) {
            if (numAtual % 10 != 0) {
                numVetor = numAtual % 10;
                numAtual = numAtual - numVetor;
                vetor[i] = numVetor;
                while(numAtual % 10 ==0 && numAtual>100) {
                        numAtual = numAtual / 10;
                    }
                    if (numAtual < 10){
                        cont++;
                    }

            } else {
                if (numAtual >= 10 || numAtual <= -10) {
                    if (numAtual % 10 == 0) {
                        vetor[i] = 0;
                        numAtual = numAtual / 10;
                        if (numAtual < 10) {
                            vetor[i] = numAtual;
                        }
                    } else {
                        if (numAtual < 10) {
                            numVetor = numAtual;
                            vetor[i] = numVetor;
                        } else {
                            numVetor = numAtual % 10;
                            if (numVetor == 0) {
                                vetor[i] = numVetor;
                            } else {
                                numAtual = numAtual - numVetor;
                                vetor[i] = numVetor;
                            }
                        }
                    }
                }
                }
            }


        for(i = 0; i < vetor.length; i++){
           soma  +=  vetor[i];
        }

        return soma;
    }

    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner (System.in);

        int num;

        System.out.print("Introduza um número: ");
        num = input.nextInt();



        System.out.println("somatório: " + somatorio(num));


    }
}
