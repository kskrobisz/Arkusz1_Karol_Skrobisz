import java.util.Scanner;

public class
Zad12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę przejechanych kilometrów:");
        double przejechaneKilometry = scanner.nextDouble();

        System.out.println("Podaj liczbę zużytych litrów paliwa:");
        double zuzyteLitrPaliwa = scanner.nextDouble();

        double kilometryNaLitr = przejechaneKilometry / zuzyteLitrPaliwa;

        System.out.println("Liczba kilometrów na litr paliwa: " + kilometryNaLitr);

        scanner.close();
    }
}
