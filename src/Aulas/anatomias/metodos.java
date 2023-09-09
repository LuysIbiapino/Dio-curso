package Aulas.anatomias;

public class metodos {
    public static void main(String[] args) {
        String primeiroNome="Luys ";
        String segundoNome ="fernando";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado da junção dos nomes:" + primeiroNome.concat(" ").concat(segundoNome);
    }


}
