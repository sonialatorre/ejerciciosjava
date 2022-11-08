import java.util.Scanner;

//Se requiere determinar la hipotenusa de un triángulo rectángulo.
// Recuerde que por Pitágoras se tiene que: C2 = A2 + B2.
public class hipotenusa {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;
        System.out.println(" Ingrese el valor del cateto 1 de su triangulo rectángulo");
        cateto1 = scanner.nextDouble();
        System.out.println(" Ingrese el valor del cateto 2 de su triangulo rectángulo");
        cateto2 = scanner.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println(" el valor de la hipotenusa de su triángulo rectángulo es " + hipotenusa);
    }
}
