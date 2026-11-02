import java.util.Scanner;

public class TablaDeMultiplicarPersonalizada {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n, suma = 0;

        System.out.print("Ingrese un numero: ");
        n = leer.nextInt();

        for (int i = 1; i <= 15; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            suma = suma + (n * i);
        }

        System.out.println("Suma total = " + suma);
    }
}