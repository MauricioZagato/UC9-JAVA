package aula6;

public class Loops {
    
    public static void countdown(int num){
        int n = 0;
        while (n <= num) {

            System.out.println(n);
            n++;

            
        }
            System.out.println("Abrobão!");
    }
    public static void main(String[] args) {
        int num = 10;
        countdown(num);
        System.out.println("Sistema Finalizado.");
    }
}
