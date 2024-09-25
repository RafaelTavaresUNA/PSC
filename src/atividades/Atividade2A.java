package atividades;
import java.util.Scanner;

public class Atividade2A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = input.nextInt();
        int idadeAtual = anoAtual - anoNascimento;
        int idadeEm2050 = 2050 - anoNascimento;
        System.out.println("Idade no ano atual: " + idadeAtual);
        System.out.println("Idade em 2050: " + idadeEm2050); 
        input.close();
    }
}
