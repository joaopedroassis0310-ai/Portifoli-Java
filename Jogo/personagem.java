package Jogo;

public class personagem {
    //Atributos sem proteção
    String nome;
    int vida;

    //Métodos impor regra
    void tomarPocaoCurativa(int cura){
        vida = vida + cura;
        if (vida > 100){

            vida = 100;
        }
        System.out.println("vida" + cura);
    }
    void receberDano(int dano){
        

    }
}
