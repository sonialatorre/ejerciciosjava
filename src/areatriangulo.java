import java.util.Scanner;

public class areatriangulo {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int base, altura, area;
        System.out.println("ingrese la base del triangulo");
        base = scanner.nextInt();
        System.out.println("ingrese la altura del triangulo");
        altura = scanner.nextInt();
        area = base * altura / 2;
        System.out.println("el área del triángulo es " + area);
    }
}

