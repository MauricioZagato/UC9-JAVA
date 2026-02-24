public class exercicio30 {
    public static void imprimirTempoFormatado(int HH, int MM, int SS){

        System.out.printf("%02d:%02d:%02d%n" , HH, MM, SS);
    }
    public static void main(String[] args) {
        imprimirTempoFormatado(14, 30, 30);
    }
}
