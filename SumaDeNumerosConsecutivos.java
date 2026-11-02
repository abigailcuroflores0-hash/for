import java.util.Scanner;

public class SumaDeNumerosConsecutivos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n, suma = 0;

        System.out.print("Ingrese un numero: ");
        n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los numeros es: " + suma);
    }
}