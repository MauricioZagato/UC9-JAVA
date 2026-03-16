package MiniBanco;
import java.util.Scanner;

public class MiniBanco {

    static void exibirMenu(){
        System.out.println("\n=== MiniBanco ===");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Ver Extrato");
        System.out.println("0 - Sair");
        System.out.println("Escolha: ");
    }
    
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

        exibirMenu();

        scanner.close();
    }
}
 