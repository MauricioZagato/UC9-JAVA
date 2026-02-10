package aula6;

public class exemplo4 {
    public static void loopvar(){
        int n;
        for (n = 3; n > 0; n--){
            System.out.println(n);
        }
        System.out.println("valor de n: " + n);
    }
    
    public static void main(String[] args) {
        loopvar();
    }
}