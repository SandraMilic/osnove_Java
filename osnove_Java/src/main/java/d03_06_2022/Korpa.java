package d03_06_2022;

import java.util.ArrayList;

public class Korpa {
//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar
//    funkcije se prima Super karticu iz koje se cita popust.

    private ArrayList <Ambalaza> nizAmbalaza = new ArrayList<>();


    public void dodajAmbalazu (Ambalaza ambalaza) {
        this.nizAmbalaza.add(ambalaza);
    }

    public void izbaciAmbalazu (String barKod) {
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            if (this.nizAmbalaza.get(i).getBarKod().equals(barKod)) {
                this.nizAmbalaza.remove(i);
            }
        }
    }

    private double sumaSvihAmbalazaSaPopustom (int popust) {
        double suma = 0;
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            suma = suma + this.nizAmbalaza.get(i).racunajCenaArtikla();
        }
        return suma - popust;
    }

    public double cenaKorpe (SuperKartica superKartica) {
        return  this.sumaSvihAmbalazaSaPopustom(superKartica.getPopust());
    }

    public void stampaKorpa() {
        for (int i = 0; i < this.nizAmbalaza.size(); i++) {
            this.nizAmbalaza.get(i).stampa();
            System.out.println();
        }
    }
}
