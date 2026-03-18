package MiniBanco;
import java.util.Scanner;

public class MiniBanco {

    //constantes:

    static final double LIMITE_SAQUE = 1000.00;
    static final double TAXA_SAQUE = 0.02;

    static double calcularTotalSaque(double valor){
        return valor + (valor * TAXA_SAQUE);
    }

    static boolean dentroDoLimite(double valor){
        return valor <= LIMITE_SAQUE;
    }

    static boolean saldoSuficiente(double saldo, double valor){
        return saldo >= calcularTotalSaque(valor);
    }

    static double sacar(double saldo, double valor){
        return saldo - calcularTotalSaque(valor);
    }

    static void exibirMenu(){
        System.out.println("\n=== MiniBanco ===");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Ver Extrato");
        System.out.println("0 - Sair");
        System.out.println("Escolha: ");
    }
    
    static double depositar(double saldo, double valor){
        return saldo + valor;
    }

    static void exibirSaldo(double saldo){
        System.out.printf(" Saldo atual: R$ %.2f%n", saldo);
    }

    static boolean valorEhValido(double valor){
        return valor > 0;
    }

    static void exibirExtrato(String[] extrato, int totalLinhas){
        System.out.println("\n--Extrato---------------");
        if(totalLinhas == 0){
            System.out.println(" Nenhuma movimentação.");
        }else{
            for(int i = 0; i < totalLinhas; i++){
                System.out.println(" " + extrato[i]);
            }
        }
        System.out.println("----------------------");
    }

    static int registrar(String[] extrato, int totalLinhas, String linha){
        extrato[totalLinhas] = linha;
        return totalLinhas + 1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MiniBanco iniciado. ");

        String[] exrato = new String[50];
        int     totalLinhas = 0;

        //variaveis principais da contas
        double saldo  = 0.0;
        int    opcao  = -1;

        //Boas Vindas
        System.out.print("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.printf("Olá, %s! Saldo inicial: R$ %.2f%n", nome, saldo);

        while (opcao !=0){
        exibirMenu();

        opcao = scanner.nextInt();

        if(opcao == 1){
            System.out.print(" Valor a depositar: R$ ");
            double valor = scanner.nextDouble();

            if (!valorEhValido(valor)){
                System.out.println(" Atenção, valor inválido. Valor deve ser maior que zero.");
            } else {
                saldo = depositar(saldo, valor);
                System.out.println(" Depósito realizado! ");
                exibirSaldo(saldo);
                totalLinhas = registrar(exrato, totalLinhas, String.format("DEPÓSITO +R$ %.2f => Saldo R$ %.2f", valor, saldo));
            }

            //System.out.println(" [Depositar - em breve]");
        }else if(opcao ==2){
            System.out.printf(" Valor a sacar: R$ ");
            double valorSaque = scanner.nextDouble();

            if (!valorEhValido(valorSaque)){
                System.out.println("Atenção, valor inválido. ");
            }else if(!dentroDoLimite(valorSaque)){
                System.out.printf(" Limite exedido. Máximo: R$ %.2f%n", LIMITE_SAQUE);
            }else if(!saldoSuficiente(saldo, valorSaque)){
                System.out.printf(" Saldo Insulficiente. Necessário: R$ %.2f%n", calcularTotalSaque(valorSaque));
            }else{
                double taxa = valorSaque * TAXA_SAQUE;
                saldo = sacar(saldo, valorSaque);
                System.out.printf(" Saque realizado. Taxa cobrada: R$ %.2f%n", taxa);
                totalLinhas = registrar(exrato, totalLinhas, String.format("SAQUE -R$ %.2f => Saldo: R$ %.2f", valorSaque, saldo));
            }

        }else if(opcao ==3){
            exibirSaldo(saldo);

        }else if(opcao ==4){
            exibirExtrato(exrato, totalLinhas);
            //System.out.println(" [Extretato - em breve]");

        }else if(opcao == 0){
            exibirExtrato(exrato, totalLinhas);
            System.out.println("Até logo, " + nome + "!");
        }else{
            System.out.println(" Opção inválida");
        }
        }

        scanner.close();
    }
}
 