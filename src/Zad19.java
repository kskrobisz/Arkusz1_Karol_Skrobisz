public class Zad19 {
    public static void main(String[] args) {
        int liczbaAnkietowanych = 12467;
        double kupujacyNapojeEnergetyczne = liczbaAnkietowanych * 0.14;
        double preferujacyCytrusowe = kupujacyNapojeEnergetyczne * 0.64;

        System.out.println("Liczba osób kupujących napoje energetyczne: " + kupujacyNapojeEnergetyczne);
        System.out.println("Liczba osób preferujących napoje cytrusowe: " + preferujacyCytrusowe);
    }
}
