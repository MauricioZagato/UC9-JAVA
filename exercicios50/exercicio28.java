import java.util.Scanner;

public class exercicio28 {
    public static void descreverDivisao(int a, int b, int q){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número");
        a = in.nextInt();

        System.out.println("Digite outro número");
        b = in.nextInt();

        q = (a / b);

        System.out.println(a + " dividido por " + b + " é igual a: " + q);
    }
    public static void main(String[] args) {
        descreverDivisao(0, 0, 0);
    }
}
