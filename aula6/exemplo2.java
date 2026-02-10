package aula6;

public class exemplo2 {
    public static void sequence(int n) {
        while(n != 1){
            System.out.println(n);
            if(n%2==0){
                 n = n /2;}
            else{
                 n = (n * 3) + 1;
                }
        }
    }
    public static void main(String[] args) {
        sequence(3);
    }
}
