//Ariel Isidro Nina Saavedra
import java.util.Scanner;

public class ex10aula3{
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = e.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = e.nextInt();

        System.out.println("Digite o terceiro número: ");
        num3 = e.nextInt();

        if (num1==num2 && num1==num3 && num2==num3) {
            System.out.println("Os números são iguais!");
        }
        else if (num1 > num2 && num1 > num3) {
            System.out.printf("O número %d é o maior dentre eles!\n", num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.printf("O número %d é o maior dentre eles!\n",num2);
        }
        else{
            System.out.printf("O número %d é o maior dentre eles!\n",num3);
        }

        e.close();
    }
}
