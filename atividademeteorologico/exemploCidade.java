package atividademeteorologico;

import java.util.Scanner;

public class exemploCidade {
    public static void cidadeUM(){
         Scanner in = new Scanner(System.in);
        double tempMax, tempMin, tempMedia, max, min;
        int ma; int tar; int noi;
        int medUmid;
        
        max = (tempMax * 0.70);
        min = (tempMin * 0.30);
        
        tempMedia = (tempMax + tempMin) / 2;
        System.out.println("A temperatura média da cidade digitada é: " + tempMedia);
        
        ma = 85;
        tar = 60;
        noi = 75;
        
        medUmid = (ma + tar + noi) / 3;
        
        Double numeroDouble = new Double(medUmid);
        
        System.out.println("A media da umidade durante o dia todo foi de: " + medUmid);
        classificarClimaUM(tempMedia, medUmid);
    }
    public static void classificarClimaUM(double Tmedia, int Tumid){
       if(Tmedia > 30 && Tumid > 75){
           System.out.println("CLIMA MUITO QUENTE E ÚMIDO");
       }else if(Tmedia >= 20 && Tmedia <= 25 && Tumid >= 50 && Tumid <= 70){
           System.out.println("CLIMA CONFORTAVEL");
       }else if(Tmedia < 15 && Tumid < 50){
           System.out.println("CLIMA FRIO E SECO");
       }else{}
    }

public static void main(String[] args) {
    cidadeUM();
    System.out.println("\n");
   
    
    double[][]tempMedia = {
        {32.5, 22.1},  //Cidade 1
        {28.3, 18.7},  //Cidade 2
        {35.8, 24.9},  //Cidade 3
        {30.2, 20.5},  //Cidade 4
        {25.7, 15.3}   //Cidade 5
    };
    
    double[][]medUmid = {
        {85, 60, 75},  //Cidade 1
        {78, 55, 70},  //Cidade 2
        {90, 65, 80},  //Cidade 3
        {82, 58, 72},  //Cidade 4
        {75, 50, 68}   //Cidade 5
    };
        
         
    }
}