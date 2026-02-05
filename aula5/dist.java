package aula5;

public class dist {
    
    // calcular a distancia entre dois pontos 

    // distancia dada por: dist = ((x2 - x1)^2 + (y2 - y1)^2)^1/2
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        double dist, distX, distY, dx, dy, resultado;

        x1 = 0;
        x2 = 4;
        y1 = 0;
        y2 = 4;

        dx = x2 - x1;
        dy = y2 - y1;

        distX = Math.pow(dx, 2.0);
        distY = Math.pow(dy, 2.0);
        
        System.out.println("Distância do eixo x é: " + distX);
        System.out.println("Distância do eixo y é: " + distY);

        resultado = Math.sqrt((distX + distY));
        System.out.println(resultado);



    }
}
