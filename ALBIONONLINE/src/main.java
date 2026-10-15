package ALBIONONLINE.scr;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       BEM-VINDO A ALBION ONLINE      ");
        System.out.println("======================================");
        
        System.out.print("Digite o nome do seu personagem: ");
        String nomeJogador = sc.nextLine();

        System.out.println("\nEscolha a sua classe:");
        System.out.println("1 - Mago");
        System.out.println("2 - Guerreiro");
        System.out.print("Opcao: ");
        int opcaoClasse = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        Personagem jogador;

            if (opcaoClasse == 1) {
            jogador = new Mago(nomeJogador, 100, 1);
        } else if (opcaoClasse == 2) {
            jogador = new Guerreiro(nomeJogador, 100, 1);
                } else {
                    System.out.println("Opcao invalida! A definir como Guerreiro por defeito.");
                    jogador = new Guerreiro(nomeJogador, 100, 1);
        }

        Personagem monstro = new Personagem("Dragao", 100, 5, "Monstro");
        int danoMonstro = 30;
        boolean combateTerminado = false;

        System.out.println("\nAlguns inimigos apareceram...");
        System.out.println("Nome do Inimigo: " + monstro.getNome());
        System.out.println("Vida do monstro: " + monstro.getVida());
        System.out.println("Vida do jogador (" + jogador.getNome() + " - " + jogador.getClasseNome() + "): " + jogador.getVida());

        while (monstro.estaVivo() && jogador.estaVivo() && !combateTerminado) {
            System.out.println("\n======================================");
            System.out.println("O que queres fazer?");
            System.out.println("1 - Atacar");
            System.out.println("2 - Fazer alianca");
            System.out.println("======================================");
            System.out.print("Escolha: ");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                jogador.atacar();
                
                int danoJogado = 0;
                if (jogador instanceof Mago) {
                    danoJogado = ((Mago) jogador).getDano();
                } else if (jogador instanceof Guerreiro) {
                    danoJogado = ((Guerreiro) jogador).getDano();
                }

                monstro.receberDano(danoJogado);
                System.out.println("Deste " + danoJogado + " de dano ao monstro!");
                System.out.println("Vida atual do monstro: " + monstro.getVida());

                    if (monstro.estaVivo()) {
                    System.out.println("\nE a vez do monstro!");
                    System.out.println("O monstro lanca um ataque de fogo!");
                    jogador.receberDano(danoMonstro);
                    System.out.println("Perdeste " + danoMonstro + " de vida!");
                    System.out.println("Vida atual do jogador: " + jogador.getVida());
                }

        } else if (escolha == 2) {
                System.out.println("\nTentaste fazer uma alianca!");
                System.out.println("Digita um numero de 0 a 10:");
                int numeroJogador = sc.nextInt();

                    if (numeroJogador < 0 || numeroJogador > 10) {
                    System.out.println("Numero invalido! Escolhe entre 0 e 10.");
            } else if (numeroJogador == 5) {
                    System.out.println("\nParabens! Fizeste uma alianca!");
                    System.out.println("O monstro agora e teu aliado!");
                    combateTerminado = true;
                } else {
                    System.out.println("\nA alianca falhou!");
                    System.out.println("O monstro ataca-te por raiva!");
                    jogador.receberDano(danoMonstro);
                    System.out.println("Perdeste " + danoMonstro + " de vida!");
                    System.out.println("Vida atual do jogador: " + jogador.getVida());
                }
            } else {
                System.out.println("Escolha invalida! Digita 1 ou 2.");
            }
        }

        System.out.println("\n======================================");
        if (combateTerminado) {
            System.out.println("COMBATE TERMINADO! O monstro e teu aliado!");
        } else if (!monstro.estaVivo()) {
            System.out.println("Parabens! Derrotaste o monstro!");
        } else if (!jogador.estaVivo()) {
            System.out.println("Foste derrotado pelo monstro! Tenta novamente.");
        }
        System.out.println("Vida final do jogador: " + jogador.getVida());
        System.out.println("Vida final do monstro: " + monstro.getVida());
        System.out.println("======================================");

        sc.close();
    }
}
