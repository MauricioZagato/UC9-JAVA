import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num;
        char numero;

        System.out.println("Digite um número de 3 digitos");
        num = in.nextLine();
                   
        System.out.println(num.charAt(0));
        System.out.println(num.charAt(1));
        System.out.println(num.charAt(2));
        
    }
}
