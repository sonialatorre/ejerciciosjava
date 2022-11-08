import java.util.Scanner;

public class añonacimiento {

        public static void main(String[] arg){

            Scanner scanner = new Scanner(System.in);
            int añoactual = 2022;
            int edad, año;
            System.out.println("ingrese su año de nacimiento");
            año = scanner.nextInt();
            edad = añoactual - año;
            System.out.println("su edad es " + edad);
        }
    }

