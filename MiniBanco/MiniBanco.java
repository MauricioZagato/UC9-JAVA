package MiniBanco;
import java.util.Scanner;

public class MiniBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MiniBanco iniciado. ");

        //variaveis principais da contas
        double saldo  = 0.0;
        int    opcao  = -1;

        //Boas Vindas
        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.printf("Olá, %s! Saldo inicial: R$ %.2f\n", nome, saldo);

        scanner.close();
    }
}
 