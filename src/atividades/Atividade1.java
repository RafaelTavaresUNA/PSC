package atividades;
import java.util.Scanner;
public class Atividade1 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1, num2, num3, media;
        System.out.println("Digite a primeira nota: ");
        num1 = input.nextInt();
        System.out.println("Digite a segunda nota: ");
        num2 = input.nextInt();
        System.out.println("Digite a terceira nota: ");
        num3 = input.nextInt();
        media = (num1 + num2 + num3)/3;

        System.out.println("A média das três notas é: " + media);
	}
}