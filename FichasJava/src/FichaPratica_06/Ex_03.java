package FichaPratica_06;

import java.util.Scanner;

public class Ex_03 {

    /**
     * Método que avalia se um número é par ou impar
     * @param num - Número a ser avaliado
     * @return true - se par || false - impar
     */
    static boolean par(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para ver se um numero é positivo ou negativo
     * @param num - Número a ser avaliado
     * @return true - se numero positivo || false - se número negativo
     */
    static boolean positivo(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Método para ver se um número é primo ou não primo
     * @param num - número a ser avaliado
     * @return true - se número primo || false - se número não primo
     */
    static boolean primo(int num) {
        //Declarar variáveis
        double i, cont = 0;

        //verificar quantas vezes faz divisão com resto zero desde 1 até ele mesmo

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        //se faz mais que 2 divisoes com resto 0 não é primo
        if (cont > 2 || num < 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Método para avaliar se um número é perfeito ou não perfeito
     * @param num - número a ser avaliado
     * @return true - se o número é perfeito || false - se número não é perfeito
     */
    static boolean perfeito(int num){
        int resultado = 0;
        for(int i=1; i < num; i++){
            if(num % i == 0)
                resultado += i;
        }
        if (resultado == num){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Método para ver se um número é triangular
     * @param num - númeor a ser avaliado
     * @return true - se número é triangular || false - se número não é triangular
     */
    static boolean triangular(int num) {
        int resultado = 0;
        for(int i = 1; i <= num && num!= resultado; i++){
            resultado +=i;
            if(num == resultado) {
                return true;
            }
        }
        if (num!=resultado)
            return false;

        // Return generico
        return false;
    }


//    public static void main(String[] args) {
//        //Instanciar o Scanner
//        Scanner input = new Scanner(System.in);
//
//        int numero;
//        String resultado;
//        System.out.println("Digite um número: ");
//        numero = input.nextInt();
//
//
//        if (par(numero)){
//            System.out.println("número par");
//        }else{
//            System.out.println("número impar");
//        }
//
//        if (positivo(numero)){
//            System.out.println("número positivo");
//        }else{
//            System.out.println("número negativo");
//        }
//
//        if (primo(numero)){
//            System.out.println("número primo");
//        }else{
//            System.out.println("não é um número primo");
//        }
//
//        if (perfeito(numero)){
//            System.out.println("número perfeito");
//        }else{
//            System.out.println("não é um número perfeito");
//        }
//
//        if (triangular(numero)){
//            System.out.println("número triangular");
//        }else{
//            System.out.println("não é um número triangular");
//        }
//    }
}

