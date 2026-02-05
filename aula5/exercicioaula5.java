package aula5;

public class exercicioaula5 {
    //realizar o cálculo dentro de um metodo
    static void calculaDistancia(double x1, double y1, double x2, double y2, double dist, double distX, double distY, double dx, double dy, double resultado){

        x1 = 0;
        x2 = 4;
        y1 = 0;
        y2 = 4;

        dx = x2 - x1;
        dy = y2 - y1;

        distX = Math.pow(dx, 2.0);
        distY = Math.pow(dy, 2.0);

        
        resultado = Math.sqrt((distX + distY));
        System.out.println(resultado);
    }

    public static void main(String[] args) {

        calculaDistancia(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }


}

