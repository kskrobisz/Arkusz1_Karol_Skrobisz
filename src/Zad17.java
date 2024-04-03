import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj cenę posiłku:");
        double cenaPosilku = scanner.nextDouble();

        double podatekStanowy = 0.0675;
        double napiwek = 0.20;

        double podatek = cenaPosilku * podatekStanowy;
        double kwotaNapiwku = (cenaPosilku + podatek) * napiwek;

        double calkowitaKwota = cenaPosilku + podatek + kwotaNapiwku;

        System.out.println("Cena posiłku: " + cenaPosilku);
        System.out.println("Wartość podatku: " + podatek);
        System.out.println("Wysokość napiwku: " + kwotaNapiwku);
        System.out.println("Łączna kwota do zapłaty: " + calkowitaKwota);

        scanner.close();
    }
}
