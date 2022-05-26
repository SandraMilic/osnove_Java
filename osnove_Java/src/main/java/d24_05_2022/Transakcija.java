package d24_05_2022;

import java.sql.SQLOutput;

public class Transakcija {

//    Kreirati klasu Transakcija koja ima:
//    id transakcije
//    racun sa kog se prenose sredstva
//    racun na koji se prenose sredstva
//    gettere i settere
//    konstruktore

//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//    ako je prenos sredstava manji od 4500, provizija je fiksna 45
//    ako je prenos sredstava veci od 4500, provizija je 1%
//    S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja
//    visinu transakcije
//    Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.

//    metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi
//    vrednost koja se prebacuje.
//    Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//    (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava

//    metodu koja stampa podatke o transakciji u formatu:
//    id transkacije
//    Racun sa: Ime i prezime  -  broj racuna
//    Racun na: Ime i prezime  -  broj racuna

    private String idTransakcije;
    private Racun uplatilac;
    private Racun primalac;

    public Transakcija(String idTransakcije, Racun uplatilac, Racun primalac) {
        this.idTransakcije = idTransakcije;
        this.uplatilac = uplatilac;
        this.primalac = primalac;
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public Racun getUplatilac() {
        return uplatilac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public void setUplatilac(Racun uplatilac) {
        this.uplatilac = uplatilac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    private double provizija(double visinaTransakcije) {
        if (visinaTransakcije > 4500) {
            return visinaTransakcije * 0.01;
        }
        return 45;
    }

    public void izvrsiTransakciju(double visinaTransakcije) {
        if (this.uplatilac.getTrenutnoStanje() > (visinaTransakcije + this.provizija(visinaTransakcije))) {
            this.primalac.promeniStanjeNaRacunu(-visinaTransakcije);
            this.uplatilac.promeniStanjeNaRacunu(visinaTransakcije + this.provizija(visinaTransakcije));
        }

        else if (this.uplatilac.getTrenutnoStanje() < (visinaTransakcije + this.provizija(visinaTransakcije))) {
            double razlika = visinaTransakcije - this.uplatilac.getTrenutnoStanje();
            this.primalac.promeniStanjeNaRacunu( razlika - visinaTransakcije);
            this.uplatilac.promeniStanjeNaRacunu(visinaTransakcije + this.provizija(visinaTransakcije));
        }
    }

    public void stampaTransakcija () {
        System.out.println(this.idTransakcije);
        System.out.println("Racun sa: " + getUplatilac().getPunoIme() + " - " + getUplatilac().getBrRacuna());
        System.out.println("Racun na: " + getPrimalac().getPunoIme() + " - " + getPrimalac().getBrRacuna());
        System.out.println("Stanje na racunu uplatilac " + getUplatilac().getTrenutnoStanje());
        System.out.println("Stanje na racunu primalac " + getPrimalac().getTrenutnoStanje());
    }
}
