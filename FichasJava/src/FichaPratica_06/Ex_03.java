package FichaPratica_06;
public class Ex_03 {
    static boolean par(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    static boolean positivo(int num){
        if(num >= 0){
            return true;
        }else{
            return false;
        }
    }

    static boolean primo(int num){
        //Declarar variáveis
        double i, cont = 0;

        //verificar quantas vezes faz divisão com resto zero desde 1 até ele mesmo

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        //se faz mais que 2 divisoes com resto 0 não é primo
        if (cont > 2) {
           return false;
        } else {
            return true;
        }
    }

    
}

