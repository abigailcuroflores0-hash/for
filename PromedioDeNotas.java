import java.util.Scanner;

public class PromedioDeNotas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double nota, suma = 0, promedio;
        double mayor = 0, menor = 20;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            nota = leer.nextDouble();

            suma = suma + nota;

            if (i == 1) {
                mayor = nota;
                menor = nota;
            }

            if (nota > mayor) {
                mayor = nota;
            }

            if (nota < menor) {
                menor = nota;
            }
        }

        promedio = suma / 10;

        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor nota: " + mayor);
        System.out.println("Menor nota: " + menor);
    }
}