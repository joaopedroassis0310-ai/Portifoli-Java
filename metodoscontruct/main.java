package metodoscontruct;

public class main {
    public static void main(String[] args) {
        produto camisa = new produto("camisa", 150.0);


    System.out.println("Item" + camisa.getNome());
    System.out.println("Item" + camisa.getPreco());

    System.out.println("Aplicando Desconto --> .....");

    camisa.setPreco(-20);

    camisa.setPreco(50);

    
    }
}
