package exercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SistemaLivros sistema = new SistemaLivros();

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o título do livro:");
            String titulo = sc.nextLine();

            System.out.println("Digite o autor:");
            String autor = sc.nextLine();

            System.out.println("Digite o ano:");
            int ano = Integer.parseInt(sc.nextLine());

            System.out.println("Digite o preço:");
            double preco = Double.parseDouble(sc.nextLine());

            Livro livro = new Livro(titulo, autor, ano, preco);

            sistema.adicionarLivro(livro);

            System.out.println("Livro cadastrado com sucesso!");
        }
        catch (NumberFormatException e) {
            System.out.println("Erro: você digitou número inválido!");
        }
        catch (Exception e) {
            System.out.println("Erro ao adicionar livro: " + e.getMessage());
        }

        System.out.println("Livros cadastrados no sistema:");
        for (Livro l : sistema.listarLivros()) {
            System.out.println(l);
        }

        sc.close();
    }
}
