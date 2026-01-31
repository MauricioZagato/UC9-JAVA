import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        Double Quant, Vtotal;
        int valor = 15;

        System.out.println("Bem vindo ao hotdogZagato. ");
        System.out.println("Hotdog da casa R$ 15,00 reais cada. Digite a quantidade que deseja. ");

        Quant = in.nextDouble();

        Vtotal = (Quant * 15);

        System.out.println("Seu pedido possui a quantidade de " + Quant + " lanches, e o valor total foi de " + Vtotal);
    }
}
