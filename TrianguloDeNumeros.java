import java.util.Scanner;

public class TrianguloDeNumeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;

        System.out.print("Ingrese N: ");
        n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}