package metodoscontruct;

public class produto {
    private String nome;
    private double preco;

public produto(String nomeInicial, double precoInicial){
    this.nome = nomeInicial;
    this.preco = precoInicial;

}

    public String getNome(){
        return this.nome;

    }

    public double getPreco(){
        return this.preco;
}

public void setPreco(double novoPreco){
    if (novoPreco >= 0) {
        preco = novoPreco;
        System.out.println("Preço do" + nome + "atualizado para" + novoPreco);  
    }else {
        System.out.println("ERROR");
    }

}


}