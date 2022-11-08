import java.util.Scanner;

import static java.lang.System.out;

public class ej3 {
    //determinar el costo que tendra el boleto de un viaje sencillo basado en los km por recorrer y el costo por km
        public static void main(String[] arg) {
            Scanner scanner = new Scanner(System.in);
            int viaje;
            int costokm=5300;
            out.println("ingrese los km a recorrer en su viaje");
            int km = scanner.nextInt();
            viaje=km*costokm;
            out.println("el costo de su boleto es de " + viaje);

        }
    }


