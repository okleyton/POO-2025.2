package exercicio2;
import java.util.ArrayList;
import java.util.List;

public class SistemaLivros {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) throws Exception {
        if (livros.contains(livro)) {
            throw new Exception("Livro já cadastrado!");
        }
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }
}