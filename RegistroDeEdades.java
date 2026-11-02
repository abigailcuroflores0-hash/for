import java.util.Scanner;

public class RegistroDeEdades {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int edad, mayor = 0, menor = 0;
        int adultos = 0, menores = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Ingrese la edad " + i + ": ");
            edad = leer.nextInt();

            if (i == 1) {
                mayor = edad;
                menor = edad;
            }

            if (edad > mayor) {
                mayor = edad;
            }

            if (edad < menor) {
                menor = edad;
            }

            if (edad >= 18) {
                adultos++;
            } else {
                menores++;
            }
        }

        System.out.println("Edad mayor: " + mayor);
        System.out.println("Edad menor: " + menor);
        System.out.println("Mayores de edad: " + adultos);
        System.out.println("Menores de edad: " + menores);
    }
}