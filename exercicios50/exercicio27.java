import java.util.Scanner;

public class exercicio27 {
    public static void imprimirMaximo(int a, int b){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número");
        a = in.nextInt();

        System.out.println("Digite outro número");
        b = in.nextInt();

        if( a > b){
            System.out.println(a + " maior que " + b);
        }else if(b > a){
            System.out.println(b + " maior que " + a);
        }else{
            System.out.println(a + " é igual a " + b);
        }
    }
    public static void main(String[] args) {
        imprimirMaximo(0, 0);
    }
}