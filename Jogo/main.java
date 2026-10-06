package Jogo;

public class main {
    public static void main(String[] args) {
        personagem heroi = new personagem();
        heroi.nome = "superJava";
        heroi.vida = 100;

            heroi.receberDano(40);
            heroi.receberDano(10);
            heroi.tomarPocaoCurativa(10);
            heroi.tomarPocaoCurativa(70);
    }
}
