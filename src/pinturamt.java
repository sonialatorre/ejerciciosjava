import java.util.Scanner;

public class pinturamt {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int valormetro = 7500;
        int espacio, valortotal;
        System.out.println("ingrese la cantidad de metros cuadrados que desea cotizar");
        espacio = scanner.nextInt();
        valortotal = valormetro * espacio;
        System.out.println("el valor a pagar por el trabajo de pintura es de " + valortotal);
    }

}

