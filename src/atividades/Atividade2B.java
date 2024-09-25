package atividades;
import java.util.Scanner;
public class Atividade2B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        int lado1 = input.nextInt();
        System.out.println("Digite o segundo lado do triângulo: ");
        int lado2 = input.nextInt();
        System.out.println("Digite o terceiro lado do triângulo: ");
        int lado3 = input.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }

        input.close();
    }
}