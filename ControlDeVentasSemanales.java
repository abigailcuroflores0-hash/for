import java.util.Scanner;

public class ControlDeVentasSemanales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double venta, total = 0, promedio, mayor = 0;
        int diaMayor = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese la venta del dia " + i + ": ");
            venta = leer.nextDouble();

            total = total + venta;

            if (i == 1 || venta > mayor) {
                mayor = venta;
                diaMayor = i;
            }
        }

        promedio = total / 7;

        System.out.println("Venta total: S/ " + total);
        System.out.println("Promedio: S/ " + promedio);
        System.out.println("Mayor venta: Dia " + diaMayor);
    }
}