package exercicios.exe001;

public class usuario {
    public static void main(String[] args) {
        smartTv SmartTv = new smartTv();

        System.out.println("Tv está ligada?"+ smartTv.ligada);
        System.out.println("Tv está ligada?"+ smartTv.canal);
        System.out.println("Tv está ligada?"+ smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println(" Novo status => mudar canal ? "+ smartTv.volume);


    }
}
