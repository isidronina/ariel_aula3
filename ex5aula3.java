//Ariel Isidro Nina Saavedra
import java.util.Scanner;

public class ex5aula3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        int num;

        System.out.println("Digite um número inteiro: ");
        num =e.nextInt();

        if (num >= 50 && num <= 100) {
            System.out.println("O número digitado pertence ao intervalo");
        } else {
            System.out.println("Esse número não pertence ao intervalo");
        }

        e.close();
    }
}
