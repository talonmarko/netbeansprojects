
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        // Kirjoita tulostuskoodi tänne
        for (int luvut : taulukko) {
            for (int i = 0; i < luvut; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
