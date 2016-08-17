/**
 * Created by ramon on 17/08/16.
 */
public class Conta {
   public double saldo;
   public int numero;
   public String senha;
   public Cliente titular;

    boolean sacar(double v){
        this.saldo -= v;
        System.out.println("Saque efetuado:"+v);
        System.out.println("Saldo da conta é:"+this.saldo);
        return true;
    }

    boolean depositar(double v){
        this.saldo +=v;
        System.out.println("Desposito ok:"+v);
        System.out.println("Saldo da conta é:"+ this.saldo);
        return true;
    }

     boolean transferir(Conta destino, double v){
         this.saldo -=v;
         destino.depositar(v);
         System.out.println("Saldo da conta é:"+ this.saldo);
         return true;
     }

     boolean transferir( double v, Conta destino){
         this.sacar(v);
         destino.depositar(v);
         return true;
     }



}
