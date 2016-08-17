/**
 * Created by ramon on 17/08/16.
 */
public class TestaMain {
/*
    Elabore uma classe Conta Corrente,
    com os seguintes atributos, saldo,
    numero da conta, senha e titular.
    Titular é um atributo composto de uma
     classe Cliente, os atributos de uma
     classe cliente é cpf, nome e idade.
      Crie métodos que possibilite
      efetuar um saque, efetuar um deposito e
      transferir valores de uma conta para outra.
*/
public static void main(String[] args) {
  Conta c = new Conta();
  Conta c2 = new Conta();

    c.saldo=100;
    c.numero=0001;
    Cliente cliente = new Cliente();
    cliente.nome= "Ramon";
    c.titular=cliente;

    c2.saldo =0;
    c2.numero =0002;
    c2.titular =cliente;

  c.sacar(50);
  c.depositar(100);
  c.transferir(c2,77);


}

}
