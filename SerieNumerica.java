import java.util.Scanner;

public class SerieNumerica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n, suma = 0;

        System.out.print("Ingrese N: ");
        n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            suma = suma + i;
        }

        System.out.println();
        System.out.println("Cantidad: " + n);
        System.out.println("Suma: " + suma);
    }
}