public class Zad7 {
    public static void main(String[] args) {
        double udzialMazowiecki = 0.62;

        double sprzedazRoczna = 4600000;

        double sprzedazMazowiecki = udzialMazowiecki * sprzedazRoczna;

        System.out.println("Oszacowanie sprzedaży wygenerowanej przez region mazowiecki: " + sprzedazMazowiecki + " złotych");
    }
}
