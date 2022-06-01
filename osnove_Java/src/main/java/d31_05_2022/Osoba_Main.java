package d31_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Osoba_Main {
//    (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere.
//    Podatke za igrace i trenere unosi korisnik sa tastature.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Trener> timTrenera = new ArrayList<>();
        ArrayList<Igrac> timIgraca = new ArrayList<>();

        System.out.println("Unesite ukupan broj trenera u Vasem timu: ");
        int ukupnoTrenera = s.nextInt();

        for (int i = 0; i < ukupnoTrenera; i++) {
            System.out.println("Unesite Vase ime i prezime: ");
            String punoIme = s.next(); // t.setPunoIme(s.next());
            System.out.println("Unesite JMBG: ");
            String jmbg = s.next(); // t.setJmbg(s.next());
            System.out.println("Unesite godinu rodjenja: ");
            int godRodjenja = s.nextInt(); //   t.setGodRodjenja(s.nextInt());
            System.out.println("Unesite godine iskustva u radu: ");
            int godIskusva = s.nextInt(); //  t.setGodineIskustva(s.nextInt());
            System.out.println("Koji ste tip trenera: ");
            String tipTrenera = s.next(); // t.setTipTrenera(s.next());

            Trener trener = new Trener(punoIme, jmbg, godRodjenja, godIskusva, tipTrenera);
            timTrenera.add(trener);
        }

        System.out.println("Unesite ukupan broj igraca u Vasem timu: ");
        int ukupnoIgraca = s.nextInt();

        for (int i = 0; i < ukupnoIgraca; i++) {
            System.out.println("Unesite Vase ime i prezime: ");
            String punoIme = s.next();
            System.out.println("Unesite JMBG: ");
            String jmbg = s.next();
            System.out.println("Unesite godinu rodjenja: ");
            int godRodjenja = s.nextInt();
            System.out.println("Unesite broj dresa: ");
            int brojDresa = s.nextInt();
            System.out.println("Unesite Vasu poziciju u igri: ");
            String pozicijaUIgri = s.next();
            System.out.println("Da li ste kapiten?");
            boolean kapiten = s.nextBoolean();

            Igrac igrac = new Igrac(punoIme, jmbg, godRodjenja, brojDresa, pozicijaUIgri, kapiten);
            timIgraca.add(igrac);
        }

        System.out.println("Spisak trenera: ");
        for (int i = 0; i < timTrenera.size(); i++) {
            timTrenera.get(i).stampa();
        }

        System.out.println("Spisak igraca: ");
        for (int i = 0; i < timIgraca.size(); i++) {
            timIgraca.get(i).stampa();
        }
    }
}

//        Trener t1 = new Trener("Marko Markovic", "1404970737522",
//                1970, 30, "Kondicioni");
//        Trener t2 = new Trener("Srecko Sreckovic", "1404976737522",
//                1970, 20, "Pomocni");
//        t1.stampa();
//        t2.stampa();
//
//
//        Igrac i1 = new Igrac("Zivko Zivkovic", "0101000121222",
//                2000, 17, "Desni bek", true);
//        Igrac i2 = new Igrac("Zdravko Zdravkovic", "0710005121222",
//                2005, 21, "Napadac", false);
//        i1.stampa();
//        i2.stampa();

