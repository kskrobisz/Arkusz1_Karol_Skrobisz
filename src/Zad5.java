public class Zad5 {
    public static void main(String[] args) {
        int dlugoscPom1 = 3;
        int szerokoscPom1 = 4;
        int dlugoscPom2 = 3;
        int szerokoscPom2 = 4;
        int dlugoscPom3 = 2;
        int szerokoscPom3 = 3;
        int dlugoscPom4 = 2;
        int szerokoscPom4 = 2;

        int powierzchniaPom1 = dlugoscPom1 * szerokoscPom1;
        int powierzchniaPom2 = dlugoscPom2 * szerokoscPom2;
        int powierzchniaPom3 = dlugoscPom3 * szerokoscPom3;
        int powierzchniaPom4 = dlugoscPom4 * szerokoscPom4;

        int powierzchniaMieszkania = powierzchniaPom1 + powierzchniaPom2 + powierzchniaPom3 + powierzchniaPom4;

        System.out.println("Powierzchnia pomieszczenia 1: " + powierzchniaPom1 + " metrów kwadratowych");
        System.out.println("Powierzchnia pomieszczenia 2: " + powierzchniaPom2 + " metrów kwadratowych");
        System.out.println("Powierzchnia pomieszczenia 3: " + powierzchniaPom3 + " metrów kwadratowych");
        System.out.println("Powierzchnia pomieszczenia 4: " + powierzchniaPom4 + " metrów kwadratowych");
        System.out.println("Powierzchnia całkowita mieszkania: " + powierzchniaMieszkania + " metrów kwadratowych");
    }
}
