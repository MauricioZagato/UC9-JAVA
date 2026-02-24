import java.util.Scanner;

public class exercicio21 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi, rai, resp, area;
        pi = 3.14;

        System.out.println("Digite o valor do raio");
        rai = in.nextDouble();

        resp = (rai * pi * 2);
        System.out.println("O valor da circunfêrencia é: " + resp);

        area = pi * (rai * rai);
        System.out.println("O valor da área é: " + area);
    }
}
