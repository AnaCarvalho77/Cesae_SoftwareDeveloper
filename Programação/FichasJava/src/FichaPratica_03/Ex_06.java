package FichaPratica_03;

public class Ex_06 {
    public static void main(String[] args) {
        // declarar variaveis
        int num = 1, total = 0;
        while (num <= 100){
            System.out.println(num);
            total += num;
            num += 1;
        }
        System.out.println(total);
    }
}
