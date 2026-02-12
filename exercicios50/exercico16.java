import java.util.Scanner;

public class exercico16 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Double valor, porcentagem, gorjeta;
        Double total;
        
        System.out.println("Digite o valor total da conta ");
        valor = in.nextDouble();
        
        System.out.println("Digite o valor da gorjeta ");
        porcentagem = in.nextDouble();

        gorjeta = (valor * porcentagem ) / 100;

        total = valor + gorjeta;

        System.out.println(" Valor total da conta com gorjeta, é: " + total );
    }
}
