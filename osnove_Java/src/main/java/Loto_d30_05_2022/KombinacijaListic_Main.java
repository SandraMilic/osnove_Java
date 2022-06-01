package Loto_d30_05_2022;

public class KombinacijaListic_Main {
    public static void main(String[] args) {
        Kombinacija k1 = new Kombinacija("id 343-17", 13,5,4,7,8,12,22);
        Kombinacija k2 = new Kombinacija("id 343-17", 32,5,4,7,8,12,22);
        Kombinacija k3 = new Kombinacija("id 343-17", 3,5,21,7,8,12,22);
        Kombinacija k4 = new Kombinacija("id 343-17", 23,5,4,17,8,12,22);
        Kombinacija k5 = new Kombinacija("id 343-17", 1,5,4,7,18,12,22);
        Kombinacija k6 = new Kombinacija("id 343-17", 33,5,4,7,8,12,22);
        Kombinacija k = new Kombinacija ("id 777-77", 13,5,4,7,8,12,22);

       if (k1.daLiJeIstaKombinacija(k4)) {
           System.out.println("Kombinacija je ista");
       }
        else {
            System.out.println("Kombinacija nije ista");
        }
        k1.stampaKombinacija();

        Listic listic1 = new Listic();
        listic1.dodajKombinaciju(k1);
        listic1.dodajKombinaciju(k2);
        listic1.dodajKombinaciju(k3);
        listic1.dodajKombinaciju(k4);
        listic1.dodajKombinaciju(k5);
        listic1.dodajKombinaciju(k6);

        if (listic1.dobitna(k)) {
            System.out.println("Listic je dobitan!");
        }
        else {
            System.out.println("Vise srece drugi put :(");
        }
        listic1.stampaListic();
    }
}
