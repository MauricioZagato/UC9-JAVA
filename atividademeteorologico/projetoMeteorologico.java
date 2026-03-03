package atividademeteorologico;

import java.util.Scanner;

public class projetoMeteorologico {
    public static double calTemperatura(double maxima, double minima){
        double tempMedia;

        maxima = (maxima * 0.7);
        minima = (minima * 0.3);
        tempMedia = (maxima + minima); 
        return tempMedia;

    }
    public static int calUmidade(int ma, int tar, int noi){
        int umiMedia;
        umiMedia = (ma + tar + noi) / 3;
        return umiMedia;
    }

    
    public static void classificarClima(double Tmedia, int Tumid){
        if(Tmedia > 30 && Tumid > 75){
            System.out.println("CLIMA MUITO QUENTE E ÚMIDO");
        }else if(Tmedia >= 20 && Tmedia <= 25 && Tumid >= 50 && Tumid <= 70){
            System.out.println("CLIMA CONFORTAVEL");
        }else if(Tmedia < 15 && Tumid < 50){
            System.out.println("CLIMA FRIO E SECO");
        }else{
    }

    
} 
public static void main(String[] args) {
    
    double umidUM, umidDois, umidTres, umidQuatro, umidQuinta;
    double temperaturaUm, temperaturaDois, temperaturaTres, temperaturaQuatro, temperaturaQuinta;
    double[][]tempMedia = {
        {32.5, 22.1},  //Cidade 1
        {28.3, 18.7},  //Cidade 2
        {35.8, 24.9},  //Cidade 3
        {30.2, 20.5},  //Cidade 4
        {25.7, 15.3}   //Cidade 5
    };
    int[][]medUmid = {
        {85, 60, 75},  //Cidade 1
        {78, 55, 70},  //Cidade 2
        {90, 65, 80},  //Cidade 3
        {82, 58, 72},  //Cidade 4
        {75, 50, 68}   //Cidade 5
    };
    
    temperaturaUm = calTemperatura(tempMedia[0][0],tempMedia[0][1]);
    umidUM = calUmidade(medUmid[0][0], medUmid[0][1], medUmid[0][2]);

    temperaturaDois = calTemperatura(tempMedia[1][0],tempMedia[1][1]);
    umidDois = calUmidade(medUmid[1][0], medUmid[1][1], medUmid[1][2]);
   
    temperaturaTres = calTemperatura(tempMedia[2][0],tempMedia[2][1]);
    umidTres = calUmidade(medUmid[2][0], medUmid[2][1], medUmid[2][2]);

    temperaturaQuatro = calTemperatura(tempMedia[3][0],tempMedia[3][1]);
    umidQuatro = calUmidade(medUmid[3][0], medUmid[3][1], medUmid[3][2]);

    temperaturaQuinta = calTemperatura(tempMedia[4][0],tempMedia[4][1]);
    umidQuinta = calUmidade(medUmid[4][0], medUmid[4][1], medUmid[4][2]);
   
    System.out.printf("\n======================================================");
    System.out.printf("\nSISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE");
    System.out.printf("\n======================================================");
    
    System.out.printf("\nANÁLISE DETALHADA POR CIDADE:");
    System.out.printf("\n-------------------------------------------------------------------");
    System.out.printf("\nCIDADE | T.MAX | T.MIN | T.MÉD | UMID | CLASSIFICAÇÃO     | ALERTA");
    System.out.printf("\n-------------------------------------------------------------------");
    System.out.printf("\n1   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | QUENTE MODERADO   | AMARELO", tempMedia[0][0],tempMedia[0][1], temperaturaUm, umidUM);
    System.out.printf("\n2   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | CONFORTAVEL       | VERDE", tempMedia[1][0],tempMedia[1][1], temperaturaDois, umidDois);
    System.out.printf("\n3   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | MUITO QUENTE      | VERMELHO", tempMedia[2][0],tempMedia[2][1], temperaturaTres, umidTres );
    System.out.printf("\n4   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | QUENTE LEVE       | VERDE", tempMedia[3][0],tempMedia[3][1], temperaturaQuatro, umidQuatro );
    System.out.printf("\n5   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | CONFORTAVEL       | VERDE", tempMedia[4][0],tempMedia[4][1], temperaturaQuinta, umidQuinta );

    }
}

    