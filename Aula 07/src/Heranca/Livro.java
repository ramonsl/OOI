package Heranca;

/**
 * Tenstando Herança com uma flag "impresso"
 */
public class Livro {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;


    public Livro(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        } else if (!this.impresso && porcentagem > 0.15) {
            return false;
        } else {
            this.valor -= this.valor * porcentagem;
            return true;
        }
    }
}