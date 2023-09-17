package Conta_Bancaria_Dio;
import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o número da Agência !");
        int numero = sc.nextInt();
        System.out.println();

        System.out.println("Por favor, digite a sua Agência: ");
        String agencia = sc.next();
        System.out.println();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente= sc.next();
        System.out.println();

        System.out.println("Deposite um valor para finalizar o cadastro: ");
        double saldo = sc.nextDouble();
        System.out.println(saldo);

        System.out.println("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.".formatted(nomeCliente, agencia, numero, saldo));

        sc.close();


    }

}
