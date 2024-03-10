
public class Main {
    public static void main(String[] args) {

        String[] cores = {"amarelo", "vermelho", "azul", "verde", "rosa"};
        int[] quantidade={2, 5, 0, 6,1};

        for(int cor=0; cor < cores.length;cor++){
                int quantAtual = quantidade[cor];
                while(quantAtual>0){
                    System.out.println(cores[cor]);
                    quantAtual--;
                }

            }
        }
        
    }
