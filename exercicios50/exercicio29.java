import java.util.Scanner;

public class exercicio29 {
    public static void imprimirLinhaTracejada(int comp){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho do comprimento ");
        comp = in.nextInt();

        for(int i = 0; i < comp; i++){
            System.out.println("-");
        }
    }
    public static void main(String[] args) {
        imprimirLinhaTracejada(0);
    }
}
