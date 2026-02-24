package exercicios20;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2;
        

        System.out.println("Digite um número");
        num1 = in.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = in.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = in.next().charAt(0);

        switch (operacao){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                    break;
                }else{
                    System.out.println("Não divide por zero");
                     return;
                }
             default:
                System.out.println("Operação inválida");   
                break;
        }
    }
    
}
