package FichaPratica_06;

import java.util.Scanner;

public class Ex_01 {

public static String fazerBarulho(String animal){
    String resultado;

            //escolha
    return switch (animal) {
        case "Cão" -> {
            resultado = "Au au au";
            yield resultado;
        }
        case "Gato" -> {
            resultado = "Miau";
            yield resultado;
        }
        case "Peixe" -> {
            resultado = "Glub Glub";
            yield resultado;
        }
        case "Vaca" -> {
            resultado = "Muuuu";
            yield resultado;
        }
        case "Porco" -> {
            resultado = "Oinc Oinc";
            yield resultado;
        }
        default -> {
            resultado = "Brulho Desconhecido";
            yield resultado;
        }
    };
        }

    public static void main(String[] args) {
        //Instanciar o Scanner
        Scanner input = new Scanner(System.in);

    String animal, barulho;

        System.out.print("insira o animal: ");
        animal = input.next();


    barulho = fazerBarulho(animal);
        System.out.println(barulho);



    }
}
