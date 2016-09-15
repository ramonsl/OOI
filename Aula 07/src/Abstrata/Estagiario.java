package Abstrata;

/**
 * Created by ramon on 14/09/16.
 */
public class Estagiario extends Funcionario {

    @Override
    public void calcularAumento(int p) {

        salario *= p-1;
    }

    @Override
    public void relogioPonto() {
        System.out.println("Trabalhar mais");
    }

    public void fezMerda(){
        System.out.printf("PORRA");
    }
}
