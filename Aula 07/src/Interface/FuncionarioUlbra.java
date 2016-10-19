package Interface;

/**
 * Created by ramon on 14/09/16.
 */
public class FuncionarioUlbra implements Aluno,Funcionario,Professor {
    private String nome;

    @Override

    public void acessoPearson() {
        System.out.println("Acesso a Biblioteca Virtual");
    }

    @Override
    public void calcularPonto() {
        System.out.println("Seu horario é tanto");
    }

    @Override
    public void acessoCapes() {

            System.out.println("Acessa a capes");


    }
    public void teste(){

    }
}
