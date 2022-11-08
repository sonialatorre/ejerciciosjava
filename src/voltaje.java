import java.util.Scanner;

public class voltaje {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int resistencia=4;
        System.out.println("ingrese la corriente en amperios ");
        int corriente= scanner.nextInt();
        int voltaje=corriente*resistencia;
        int potencia=voltaje*corriente;
        System.out.println("la potencia eléctrica del circuito en watts es de " + potencia);



    }

}
