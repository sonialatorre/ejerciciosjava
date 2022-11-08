import java.util.Scanner;

//Se requiere determinar el costo que tendrá realizar una llamada telefónica
// con base en el tiempo que dura la llamada y en el costo por minuto
public class llamada {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int minuto=150;
        int tiempo,costo;
        System.out.println("ingrese el tiempo en minutos que duró la llamada");
        tiempo= scanner.nextInt();
        costo=minuto*tiempo;
        System.out.println("el costo de su llamada es de "+ costo);



    }

}
