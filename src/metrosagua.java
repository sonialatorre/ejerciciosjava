import java.sql.SQLOutput;
import java.util.Scanner;

public class metrosagua {
    //La CONAGUA requiere determinar el pago que debe realizar una persona por el total de metros cúbicos que consume de agua. representen el algoritmo que permita determinar ese pago.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int valormt=35;
        int metros,pago;

        System.out.println("ingrese el total de metros cúbicos de agua que consumió ");
        metros= scanner.nextInt();
        pago=metros*valormt;
        System.out.println("el valor a pagar es de " + pago);


    }
}
