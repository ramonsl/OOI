import java.util.Scanner;

/**
 * Created by ramon on 10/08/16.
 */
public class Livro {
    private   String nome;
    private double valor;
    private String descricao;
    private String isbn;
    Scanner tc = new Scanner(System.in);
    private Autor autor;
    public static int cont=0;

    public static int getCont(){
       // System.out.println(isbn);
        return cont;
    }

    public void setNome(String n){
        this.nome =n;
    }
    public String getNome(){
        return this.nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
//modificadorDeAcesso tipoDeRetorno nomeDoMetodo(Parametros){
    // codigo
    // }

    public void ler(){
        System.out.println("Digite o nome");
        this.nome =tc.next();
        //    System.out.println("Digite o desc");
        //   this.descricao = tc.next();
        System.out.println("valor:");
        this.valor = tc.nextDouble();
        System.out.println("Digite o isbn");
        this.isbn = tc.next();
        autor = new Autor();
        autor.ler();
    }

    public void mostrar(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Valor: "+this.valor);
        System.out.println("descricao: "+this.descricao);
        System.out.println("isbn: "+this.isbn);
        System.out.println("Autor");
        this.autor.mostrar();
    }
    /* forma sem retorno
        void aplicarDesconto(double desconto){
            System.out.println("valor antigo "+ this.valor);
            this.valor -=this.valor * desconto;
            System.out.println("valor com desconto "+ this.valor);
        }
    */
    boolean aplicarDesconto(double desconto){
        if(desconto<0.3){
            System.out.println("valor antigo "+ this.valor);
            double desc =this.valor * desconto;
            this.valor -=this.valor * desconto;
            System.out.println("valor com desconto "+ this.valor);
            return true;
        }else{
            //  System.out.println("Não foi possivel realizar operação");
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        return isbn != null ? isbn.equals(livro.isbn) : livro.isbn == null;

    }
    /*Criar 3 construtores para nossos livros. 
    O primeiro realiza a leitura de todos os dados no construtor.
    o Segundo recebe por paramento o autor, e faz a leitura no
    construtor dos demais dados do livro.
    o terceiro recebe os dados do livro pro parâmetro e um autor.
*/
    public Livro(){
            this.ler();
        cont++;
    }
    public Livro(Autor a){
        this.ler();
        this.autor=a;
        cont++;
     //   this.setAutor(a);
    }
    public Livro(String n, double v, String i,Autor autor){
        this.valor=v;
        this.nome=n;
        this.isbn=i;
        this.ler();
    }


}
