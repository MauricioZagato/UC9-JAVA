import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double cen, conv;

        System.out.println("Convertor de polégadas para CM, digite as polégadas");
        cen = in.nextDouble();

        conv = cen * 2.54;
        System.out.println("A resposta em centimentros é: " + conv);
    }
}
