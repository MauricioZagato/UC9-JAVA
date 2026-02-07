package atividadefilmes;

import java.nio.channels.Pipe.SourceChannel;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class maratona {

static void cabecalho(){
    System.out.printf("=============================================== \n");
    System.out.printf("\tGERENCIADOR DE MARATONA DE FILMES \n");
    System.out.printf("===============================================");
        
    }

    static void MaratonaFilmes() {
        Scanner in = new Scanner(System.in);
        String nome; 
        
        System.out.println("Qual o usuário de login? ");
        nome = in.nextLine(); //Resposta do úsuario
        
        System.out.println("Olá " + nome + " seja bem vindo. ");
        System.out.println("\n");

    }

        static void Genero(){
            Scanner in = new Scanner(System.in);
            System.out.println("==============================");
            System.out.println("Gêneros mais assistidos\n");
            System.out.println("1 - Ação");
            System.out.println("2 - Aventura ");
            System.out.println("3 - Terror");
            System.out.println("4 - Drama");
            System.out.println("Escolha o gênero do seu agrado e se divirta. ");
            System.out.println("==============================");

            int opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Ação.");
                    break;
                case 2:
                    System.out.println("Você escolheu Aventura.");
                    break;
                case 3:
                    System.out.println("Você escolheu Terror.");
                    break;
                case 4:
                    System.out.println("Você escolheu Drama.");
                    break;
                default:
                    System.out.println("Inválido, escolha de 1 a 4.");
             }             
        }
        public static void MediaFilme(){
             System.out.println("Duração média por filme de 2.5 horas");
          }

        public static void TempFilme (){
            Scanner in = new Scanner(System.in);
            double hora;
            int qnt;
            double duracao;
            
            System.out.println("Quantidade de filmes planejados para assistir? ");
            qnt = in.nextInt(); // Resposta do úsuario
            
            Double Temp = new Double(qnt);

            System.out.println("Quantas horas de filme deseja assistir? ");
            hora = in.nextDouble();
            
            duracao = (Temp * hora);
            
            System.out.println("Duração em torno de: " + duracao + "horas");

            if(duracao <= 4){
                System.out.println("Maratona Leve");
            }else{
                System.out.println("Maratona Moderada");
           
            }
          }
            
         public static void main(String[] args) {
        
            cabecalho();
            System.out.println("\n");
            MaratonaFilmes();
            System.out.println("\n");
            Genero();
            System.out.println("\n");
            MediaFilme();
            System.out.println("\n");
            TempFilme();
         }    
}