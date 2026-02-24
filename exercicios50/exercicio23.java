import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro");
        numero = in.nextInt();

        if(numero % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
