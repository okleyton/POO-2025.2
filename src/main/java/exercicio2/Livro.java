package exercicio2;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 100) {
            throw new IllegalArgumentException("Porcentagem inválida!");
        }
        preco -= preco * (porcentagem / 100);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + anoPublicacao +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;

        Livro livro = (Livro) o;

        return titulo.equals(livro.titulo) &&
                autor.equals(livro.autor);
    }

    @Override
    public int hashCode() {
        int result = titulo.hashCode();
        result = 31 * result + autor.hashCode();
        return result;
    }
}
