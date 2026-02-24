package aula7;

import atividadefilmes.maratona;

public class array {
    public static void printArray(int[] a){

         for(int i = 0; i < 4; i++ ){
            
            //for (int v : a){
            //System.out.println(v);
            //}
         }
    }
    //public static void main(String[] args) {
        public static void main(String[] args) {
            
        int[] counts; // um array ou vetor de int's
        double[] values; // um array ou detor de double's
        int size = 10;
        

        // criação dos vetores:
        counts = new int[4]; // hard array tamanho fixo;
        values = new double[size]; //array com tamanho variável.


        //inicialização com atribuição de valores;
        int[] a = {1, 2, 3, 4};

        printArray(a);

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++; // isso fica igual a 1.
        counts[3] -= 60; // fica igual -60

        for(int i = 0; i < 4; i++ ){
            System.out.println(counts[i]);
          //  for (n = 3; n > 0; n--)
       // int i = 0;
        //while(1<4){
        //    System.out.println(counts[i]);
        //    i++;

         }        
    }
}
    