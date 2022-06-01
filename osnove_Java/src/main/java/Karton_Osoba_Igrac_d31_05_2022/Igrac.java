package Karton_Osoba_Igrac_d31_05_2022;

import java.util.ArrayList;

public class Igrac extends Osoba {
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    niz kartona
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju

    private  int brojDresa;
    private String pozicijaUIgri;
    private ArrayList <Karton> nizKartona = new ArrayList<>();
    private boolean kapiten;

    public Igrac(String punoIme, String jmbg, int godinaRodjenja, int brojDresa, String pozicijaUIgri, boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.brojDresa = brojDresa;
        this.pozicijaUIgri = pozicijaUIgri;
        this.kapiten = kapiten;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String getPozicijaUIgri() {
        return pozicijaUIgri;
    }

    public void setPozicijaUIgri(String pozicijaUIgri) {
        this.pozicijaUIgri = pozicijaUIgri;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

//    metodu dodaj karton, gde se dodaje karton u niz
//    metodu koja vraca broj zutih kartona
//    metodu koja vraca broj crvenih kartona
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    public void dodajKarton (Karton karton) {
        this.nizKartona.add(karton);
    }

    public int brojZutihKartona () {
        int brojacZuti = 0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getKarton().equals("zuti")) {
                brojacZuti ++;
            }
        }
        return brojacZuti;
    }

    public int brojCrvenihKartona () {
        int brojacCrveni = 0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getKarton().equals("crveni")) {
                brojacCrveni ++;
            }
        }
        return brojacCrveni;
    }

    @Override
    public void stampa () {
        super.stampa();
        System.out.println(", Broj dresa: " + this.brojDresa + ", Pozicija: " + this.pozicijaUIgri);
        if (kapiten) {
            System.out.println("Igrac je kapiten.");
        }
        else {
            System.out.println("Igrac nije kapiten.");
        }
        System.out.println("Ukupno zutih kartona: " + this.brojZutihKartona());
        System.out.println("Ukupno crvenih kartona: " + this.brojCrvenihKartona());
    }
}
