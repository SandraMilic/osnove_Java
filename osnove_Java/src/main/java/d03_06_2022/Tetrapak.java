package d03_06_2022;

import javax.sound.midi.Soundbank;

public class Tetrapak extends  Ambalaza {
//
//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
//    metoda stampaj stampa sve podatke iz klase tetrapak.

    private boolean recikliraSe;
    private int osnovnaCena;

    public Tetrapak(String barKod, String nazivArtikla, int netoTezina, int brutoTezina, boolean recikliraSe, int osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.recikliraSe = recikliraSe;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isRecikliraSe() {
        return recikliraSe;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    @Override
    public double racunajCenaArtikla() {
        return isRecikliraSe() ? this.tezinaAmbalaze() *1.5 + this.osnovnaCena : this.osnovnaCena;
    }

    @Override
    public void stampa() {
        System.out.println("TETRAPAK: ");
        System.out.println("BarKod: " + this.barKod + ", Naziv artikla: " + this.nazivArtikla);
        System.out.println("Neto tezina: " + this.netoTezina + ", Bruto tezina: " + this.brutoTezina);
        System.out.println("Cena artikla: " + this.racunajCenaArtikla());


    }
}
