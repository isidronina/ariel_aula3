//Ariel Isidro Nina Saavedra
import java.util.Scanner;
public class ex6aula3 {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Digite sua altura em centímetros: ");
        double altura=e.nextDouble();
        System.out.println("Informe qual é seu sexo: \n (1) Masculino \n (2) Feminino \n");
        int sexo=e.nextInt();
        if(sexo==1){
            double pesoideal= 72.7+0.75*(altura-152.4);
            System.out.println("O seu peso Ideal coresponde: "+pesoideal+" kg");
        }
        else if (sexo==2){
            double pesoideal= 52+0.75*(altura-152.4);
            System.out.println("O seu peso Ideal corresponde: "+pesoideal+" kg");
        }
        else{
            System.out.println("O numero que foi digitado é considerado inválido");
        }
        e.close();    
    }
}
