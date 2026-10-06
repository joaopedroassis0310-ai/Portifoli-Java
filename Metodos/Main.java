package Metodos;

public class Main {
    public static void main(String[] args){
        
        luffy luffy = new luffy();
        luffy.nome = "Luffy";
        luffy.recompensa = 300000000000L;
        luffy.sonho = "ReiDosPiratas";
        luffy.tesouro = "Chapeu";

        zoro zoro = new zoro();
        zoro.nome = "Zoro";
        zoro.recompensa = 13438398L;
        zoro.sonho = "Melhor espadachim da mundo";
        zoro.tesouro = "Enma";
        
        sanji sanji = new sanji();
        sanji.nome = "sanji";
        sanji.recompensa = 10000000L;
        sanji.sonho = "Achar o ALL BLUE";
        sanji.tesouro = "Baratie";

        jinbe jinbe = new jinbe();
        jinbe.nome = "Jinbei";
        jinbe.recompensa = 1000000L;
        jinbe.sonho = "Paz";
        jinbe.tesouro = "NovaGeração";

        System.out.println("Nome: "+ luffy.recompensa);
 
        luffy.atacar();
       
    }
    
}
