import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String imie = scanner.nextLine();

        System.out.println("Podaj drugie imię:");
        String drugieImie = scanner.nextLine();

        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.nextLine();

        char pierwszaLiteraImienia = imie.charAt(0);
        char pierwszaLiteraDrugiegoImienia = drugieImie.charAt(0);
        char pierwszaLiteraNazwiska = nazwisko.charAt(0);

        System.out.println("Imię: " + imie);
        System.out.println("Drugie imię: " + drugieImie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Pierwsza litera imienia: " + pierwszaLiteraImienia);
        System.out.println("Pierwsza litera drugiego imienia: " + pierwszaLiteraDrugiegoImienia);
        System.out.println("Pierwsza litera nazwiska: " + pierwszaLiteraNazwiska);

        scanner.close();
    }
}
