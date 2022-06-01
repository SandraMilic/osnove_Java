package d26_05_2022;

import java.util.ArrayList;

public class Pasta {
//    Kreirati klasu Pasta koja ima:
//    niz sastojaka
//    metodu za dodavanje sastojka
//    (ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//    defaultni konstruktor
//    metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//    metodu za stampu koja stampa podatke u formatu:
//    Pasta je sa sastojcima:
//    naziv - cena.din
//    naziv - cena.din
//    naziv - cena.din
//    Cena paste je cena.din


    private ArrayList <Sastojak> sastojciPasta = new ArrayList<>();

    public Pasta() {
    }

    public void dodajSastojak (Sastojak sastojak) {
        this.sastojciPasta.add(sastojak);
    }

    public void obrisiSastojak (Sastojak sastojak) {
        this.sastojciPasta.remove(sastojak);
    }

    public int cenaPaste () {
        int suma = 0;
        for (int i = 0; i < this.sastojciPasta.size(); i++) {
            suma = suma + this.sastojciPasta.get(i).getCena();
        }
        return suma;
    }

    public void stampaPasta () {
        System.out.println("Pasta je sa sastojcima: ");
        System.out.println();
        for (int i = 0; i < this.sastojciPasta.size(); i++) {
            System.out.println(this.sastojciPasta.get(i).getNaziv() + " - " + this.sastojciPasta.get(i).getCena() + "din");
            for (int j = 0; j < 1; j++) {
                System.out.println();
            }
        }
        System.out.println("Cena paste je " + this.cenaPaste() + "din");


    }

}
