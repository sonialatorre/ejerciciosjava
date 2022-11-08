import java.util.Scanner;

public class ivadescuento {
    // determinar cuánto pagará finalmente una persona por un artículo equis,
    // considerando que tiene un descuento de 20%,
    // y debe pagar 15% de IVA (debe mostrar el precio con descuento y el precio final).

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int articulo;
        float descuento, valordescuento,iva, valortotal;

        System.out.println("ingrese el valor del artículo");
        articulo= scanner.nextInt();
        descuento=articulo*20/100;
        valordescuento=articulo-descuento;

        System.out.println("el precio con descuento es "+ valordescuento);

        iva=articulo *15/100;
        System.out.println("el valor total es de" + (iva+valordescuento));

    }
}
