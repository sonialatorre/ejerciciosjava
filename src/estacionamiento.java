import java.util.Scanner;

public class estacionamiento {
        public static void main(String[] arg) {
            Scanner scanner = new Scanner(System.in);
            int vlrhora = 3000;
            int cobro, tiempo;
            System.out.println("ingrese el tiempo( EN HORAS) que estuvo en el estacionamiento");
            tiempo = scanner.nextInt();
            cobro = tiempo * vlrhora;
            System.out.println(" el valor a pagar es de " + cobro);

        }

    }

