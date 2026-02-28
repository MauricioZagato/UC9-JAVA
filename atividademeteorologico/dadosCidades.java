package atividademeteorologico;

import java.util.Scanner;

public class dadosCidades {
    public static void analiseMeteorologica(){
        Scanner in = new Scanner(System.in);
        double tempMax, tempMin, tempMedia, max, min;
        double ma; double tar; double noi;
        double medUmid;
        
        System.out.println("Digite a temperatura máxima da cidade em que mora");
        tempMax = in.nextDouble();
        
        System.out.println("Digite a temperatura mínima da cidade em que mora");
        tempMin = in.nextDouble();
        
        max = (tempMax * 0.70);
        min = (tempMin * 0.30);
        
        tempMedia = (tempMax + tempMin) / 2;
        System.out.println("A temperatura média da cidade digitada é: " + tempMedia);


        // umidade 
        
        System.out.println("Digite a umidade na parte da manhã");
        ma = in.nextDouble();
        
        System.out.println("Digite a umidade da parte da tarde");
        tar = in.nextDouble();
        
        System.out.println("Digite a umidade da parte da noite");
        noi = in.nextDouble();
        
        medUmid = (ma + tar + noi) / 3;
        
        Double numeroDouble = new Double(medUmid);

        System.out.println("A media da umidade durante o dia todo foi de: " + medUmid);
         classificarClima(tempMedia, (int) medUmid);
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
        analiseMeteorologica();
        classificarClima(0, 0);
    }
}

    //{32.5, 22.1},  Cidade 1
    //{28.3, 18.7},  Cidade 2
    //{35.8, 24.9},  Cidade 3
    //{30.2, 20.5},  Cidade 4
    //{25.7, 15.3}   Cidade 5

    // umidade
    //{85, 60, 75},  Cidade 1
    //{78, 55, 70},  Cidade 2
    //{90, 65, 80},  Cidade 3
    //{82, 58, 72},  Cidade 4
    //{75, 50, 68}   Cidade 5
