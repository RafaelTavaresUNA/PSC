package atividades;
import java.util.Scanner;
public class Atividade1A {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das três notas é: " + media);
	}
}