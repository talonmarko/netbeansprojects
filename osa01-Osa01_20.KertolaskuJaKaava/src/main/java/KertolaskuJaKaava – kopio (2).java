
import java.util.Scanner;

public class KertolaskuJaKaava {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int ekaluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int tokaluku = Integer.valueOf(lukija.nextLine());
        int summa = ekaluku * tokaluku;
        System.out.println(ekaluku + " * " + tokaluku + " = " + summa);
    }
}
