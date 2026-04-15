//Ariel Isidro Nina Saavedra
import java.util.Scanner;

public class ex3aula3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero inteiro: ");
        int n1= e.nextInt();

        System.out.println("Digite o segundo numero inteiro: ");
        int n2= e.nextInt();
        int num1maior= n1-n2;
        int num2maior= n2-n1;
        if(n1==n2){
            System.out.println("os dois numeros são iguais");
        }else if(n1>n2){
            System.out.println("a diferça desse dois numeros é: " +num1maior );
        }else {
            System.out.println("a diferça desse dois numeros é: " +num2maior );
        }
        e.close();        
    }
}

  
