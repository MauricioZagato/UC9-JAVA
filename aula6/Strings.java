package aula6;

public class Strings {
    public static void main(String[] args) {
        String fruta = "banana";
        char letra;
        //char letra = fruta.charAt(3);
                    //b=0 a=1 n=2 a=3 n=4 a=5 
       // System.out.println(letra);
        //letra = fruta.charAt(1);
        //System.out.println(letra);
        //letra= fruta.charAt(2);
        //System.out.println(letra);

        for (int i = 0; i <= fruta.length(); i++){
            letra = fruta.charAt(i);
            System.out.println(letra);
            if(letra == 'A')
                System.out.println("achamos um Azão!!!");
        }

    }
}
