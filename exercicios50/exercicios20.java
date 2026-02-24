import java.util.Scanner;

public class exercicios20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double dol, taxa, total;

        System.out.println("Digite o valor em dolar que dejesa depositar. ");
        dol = in.nextDouble();

        System.out.println("Digite a taxa do dolar");
        taxa = in.nextDouble();

        total = (taxa * dol);

        System.out.println("O valor total do depósito do dolar para real é: " + total);
    }
}
