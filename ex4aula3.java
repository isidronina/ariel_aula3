import java.util.Scanner;

public class ex4aula3 {
    public static void main(String[] args) {
        Scanner e= new Scanner(System.in);

        float num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = e.nextFloat();

        System.out.println("Digite o segundo número: ");
        num2 = e.nextFloat();

        if (num1 > num2) {
            System.out.println("Ordem decrescente: " + num1 + " , " + num2);
        } 
        else if(num1==num2){
            System.out.println("Os dois numeros são iguais");
        }
        
        else {
            System.out.println("Ordem decrescente: " + num2 + " , " + num1);
        }

        e.close();
    }
}