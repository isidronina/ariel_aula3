//Ariel Isidro Nina Saavedra
//Aula 3 

import java.util.Scanner;

public class ex1aula3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
      
        System.out.println("Digite um numero maior que 20");
        double n1= e.nextDouble();


        if(n1>20){
            System.out.println("a metade do numero "+n1+" é: " +n1/2);
        }
        else{
            System.out.println("O valor digitado é menor que 20");
        }
        e.close();
    }
}