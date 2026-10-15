package ALBIONONLINE.scr;

public class Mago extends Personagem {
    private int dano = 30;

    public Mago(String nome, int vida, int nivel) {
        super(nome, vida, nivel, "Mago");
    }

    public int getDano() {
        return dano;
    }

    @Override
    public void atacar() {
        System.out.println("O Mago ergue o seu cajado...");
        System.out.println("Bola de fogo! (Causou " + dano + " de dano)");
    }
}
