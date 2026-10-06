package ProjetoJava;

public class sacar {

    void sacar(ContaCorr contaAlvo, double valor){
      if (contaAlvo.saldo >= valor) {
        contaAlvo.saldo = contaAlvo.saldo - valor;
        System.out.println("Saque " + valor);
      }else{

    System.out.println("SaqueNegado!");
}

}}