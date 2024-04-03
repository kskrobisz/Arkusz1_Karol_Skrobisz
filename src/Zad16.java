import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę ulubionego miasta:");
        String nazwaMiasta = scanner.nextLine();

        System.out.println("Liczba znaków w nazwie miasta: " + nazwaMiasta.length());
        System.out.println("Nazwa miasta zapisana wielkimi literami: " + nazwaMiasta.toUpperCase());
        System.out.println("Nazwa miasta zapisana małymi literami: " + nazwaMiasta.toLowerCase());
        System.out.println("Pierwszy znak nazwy miasta: " + nazwaMiasta.charAt(0));

        scanner.close();
    }
}
