import java.util.Scanner;

//Una empresa desea determinar el monto de un cheque que debe proporcionar
// a uno de sus empleados que tendrá que ir por equis número de días a la ciudad de Monterrey;
// los gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros gastos.
// El monto debe estar desglosado para cada concepto.
// representen el algoritmo que determine el monto del cheque
public class viaticos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int otros=100;

        System.out.println("ingrese el numero de dias que estará en ciudad de Monterrey");
       int dias=scanner.nextInt();
        System.out.println("ingrese el costo total del hotel");
       int costohotel=scanner.nextInt();
        System.out.println("ingrese el costo total de la comida ");
        int costocomida= scanner.nextInt();
        float pagototal=costohotel+costocomida + (otros+dias);
        System.out.println("el total del cheque es de " + pagototal+ "diferenciado asi: ");
        System.out.println("por concepto de hotel "+ costohotel );
        System.out.println("por cocepto de comida "+ costocomida );
        System.out.println("por cocepto de otros gastos "+ otros );

    }
}
