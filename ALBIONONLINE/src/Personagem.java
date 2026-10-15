package ALBIONONLINE.scr;

public class Personagem {
    private String nome;
    private int vida;
    private int nivel;
    private String classeNome;

    public Personagem(String nome, int vida, int nivel, String classeNome) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.classeNome = classeNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }

    public int getVida() {
        return vida;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public String getClasseNome() {
        return classeNome;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void atacar() {
        System.out.println(this.nome + " realiza um ataque basico.");
    }
}
