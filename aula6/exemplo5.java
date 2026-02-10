package aula6;

public class exemplo5 {
    public static void nested(){
        for( int x = 1; x<= 10; x++ ){
            for(int y = 1; y <= 10; y++){
                System.out.printf("%4d" , x + y);
            }
        }
    }
    public static void main(String[] args) {
        nested();
    }
}
