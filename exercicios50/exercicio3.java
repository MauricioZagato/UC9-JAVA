import java.util.Scanner;


public class exercicio3 {
 
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Digite o comprimento do triangulo. ");
      int comp = in.nextInt();
      System.out.println("Digite a largura do triangulo. ");
      int larg = in.nextInt();
      System.out.println("A área do triangulo é: " + comp * larg / 2);
   }
}

