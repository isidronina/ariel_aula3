import java.util.Scanner;
public class ex2aula3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite sua Idade: ");
        int idade = e.nextInt();

        if(idade>=18){
            System.out.println("você é maior de idade!");
        }
        else{
            System.out.println("você é menor de idade ):");
        }
        e.close();
    }
    
}