package HistoryPage_d26_05_2022;

import java.util.ArrayList;

public class History {

//    Klasu History koja ima:
//    niz stranica koje su posecene
//    metoda otvori stranicu koja dodaje novi historypage u niz.
//    metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//    metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//    metoda obrisi istoriju - metoda brise celu istoriju
//    metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//    metoda pogledajIstoriju - stampa sve posecene stranice
//    metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//    metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena.
//    Metoda kao parametar prima trenutno vreme (sat i minut)

    private ArrayList <HistoryPage> nizStranica = new ArrayList<>();

    public void otvoriStranicu (HistoryPage historyPage) {
        this.nizStranica.add(historyPage);
    }

    public void obrisiPremaLinku (String linkDoStranice) {
        for (int i = 0; i < this.nizStranica.size(); i++) {
            if (linkDoStranice.equals(this.nizStranica.get(i).getLinkDoStranice())) {
                this.nizStranica.remove(i);
            }
        }
    }

    public void obrisiKolaciceZaLink (HistoryPage historyPage) {
        for (int i = 0; i < this.nizStranica.size(); i++) {
            if (this.nizStranica.get(i).getLinkDoStranice().equals(historyPage.getLinkDoStranice())) {
                this.nizStranica.get(i).obrisiKolacice();
            }
        }
    }

    public void obrisiCeluIstoriju () {
//        for (int i = 0; i < this.nizStranica.size(); i++) {
//            this.nizStranica.remove(i);
//        }
        this.nizStranica.clear();
    }

//    metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//    metoda pogledajIstoriju - stampa sve posecene stranice
//    metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//    metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih sat vremena.
//    Metoda kao parametar prima trenutno vreme (sat i minut)

    public void sacuvajKredencija (String nazaivStranice, String usernamePassword) {
        for (int i = 0; i < this.nizStranica.size(); i++) {
            if (nazaivStranice.equals(this.nizStranica.get(i).getNazivStranice())) {
                this.nizStranica.get(i).sacuvajKolacice(usernamePassword);
            }
        }
    }

    public void pogledajIstoriju () {
        for (int i = 0; i < this.nizStranica.size(); i++) {
           this.nizStranica.get(i).stampaHistoryPage();
        }
    }

    public void obrisiSveKolacice () {
        for (int i = 0; i < this.nizStranica.size(); i++) {
                this.nizStranica.get(i).obrisiKolacice();
        }
    }

    public void obrisiSveKolaciceZaSadnjihSatVremena (int trenutniSat, int trenutniMinut) {
        for (int i = 0; i < this.nizStranica.size(); i++) {
            if( (this.nizStranica.get(i).getVremeOtvaranjaSat() >= (trenutniSat -1))) {
                this.nizStranica.get(i).obrisiKolacice();

            }
        }
    }
}
