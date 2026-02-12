import java.util.Scanner;

public class exercicio15 {
    public static void imprimirSaudacaoPersonalizada(){
        Scanner in = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome");
        nome = in.nextLine();

        System.out.println("Bem vindo " + nome + " agradecemos por escolher nosso programa, bom aproveito. ");
    }
    public static void main(String[] args) {
        imprimirSaudacaoPersonalizada();
    }
}
