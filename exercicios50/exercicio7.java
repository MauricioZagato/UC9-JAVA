import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        int resultado;

        System.out.println("Escolha um numéro inteiro ");
        num1 = in.nextInt();

        System.out.println("Escolha outro numéro inteiro ");
        num2 = in.nextInt();

        resultado = num1 * num2;

        System.out.println("o produto é: " + resultado);
      
    }
}
