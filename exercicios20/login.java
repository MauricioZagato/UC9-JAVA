package exercicios20;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String conta, senha;
       

        System.out.println("Digite o nome do usuário: ");
        conta = in.nextLine();

        System.out.println("Digite a senha: ");
        senha = in.nextLine();

       


        if(conta.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }
        return;
      
    }
    
}
