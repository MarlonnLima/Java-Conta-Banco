import java.util.Scanner;

import models.ContaTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("Por favor digite o número da agencia: ");
        String numeroAgencia = sc.nextLine();

        System.out.println("Por favor digite o nome do cliente:");
        String cliente = sc.nextLine();

        System.out.println("Por favor digite o saldo da sua conta:");
        float saldo = Float.parseFloat(sc.nextLine());

        sc.close();

        ContaTerminal conta = new ContaTerminal(numero, numeroAgencia, cliente, saldo);
    }
}
