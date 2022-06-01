package Loto_d30_05_2022;

import java.util.ArrayList;

public class Kombinacija {
//    Kreirati klasu Kombinacija koja ima:
//    id kombinacije (String)
//    niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//    konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//    gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//    metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija.
//    Zaglavlje metode je:
//    public boolean daLiJeIstaKombinacija( Kombinacija k)
//    metoda vraca true ako su svi elementi na istim pozicija isti
//    npr: this [0] == k [0], this [1] == k [1] ….
//    metodu za stampu koja stampa podatke u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23

    private String idKKombinacije;
    private ArrayList <Integer> nizBrojeva;

    public Kombinacija(String idKKombinacije, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
        this.idKKombinacije = idKKombinacije;
        this.nizBrojeva = new ArrayList<>();
        this.nizBrojeva.add(jedan);
        this.nizBrojeva.add(dva);
        this.nizBrojeva.add(tri);
        this.nizBrojeva.add(cetiri);
        this.nizBrojeva.add(pet);
        this.nizBrojeva.add(sest);
        this.nizBrojeva.add(sedam);
    }

    public String getIdKKombinacije() {
        return idKKombinacije;
    }

    public ArrayList<Integer> getNizBrojeva() {
        return nizBrojeva;
    }


    public boolean daLiJeIstaKombinacija (Kombinacija kombinacija) {

        if (this.nizBrojeva.get(0) == kombinacija.nizBrojeva.get(0)
                    && this.nizBrojeva.get(1) == kombinacija.nizBrojeva.get(1)
                    && this.nizBrojeva.get(2) == kombinacija.nizBrojeva.get(2)
                    && this.nizBrojeva.get(3) == kombinacija.nizBrojeva.get(3)
                    && this.nizBrojeva.get(4) == kombinacija.nizBrojeva.get(4)
                    && this.nizBrojeva.get(5) == kombinacija.nizBrojeva.get(5)
                    && this.nizBrojeva.get(6) == kombinacija.nizBrojeva.get(6)) {
                return true;
            }
        return false;
    }

    public void stampaKombinacija () {
        System.out.println("ID: " + this.idKKombinacije);
        System.out.print("Brojevi:. ");
        for (int i = 0; i < this.nizBrojeva.size(); i++) {
            System.out.print(this.nizBrojeva.get(i));
            if (i < this.nizBrojeva.size()-1) {
            System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
