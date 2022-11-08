import java.util.Scanner;

public class ahorrosueldo {
    //representen el algoritmo para determinar cuánto dinero ahorra una persona en un año si
    // considera que cada semana ahorra 15% de su sueldo
    // (considere cuatro semanas por mes y que no cambia el sueldo).

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sueldosemanal=800;
        int ahorro= sueldosemanal*15/100;
        int ahorrosemanal=ahorro*4;

        System.out.println("la cantidad de dinero ahorrado en el año es de " + ahorrosemanal*12);


    }
}
