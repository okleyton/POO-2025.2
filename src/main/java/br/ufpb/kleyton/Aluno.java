package br.ufpb.kleyton;
import java.util.Arrays;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno() {
    }

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getMedia() {
        if (notas == null || notas.length == 0) {
            return 0;
        }

        double soma = 0;
        for (double n : notas) {
            soma += n;
        }

        return soma / notas.length;
    }

    @Override
    public String toString() {
        return "Aluno: " +
                "nome = " + nome +
                ", matricula = " + matricula +
                ", notas = " + Arrays.toString(notas) +
                String.format(", media = %.2f", getMedia());

    }

}