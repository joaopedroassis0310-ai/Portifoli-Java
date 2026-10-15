package ALBIONONLINE.scr;

public class Guerreiro extends Personagem {
    private int dano = 20;

    public Guerreiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel, "Guerreiro");
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void atacar() {
        System.out.println("O Guerreiro saca a sua espada...");
        System.out.println("Shiiing! (Causou " + dano + " de dano)");
    }
}
