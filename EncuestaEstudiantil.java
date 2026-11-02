import java.util.Scanner;

public class EncuestaEstudiantil {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int voto, excelente = 0, bueno = 0, regular = 0, malo = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.print("Ingrese voto (1-4): ");
            voto = leer.nextInt();

            switch (voto) {
                case 1: excelente++; break;
                case 2: bueno++; break;
                case 3: regular++; break;
                case 4: malo++; break;
                default: i--;
            }
        }

        System.out.println("Excelente: " + excelente);
        System.out.println("Bueno: " + bueno);
        System.out.println("Regular: " + regular);
        System.out.println("Malo: " + malo);

        int mayor = Math.max(Math.max(excelente, bueno),
                             Math.max(regular, malo));

        if (mayor == excelente)
            System.out.println("Mas votada: Excelente");
        else if (mayor == bueno)
            System.out.println("Mas votada: Bueno");
        else if (mayor == regular)
            System.out.println("Mas votada: Regular");
        else
            System.out.println("Mas votada: Malo");
    }
}
