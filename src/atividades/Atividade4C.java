package atividades;
import java.util.Scanner;
public class Atividade4C {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Informe o valor do salário mínimo: ");
            double salarioMinimo = input.nextDouble();
            System.out.print("Informe o valor do salário do funcionário: ");
            double salarioFuncionario = input.nextDouble();
            double quantidadeSalarios = salarioFuncionario / salarioMinimo;
            System.out.printf("O funcionário recebe %.2f salários mínimos.%n", quantidadeSalarios);
            System.out.print("Deseja realizar outro cálculo? (S/N): ");
            continuar = input.next();
            
        } while (continuar.equalsIgnoreCase("S"));

        input.close();
    }
}