package atividademeteorologico;

import aula7.array;

public class projetoMeteorologico {
    public static double calTemperatura(double maxima, double minima){ // um metodo sedo criado
        double tempMedia; //criando uma variavel

        maxima = (maxima * 0.7); // vamos calcular a temperatura máxima
        minima = (minima * 0.3); // vamos calcular a temperatura minima
        tempMedia = (maxima + minima); //aqui acharemos o tempo médio somando elas
        return tempMedia; //retornamos o valor no método calTemperatura

    }
    public static int calUmidade(int ma, int tar, int noi){
        int umiMedia; //criando uma variavel para saber a média da umidade
        umiMedia = (ma + tar + noi) / 3; 
        return umiMedia; //pedimo para retornar a media o método calUmidade
    }

    public static boolean validarTemperatura(double temp){ //usamos o método boolean, onde usamos true false

        if(temp >= -50 && temp <= 60){ // as temperaturas que cairem dentro do (-50, 60), entram no true, e rodam no sistemas 
           return true;                //as que forem fora desse padrão, cairão no false, e não roda no sistema. 
        }else{
            return false;
        }

    } 


    public static String classificarClima(double Tmedia, int Tumid){ //aqui criamos um metodo para classificar a temperatura
        if(Tmedia > 30 && Tumid > 75){ //entre essa temperatura e umidade, retorna se esta quente, caso não, vai para a linha de baixo
            return"MUITO QUENTE";
        }else if(Tmedia >= 20 && Tmedia <= 25 && Tumid >= 50 && Tumid <= 70){ //se estiver entre essas medidas retorna, caso ao contrário, vai para linha de baixo
            return"CONFORTAVEL ";
        }else if(Tmedia < 15 && Tumid < 50){ //Também ve se esta entre essas medidas para retornar, caso ao contrário, vai para linha de baixo
            return"FRIO/SECO   ";
        }else{
            return"MODERADO    ";
        }
    }

     //public static String gerarAlertas(int cidadeIndex, int tempinho, int umidadinha){
      
       // if (tempinho > 35 || umidadinha > 90){
            //return("Alerta Vermelho");
        //}else if(tempinho >= 30 && tempinho <= 35 && umidadinha > 80){
            //return("Alerta Amarelo");
        //}else{
            //return("Alerta Verde");
        //}  
    
    public static void main(String[] args) {

        //validarTemperatura();

        double umidUM, umidDois, umidTres, umidQuatro, umidQuinta; //variaveis criadas
        double temperaturaUm, temperaturaDois, temperaturaTres, temperaturaQuatro, temperaturaQuinta, temperaturaMeTotal, tempMaisQuente, tempMaisFria; //variaveis criadas
        String climaUm, climaDois, climaTres, climaQuatro, climaQuinto;//variaveis criadas

        double[][]tempMedia = { //aqui estamos criando uma matriz de números, funcionando como linhase colunas
            {32.5, 22.1},  //Cidade 1
            {28.3, 18.7},  //Cidade 2
            {35.8, 24.9},  //Cidade 3
            {30.2, 20.5},  //Cidade 4
            {25.7, 15.3}   //Cidade 5
        };
        int[][]medUmid = { //aqui criamos uma mtriz de números inteiros
            {85, 60, 75},  //Cidade 1
            {78, 55, 70},  //Cidade 2
            {90, 65, 80},  //Cidade 3
            {82, 58, 72},  //Cidade 4
            {75, 50, 68}   //Cidade 5
        };
    
        temperaturaUm = calTemperatura(tempMedia[0][0],tempMedia[0][1]); // tempMedia, é array bidimensional, está pegando o primeiro valor da primeira linha e o segundo valor da primeira linha.
        umidUM = calUmidade(medUmid[0][0], medUmid[0][1], medUmid[0][2]);//
        climaUm = classificarClima(temperaturaUm, (int) umidUM);

        temperaturaDois = calTemperatura(tempMedia[1][0],tempMedia[1][1]);
        umidDois = calUmidade(medUmid[1][0], medUmid[1][1], medUmid[1][2]);
        climaDois = classificarClima(temperaturaDois, (int) umidDois);

        temperaturaTres = calTemperatura(tempMedia[2][0],tempMedia[2][1]);
        umidTres = calUmidade(medUmid[2][0], medUmid[2][1], medUmid[2][2]);
        climaTres = classificarClima(temperaturaTres, (int)umidTres);

        temperaturaQuatro = calTemperatura(tempMedia[3][0],tempMedia[3][1]);
        umidQuatro = calUmidade(medUmid[3][0], medUmid[3][1], medUmid[3][2]);
        climaQuatro = classificarClima(temperaturaQuatro, (int)umidQuatro);

        temperaturaQuinta = calTemperatura(tempMedia[4][0],tempMedia[4][1]);
        umidQuinta = calUmidade(medUmid[4][0], medUmid[4][1], medUmid[4][2]);
        climaQuinto = classificarClima(temperaturaQuinta, (int)umidQuinta);
    
        temperaturaMeTotal = (temperaturaUm + temperaturaDois + temperaturaTres + temperaturaQuatro + temperaturaQuinta) / 5;
        
    
        double[] temperaturass = {
            temperaturaUm,
            temperaturaDois,
            temperaturaTres,
            temperaturaQuatro,
            temperaturaQuinta
        };
            tempMaisQuente = temperaturass[0];

                for(int i = 1; i < temperaturass.length; i++){
                if(temperaturass[i] > tempMaisQuente){
                tempMaisQuente = temperaturass[i];
            }
        }

            tempMaisFria = temperaturass[0];

            for (int i = 1; i < temperaturass.length; i++) {
            if (temperaturass[i] < tempMaisFria) {
                tempMaisFria = temperaturass[i];
            }
        }



    System.out.printf("\n=========================================================================");
    System.out.printf("\n           SISTEMA DE ANÁLISE METEOROLÓGICA INTELIGENTE");
    System.out.printf("\n=========================================================================");
    
    System.out.printf("\nANÁLISE DETALHADA POR CIDADE:");
    System.out.printf("\n-------------------------------------------------------------------------|");
    System.out.printf("\nCIDADE | T.MAX | T.MIN | T.MÉD | UMID | CLASSIFICAÇÃO     | ALERTA");
    System.out.printf("\n-------------------------------------------------------------------------|");
    System.out.printf("\n1   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | %s    | AMARELO ", tempMedia[0][0],tempMedia[0][1], temperaturaUm, umidUM, climaUm);
    System.out.printf("\n2   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | %s    | VERDE   ", tempMedia[1][0],tempMedia[1][1], temperaturaDois, umidDois, climaDois);
    System.out.printf("\n3   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | %s    | VERMELHO", tempMedia[2][0],tempMedia[2][1], temperaturaTres, umidTres, climaTres );
    System.out.printf("\n4   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | %s    | VERDE   ", tempMedia[3][0],tempMedia[3][1], temperaturaQuatro, umidQuatro, climaQuatro );
    System.out.printf("\n5   | %.2f°C| %.2f°C | %.2f°C|  %.2f°C | %s    | VERDE   ", tempMedia[4][0],tempMedia[4][1], temperaturaQuinta, umidQuinta, climaQuinto );
    System.out.printf("\n-------------------------------------------------------------------------|");
    System.out.println(" ");
    System.out.printf("\nESTATÍSTICAS GERAIS:");
    System.out.printf("\nTemperatura média geral: %.2f°C ", temperaturaMeTotal); //%.2f = 
    System.out.printf("\nCidade mais quente: %.2f°C", tempMaisQuente);
    System.out.printf("\nCidade mais fria: %.2f°C", tempMaisFria);
    }
}

    