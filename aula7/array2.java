package aula7;

public class array2 {
    

    public static void printaArray(int[] a){

        int[] counts; // um array ou vetor de int's
        double[] values; // um array ou detor de double's
        int size = 10;
        
        counts = new int[4]; // hard array tamanho fixo;
        values = new double[size]; //array com tamanho variável
        
        int[] num = {1, 2, 3, 4};

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++; // isso fica igual a 1.
        counts[3] -= 60; // fica igual -60

         for(int i = 0; i < 4; i++ ){
            System.out.println(counts[i]);
        }
    }
    public static void main(String[] args) {
        printaArray(null);
    }
}
