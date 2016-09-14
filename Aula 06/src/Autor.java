import java.util.Scanner;

/**
 * Created by ramon on 10/08/16.
 */
public class Autor {
    String nome;
    String email;
    String cpf;
    Scanner tc = new Scanner(System.in);

    public void ler(){
        System.out.println("Digite o nome do autor:");
        this.nome =tc.next();
        System.out.println("Digite email");
        this.email = tc.next();
       // System.out.println("cpf:");
        //this.cpf = tc.next();

    }

    public void mostrar(){
        System.out.println("Autor ="+ this.nome);
        System.out.println("Digite email =" +this.email);

    }


}
