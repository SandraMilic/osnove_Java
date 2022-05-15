package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatk1 {
//    Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
//    Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju
//    se racuna suma.
//    Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata
//    iznad, ispod, sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite
//    racuna da ne izadjete van opsega niza)
//    Za racunanje sume, nije potrebna petlja!
//
//    U projektu kreirati paket za ovaj domaci d13_05_2022 i u njemu klasu Zadatak1.java i
//    postavite tekst zadataka u komentaru a zatim commit-ujte promenu i push-ujte na github
//    sa porukom “Domaci 13.05.2022 Zadatak 1”

//  Primer izvrsenja:
//  2,4,6,7,4,
//  4,2,5,1,4,
//  1,4,9,4,5,
//  4,8,5,4,7,
//  4,4,7,4,1,
//  Unesite poziciju: 12
//  Suma je 27 (Objasnjenje: jer se sumira 9+5+4+4+5, pogledaj sliku)

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList <Integer> niz = new ArrayList<>();

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
        niz.add(1);
        niz.add(2);
        niz.add(3);
        niz.add(4);
        niz.add(5);
        niz.add(6);
        niz.add(7);
        niz.add(8);
        niz.add(9);
        niz.add(5);
        niz.add(4);
        niz.add(7);
        niz.add(8);
        niz.add(0);
        niz.add(1);

        int suma, unetaPozicija, pozicijaGore = 0, pozicijaDole = 0, pozicijaLevo = 0, pozicijaDesno = 0;

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + "  ");
            if (i % 5 == 4) {
                System.out.println();
            }
        }
        System.out.print("Unesite poziciju (0 - 24): ");
        unetaPozicija = s.nextInt();

        if (unetaPozicija - 5 >= 0) { // provera pozicije za opseg gornjeg reda
            pozicijaGore = niz.get(unetaPozicija -5);
        }
        if (unetaPozicija + 5 < 25) { // provera pozicije za opseg donjeg reda
            pozicijaDole = niz.get(unetaPozicija +5);
        }
        if (unetaPozicija % 5 != 0) { // provera da li je pozicija u prvoj koloni
            pozicijaLevo = niz.get(unetaPozicija -1);
        }
        if (unetaPozicija % 5 != 4) { // provera da li je pozicija u zadnjoj koloni
            pozicijaDesno = niz.get(unetaPozicija +1);
        }
        suma = niz.get(unetaPozicija) + pozicijaGore + pozicijaDole + pozicijaLevo + pozicijaDesno;

        System.out.println("Suma je " + suma);
    }
}


