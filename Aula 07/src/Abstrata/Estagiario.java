package Abstrata;

/**
 * Created by ramon on 14/09/16.
 */
public class Estagiario extends Funcionario {
    @Override
    public void calcularAumento(int p) {
        super.calcularAumento(p-1);
    }
}
