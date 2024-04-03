import java.util.Scanner;

public class
Zad13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczbaCiasteczekWPudelku = 40;
        int liczbaPorcjiWPudelku = 10;
        int kalorieNaPorcje = 300;

        System.out.println("Podaj liczbę zjedzonych ciasteczek:");
        int zjedzoneCiasteczka = scanner.nextInt();

        double zjedzoneKalorie = (double) zjedzoneCiasteczka / liczbaCiasteczekWPudelku * (liczbaPorcjiWPudelku * kalorieNaPorcje);

        System.out.println("Liczba zjedzonych kalorii: " + zjedzoneKalorie);

        scanner.close();
    }
}
