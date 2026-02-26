package atividademeteorologico;

import java.util.Scanner;

public class dadosCidades {
    public static void analiseMeteorologica(){
        Scanner in = new Scanner(System.in);
        double tempMax, tempMin, tempMedia;

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

    System.out.println("Digite a temperatura máxima da cidade em que mora");
    tempMax = in.nextDouble();

    System.out.println("Digite a temperatura mínima da cidade em que mora");
    tempMin = in.nextDouble();
    
    tempMedia = (tempMax / tempMin);



    }
}
