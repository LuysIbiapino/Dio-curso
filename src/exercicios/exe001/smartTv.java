package exercicios.exe001;

public class smartTv {
    static Boolean ligada = false;
    static int canal = 13;
    static int volume = 10;


    public static void ligar(){
        ligada=true;
    }
    public static void desligar(){
        ligada = false;
    }
    public static void aumentarVolume(){
        volume = volume + 1;
    }public static void diminuirVolume(){
        volume = volume - 1;
    }
    public static void mudarCanal(){
        canal = canal + 1;
    }
    public static void definirCanal(int novoCanal){
        canal = novoCanal;
    }

}
