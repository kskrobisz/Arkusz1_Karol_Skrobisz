import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wynik z pierwszego testu:");
        double wynikZTestu1 = scanner.nextDouble();

        System.out.println("Podaj wynik z drugiego testu:");
        double wynikZTestu2 = scanner.nextDouble();

        System.out.println("Podaj wynik z trzeciego testu:");
        double wynikZTestu3 = scanner.nextDouble();

        double srednia = (wynikZTestu1 + wynikZTestu2 + wynikZTestu3) / 3;

        System.out.println("Wynik z pierwszego testu: " + wynikZTestu1);
        System.out.println("Wynik z drugiego testu: " + wynikZTestu2);
        System.out.println("Wynik z trzeciego testu: " + wynikZTestu3);
        System.out.println("Średnia: " + srednia);

        scanner.close();
    }
}
