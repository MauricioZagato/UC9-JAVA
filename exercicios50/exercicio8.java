import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double Fahr, C;
        
        System.out.println("Converta a temperatura de Fahrenheit para Celcius; Digite a temperatura. ");
        Fahr = in.nextDouble();

        C = (Fahr - 32) * 5.0 / 9.0;


        System.out.println("A temperatura em Graus celcius é: " + C );
    }
}
