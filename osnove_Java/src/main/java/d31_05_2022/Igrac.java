package d31_05_2022;

public class Igrac extends Osoba {
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    private  int brojDresa;
    public String pozicijaUIgri;
    public boolean kapiten;

    public Igrac() {
    }

    public Igrac(String punoIme, String jmbg, int godRodjenja, int brojDresa, String pozicijaUIgri, boolean kapiten) {
        super(punoIme, jmbg, godRodjenja);
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

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Broj dresa: " + this.brojDresa + ", Pozicija: " + this.pozicijaUIgri);
        if (kapiten) {
            System.out.println("Igrac je kapiten.");
        }
        else {
            System.out.println("Igrac nije kapiten.");
        }
        System.out.println();
    }
}
