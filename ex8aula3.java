//Ariel Isidro Nina Saavedra
import java.util.Scanner;
public class ex8aula3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = e.nextLine();

        if (senha.equals("R10p5")) {
            System.out.println("Acesso concedido");
        } 
        else{
            System.out.println("Acesso negado");
        }

        e.close();
    }
}
