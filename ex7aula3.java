import java.util.Scanner;

public class ex7aula3{
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        double salario = e.nextDouble();

        System.out.println("Digite a quantidade de anos na empresa: ");
        int anos = e.nextInt();

        if (anos >= 5) {
            double bonus = salario * 0.20;
            System.out.println("O bonus concedido será R$"+bonus);
        } 
        else {
            double bonus = salario * 0.10;
            System.out.println("O bonus concedido será R$"+bonus);
        }

        e.close();
    }
}