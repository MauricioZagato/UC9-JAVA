import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        String nome;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        nome = in.nextLine();

        System.out.println("Olá " + nome);
    }
}
