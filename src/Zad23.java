import java.util.Scanner;

public class Zad23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj długość rzędu w metrach:");
        double dlugoscRzedu = scanner.nextDouble();

        System.out.println("Podaj ilość miejsca zajmowanego przez okratowanie w metrach:");
        double miejsceOkratowanie = scanner.nextDouble();

        System.out.println("Podaj odległość między sadzonkami w metrach:");
        double odlegloscMiedzySadzonkami = scanner.nextDouble();

        double liczbaSadzonek = (dlugoscRzedu - 2 * miejsceOkratowanie) / odlegloscMiedzySadzonkami;

        System.out.println("Liczba sadzonek w rzędzie: " + liczbaSadzonek);

        scanner.close();
    }
}
