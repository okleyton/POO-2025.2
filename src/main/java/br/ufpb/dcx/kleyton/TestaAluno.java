package br.ufpb.dcx.kleyton;
import java.util.Locale;
import java.util.Scanner;

public class TestaAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        final int NUMERO_NOTAS = 3;

        final int TOTAL_ALUNOS = 3;

        Aluno[] alunos = new Aluno[TOTAL_ALUNOS];

        System.out.println("CADASTRO DE ALUNOS");

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\n--- Aluno " + (i + 1) + " ---");

            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a matrícula: ");
            String matricula = scanner.nextLine();

            double[] notas = new double[NUMERO_NOTAS];

            for (int j = 0; j < NUMERO_NOTAS; j++) {
                System.out.print("Digite a sua nota" + (j + 1) + ": ");
                notas[j] = Double.parseDouble(scanner.nextLine());
            }

            alunos[i] = new Aluno(nome, matricula, notas);

        }
        scanner.close();

        System.out.println("MÉDIA DOS ALUNOS");
        for (Aluno aluno : alunos) {
            System.out.printf("A média do aluno %s (Matricula: %s) é: %.2f%n",
                    aluno.getNome() ,
                    aluno.getMatricula() ,
                    aluno.getMedia());
        }
    }
}