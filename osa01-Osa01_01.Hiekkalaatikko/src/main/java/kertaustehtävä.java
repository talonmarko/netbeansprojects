import java.util.Scanner;

public class kertaustehtävä {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luku väliltä 10-50:");
        int luku = Integer.valueOf(lukija.nextLine());
        if (luku <10 || luku >50){
            System.out.println("Virheellinen luku!");
        }else { 
            if (luku % 2 == 0){
                System.out.println("Luku " + luku + " on parillinen.");
            }else {
                System.out.println("Luku on pariton!");
            }
            
            if (luku >40){
                System.out.println("Luku on melko suuri!");
            }else if (luku <=40 && luku >=20){
                System.out.println("Luku on ihan keskinkertainen!");
            }else{
                System.out.println("Luku on melko pieni!");
            }
            
            if (luku == 42){
                System.out.println("Luku on 42! Vau!");
            }
            int tulos = luku * 3;

            double jaannos = 1.0 * luku / 2;

            int summa = luku + luku;

            System.out.println(luku + " * " + 3 + " = " + tulos);
            System.out.println(luku + " / " + 2 + " = " + jaannos);
            System.out.println(luku + " + " + luku + " = " + summa);
        }    
    }
}
