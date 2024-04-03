import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość pokoju nr 1:");
        int dlugoscPom1 = scanner.nextInt();
        System.out.println("Podaj szerokość pokoju nr 1:");
        int szerokoscPom1 = scanner.nextInt();

        System.out.println("Podaj długość pokoju nr 2:");
        int dlugoscPom2 = scanner.nextInt();
        System.out.println("Podaj szerokość pokoju nr 2:");
        int szerokoscPom2 = scanner.nextInt();

        System.out.println("Podaj długość pokoju nr 3:");
        int dlugoscPom3 = scanner.nextInt();
        System.out.println("Podaj szerokość pokoju nr 3:");
        int szerokoscPom3 = scanner.nextInt();

        System.out.println("Podaj długość pokoju nr 4:");
        int dlugoscPom4 = scanner.nextInt();
        System.out.println("Podaj szerokość pokoju nr 4:");
        int szerokoscPom4 = scanner.nextInt();

        int powierzchniaMieszkania = dlugoscPom1 * szerokoscPom1 + dlugoscPom2 * szerokoscPom2
                + dlugoscPom3 * szerokoscPom3 + dlugoscPom4 * szerokoscPom4;

        int liczbaOsob = 4;

        double powierzchniaNaOsobe = (double) powierzchniaMieszkania / liczbaOsob;

        System.out.println("Powierzchnia przypadająca na 1 osobę: " + powierzchniaNaOsobe + " metrów kwadratowych");

        scanner.close();
    }
}
