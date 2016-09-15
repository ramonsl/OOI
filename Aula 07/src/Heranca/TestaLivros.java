package Heranca;

import java.util.List;

/**
 * Created by ramon on 14/09/16.
 */
public class TestaLivros {

    public static void main(String[] args) {
        Livro l = new Livro(new Autor());
        Ebook e = new Ebook(new Autor());
        System.out.println(l.aplicaDescontoDe(0.2));
        System.out.println(e.aplicaDescontoDe(0.14));

    }
}
