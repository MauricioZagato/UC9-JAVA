import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Double resposta,seg, hr;

    System.out.println("Digite o valor de segunda pra converter em horas. ");
    resposta = in.nextDouble();

    hr = (resposta / 3600);
    seg = (resposta * 60);

    System.out.println("O valor em hora é: " + hr + " em minutos são: " + seg);


    }
}
