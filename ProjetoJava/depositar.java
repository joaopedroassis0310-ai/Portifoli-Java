package ProjetoJava;


public class depositar {

    void depositar(ContaCorr contaAlvo, double valor){
      contaAlvo.saldo = contaAlvo.saldo + valor;
      System.out.println("Deposito " + valor);
}
}

