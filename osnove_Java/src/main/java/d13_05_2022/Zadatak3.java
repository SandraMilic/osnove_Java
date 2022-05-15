package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
//    Napisati program koji ima niz brojeva duzine 10. Niz je fiksnih vrednosti (ne unosi ih korisnik)
//    a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza. Pre i nakon izbacivanja
//    ispisati niz na ekranu. Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.

//    Commitujte zadatak i pushujte na github sa porukom Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
//
//    Primer izvrsenja 1:
//    Niz je: 1,3,5,6,7,1,3,4,2,9
//    Unesite poziciju za izbacivanje: 5
//    Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9
//
//    Primer izvrsenja 2:
//    Niz je: 1,3,5,6,7,1,3,4,2,9
//    Unesite poziciju za izbacivanje: 11
//    Uneli ste nevalidnu poziciju!

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<>();

        niz.add(1);
        niz.add(3);
        niz.add(5);
        niz.add(7);
        niz.add(9);
        niz.add(2);
        niz.add(4);
        niz.add(6);
        niz.add(8);
        niz.add(0);

        System.out.print("Niz: ");
        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
        }
        System.out.println();

        System.out.print("Unesite poziciju za izbacivanje (0 - 9): ");
        int pozicija = s.nextInt();

        if (pozicija < niz.size()) {
            niz.remove(pozicija);
            System.out.print("Niz nakon brisanja je ");
            for (int i = 0; i < niz.size(); i++) {
                System.out.print(niz.get(i) + ", ");
            }
        }
        else {
            System.out.println("Uneli ste nevalidnu poziciju! ");
        }
    }
}

