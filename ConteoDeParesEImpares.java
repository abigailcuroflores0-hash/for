import java.util.Scanner;

public class ConteoDeParesEImpares {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero, pares = 0, impares = 0, suma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = leer.nextInt();

            if (numero % 2 == 0) {
                pares++;
                suma = suma + numero;
            } else {
                impares++;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Suma de pares: " + suma);
    }
}