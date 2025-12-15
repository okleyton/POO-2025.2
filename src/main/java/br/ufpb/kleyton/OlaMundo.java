package br.ufpb.kleyton;

public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Aluno aluno = new Aluno("Kleyton", "2025001", new double[] {8.0, 7.5, 9.0});
        System.out.println(aluno);
    }
}