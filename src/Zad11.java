import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartość produktu:");
        double cenaProduktu = scanner.nextDouble();

        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;

        double podatekStanowyKwota = cenaProduktu * podatekStanowy;
        double podatekLokalnyKwota = cenaProduktu * podatekLokalny;

        double cenaCalkowita = cenaProduktu + podatekStanowyKwota + podatekLokalnyKwota;

        System.out.println("Wartość produktu: " + cenaProduktu);
        System.out.println("Podatek stanowy: " + podatekStanowyKwota);
        System.out.println("Podatek lokalny: " + podatekLokalnyKwota);
        System.out.println("Cena całkowita: " + cenaCalkowita);

        scanner.close();
    }
}
