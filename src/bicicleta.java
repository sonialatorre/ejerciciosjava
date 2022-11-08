import java.util.Scanner;

//Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra en bicicleta,
// considerando que lleva una velocidad constante
public class bicicleta {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int km, tiempo;
        int velocidad = 20;

        System.out.println("ingrese la cantidad de km que recorrerá ");
        km = scanner.nextInt();
        tiempo = km / velocidad;
        System.out.println("el tiempo  que demorará en llegar es de  " + tiempo + " horas");
    }
}