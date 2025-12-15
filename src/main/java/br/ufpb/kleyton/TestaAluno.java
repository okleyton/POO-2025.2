package br.ufpb.kleyton;
import java.util.Scanner;

public class TestaAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite a matrícula do aluno " + (i + 1) + ":");
            String matricula = scanner.nextLine();

            double[] notas = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite a nota " + (j + 1) + ":");
                notas[j] = scanner.nextDouble();
            }
            scanner.nextLine(); // limpa o buffer

            alunos[i] = new Aluno(nome, matricula, notas);
        }

        System.out.println("\nMédias dos alunos:");
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() +
                    " | Matrícula: " + aluno.getMatricula() +
                    " | Média: " + aluno.getMedia());
        }

        scanner.close();
    }
}
