package ProjetoJava;

public class Main {
    public static void main (String[] args) {
        
        ContaCorr ContaCorr = new ContaCorr();
        ContaCorr.saldo = 0.0;

        

        depositar depositar = new depositar();
        sacar sacar = new sacar();

            System.out.println("Começando Opreção!");

    depositar.depositar(ContaCorr, 1520.0);
    sacar.sacar(ContaCorr, 2046346.0);


    } 
    
    
}

