package atividades;
import java.util.Scanner;
public class Atividade3A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalAlunosNota90OuMais = 0;
        int totalAlunosReprovados = 0;
        int totalAlunos = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;

        while (true) {
            System.out.println("Digite a nota final do aluno (digite um número negativo para sair): ");
            double nota = input.nextDouble();

            if (nota < 0) {
                break;
            }

            System.out.println("Digite o total de faltas do aluno: ");
            int faltas = input.nextInt();

            totalAlunos++;

            if (nota >= 90) {
                totalAlunosNota90OuMais++;
            }

            if (nota < 70 || faltas >= 20) {
                totalAlunosReprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }

            somaNotas += nota;
        }

        if (totalAlunos > 0) {
            double mediaNotas = somaNotas / totalAlunos;

            System.out.println("Quantidade de alunos com nota final >= 90: " + totalAlunosNota90OuMais);
            System.out.println("Quantidade de alunos reprovados (por nota ou por falta): " + totalAlunosReprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + mediaNotas);
        } else {
            System.out.println("Nenhum aluno foi informado.");
        }

        input.close();
    }
}