import java.util.Scanner;

public class pesosdolares {

        public static void main(String[] arg){

            Scanner valor = new Scanner(System.in);
            double dolar,peso;


            System.out.println("ingrese la cantidad de pesos (cop) que quiere adquirir en dolares");
            peso = valor.nextDouble();
            dolar=peso/5000;
            System.out.println("su cambio en dolares es " + dolar);
        }
}

