package Abstrata;

/**
 * Created by ramon on 14/09/16.
 */
public abstract class Funcionario {
    protected String nome;
    protected  double salario;
    public String departamento;

    public void calcularAumento(int p){
        this.salario*=p;
    }

    public abstract void relogioPonto();

}
