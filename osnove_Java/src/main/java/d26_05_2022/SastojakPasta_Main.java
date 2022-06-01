package d26_05_2022;

import java.util.ArrayList;

public class SastojakPasta_Main {
    public static void main(String[] args) {

        Sastojak sastojak1 = new Sastojak("makarone", 100);
        Sastojak sastojak2 = new Sastojak("beli luk", 70);
        Sastojak sastojak3 = new Sastojak("pavlaka za kuvanje", 120);
        Sastojak sastojak4 = new Sastojak("jaja", 17);
        Sastojak sastojak5 = new Sastojak("piletina", 450);
        Sastojak sastojak6 = new Sastojak("slanina", 250);

        Pasta carbonara = new Pasta();
        carbonara.dodajSastojak(sastojak1);
        carbonara.dodajSastojak(sastojak2);

        carbonara.dodajSastojak(sastojak1);

        carbonara.stampaPasta();
    }
}
