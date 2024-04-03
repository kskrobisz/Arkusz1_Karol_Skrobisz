public class Zad18 {
    public static void main(String[] args) {
        int liczbaAkcji = 600;
        double cenaZaAkcje = 21.77;
        double prowizja = 0.02;

        double cenaBezProwizji = liczbaAkcji * cenaZaAkcje;
        double kwotaProwizji = cenaBezProwizji * prowizja;
        double calkowitaKwota = cenaBezProwizji + kwotaProwizji;

        System.out.println("Kwota za same akcje (bez prowizji): " + cenaBezProwizji);
        System.out.println("Wysokość prowizji: " + kwotaProwizji);
        System.out.println("Łączna kwota: " + calkowitaKwota);
    }
}
