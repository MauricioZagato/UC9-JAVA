import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        Double n1, n2, n3;
        Double media;

        System.out.println("digite um número");
        n1 = in.nextDouble();

        System.out.println("digite um número");
        n2 = in.nextDouble();

        System.out.println("digite um número");
        n3 = in.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("Media final é: " + media);

    }
}
