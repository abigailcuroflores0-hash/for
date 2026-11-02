import java.util.Scanner;

public class CalculoDeFactorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n;
        long factorial = 1;

        System.out.print("Ingrese un numero: ");
        n = leer.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println(n + "! = " + factorial);
    }
}
