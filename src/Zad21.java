import java.util.Scanner;

public class Zad21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kwotę początkową:");
        double kwotaPoczatkowa = scanner.nextDouble();

        System.out.println("Podaj roczną stopę oprocentowania:");
        double stopaOprocentowania = scanner.nextDouble() / 100;

        System.out.println("Podaj liczbę kapitalizacji w ciągu roku:");
        int liczbaKapitalizacji = scanner.nextInt();

        System.out.println("Podaj liczbę lat:");
        int liczbaLat = scanner.nextInt();

        double stanKonta = kwotaPoczatkowa * Math.pow((1 + stopaOprocentowania / liczbaKapitalizacji), liczbaKapitalizacji * liczbaLat);

        System.out.printf("Stan konta po %d latach: %.0f%n", liczbaLat, stanKonta);
        scanner.close();
    }
}
