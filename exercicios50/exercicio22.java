import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id;

        System.out.println("Qual sua idade?");
        id = in.nextInt();

        if(id < 12){
            System.out.println("Criança");
        }else if(id < 18){
            System.out.println("Jovem");
        }else{
            System.out.println("Adulto");
        }
    }
}

