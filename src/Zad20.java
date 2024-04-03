import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double szklankiCukruNaCiastka = 1.5;
        double szklankaMaslaNaCiastka = 1;
        double szklankiMakiNaCiastka = 2.75;
        int iloscCiastek = 48;

        System.out.println("Podaj oczekiwaną liczbę ciastek:");
        int oczekiwanaIloscCiastek = scanner.nextInt();

        double szklankiCukru = (szklankiCukruNaCiastka * oczekiwanaIloscCiastek) / iloscCiastek;
        double szklankaMasla = (szklankaMaslaNaCiastka * oczekiwanaIloscCiastek) / iloscCiastek;
        double szklankiMaki = (szklankiMakiNaCiastka * oczekiwanaIloscCiastek) / iloscCiastek;

        System.out.println("Potrzebna ilość składników:");
        System.out.println("Cukier: " + szklankiCukru + " szklanki");
        System.out.println("Masło: " + szklankaMasla + " szklanki");
        System.out.println("Mąka: " + szklankiMaki + " szklanki");

        scanner.close();
    }
}
