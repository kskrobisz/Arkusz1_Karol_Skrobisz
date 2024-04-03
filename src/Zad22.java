public class Zad22 {
    public static void main(String[] args) {
        int liczbaAkcjiKupionych = 1000;
        double cenaAkcjiKupionych = 32.87;
        double prowizjaKupna = 0.02;

        int liczbaAkcjiSprzedanych = 1000;
        double cenaAkcjiSprzedanych = 33.92;
        double prowizjaSprzedazy = 0.02;

        double kwotaZakupu = liczbaAkcjiKupionych * cenaAkcjiKupionych;
        double prowizjaZakupu = kwotaZakupu * prowizjaKupna;
        double kwotaSprzedazy = liczbaAkcjiSprzedanych * cenaAkcjiSprzedanych;
        double prowizjaSprzedazyObliczona = kwotaSprzedazy * prowizjaSprzedazy;
        double zyskPrzedProwizja = kwotaSprzedazy - kwotaZakupu;
        double zyskPoProwizji = zyskPrzedProwizja - prowizjaZakupu - prowizjaSprzedazyObliczona;

        System.out.println("Kwota zapłacona za akcje: " + kwotaZakupu);
        System.out.println("Wartość prowizji zapłacona przy zakupie: " + prowizjaZakupu);
        System.out.println("Kwota otrzymana ze sprzedaży akcji: " + kwotaSprzedazy);
        System.out.println("Wartość prowizji zapłacona przy sprzedaży: " + prowizjaSprzedazyObliczona);
        System.out.println("Zysk ze sprzedaży akcji po zapłaceniu obu prowizji: " + zyskPoProwizji);
    }
}
