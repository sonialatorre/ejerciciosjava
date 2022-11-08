import java.util.Scanner;

//determinar el promedio que obtendrá un alumno considerando que realiza tres exámenes,
// de los cuales el primero y el segundo tienen una ponderación de 25%, mientras que el tercero de 50%.
public class promedioalmuno {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingrese la nota que obtuvo en el primer examen");
        int examen1= scanner.nextInt();
        float parcial1=examen1*25/100;
        System.out.println("ingrese la nota que obtuvo en el segundo examen");
        int examen2= scanner.nextInt();
        float parcial2=examen2*25/100;
        System.out.println("ingrese la nota que obtuvo en el tercer examen");
        int examen3= scanner.nextInt();
        float parcial3=examen1*50/100;
        System.out.println("el promedio del estudiante es de " +(parcial1+parcial2+parcial3));
    }
}
