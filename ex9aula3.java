//Ariel Isidro Nina Saavedra
import java.util.Scanner;

public class ex9aula3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = e.nextDouble();

        System.out.println("Informe o valor da prestação: ");
        double prestacao = e.nextDouble();

        if (prestacao > salario * 0.30) {
            System.out.println("O Empréstimo infelismente não pode ser concedido!");
        } 
        else {
            System.out.println("O Empréstimo pode ser concedido");
        }

        e.close();
    }
}
