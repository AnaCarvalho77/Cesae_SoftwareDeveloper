package FichaPratica_06;


public class Ex_05 {
    /**
     * Método para verificar qual o maior número de um vetor
     * @param vetor - vetor a ser avaliado
     * @return maior - o número maior do vetor avaliado
     */
    static int maior(int[] vetor){

//Declarar variáveis
        int maior = 0, i;

        maior = vetor[0];

        for(i = 1 ; i < vetor.length;i++){
            if(i >= 1 && vetor [i] > maior)
                maior = vetor[i];


        }
        return maior;
    }

    /**
     * Método para verificar qual o menor número de um vetor
     * @param vetor - vetor a ser avaliado
     * @return menor - o número menor do vetor avaliado
     */
    static int menor(int[] vetor){

//Declarar variáveis
        //Declarar variáveis
        int  i, menor = 0;

        menor = vetor[0];

        for(i = 1 ; i < vetor.length; i++ ){
            if(i >= 1 && vetor [i] < menor)
                menor = vetor[i];

        }
        return menor;
    }

    /**
     * Método para verificar se um vetor é crescente
     * @param vetor - vetor a ser analisado
     * @return true - se o vetor é crescente || false - se o vetor não é crescente
     */
    static boolean crescente(int[] vetor){
        int  i;
        boolean crescente = true;

        for(i= 1; i < vetor.length; i++){
            if(vetor[i] <= vetor[i-1]){
                crescente = false;
            }
        }

        if(crescente){
            return true;
        }else{
            return false;
        }
    }

}
