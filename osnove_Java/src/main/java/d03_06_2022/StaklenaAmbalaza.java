package d03_06_2022;

public class StaklenaAmbalaza extends Ambalaza {

//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
//    metoda stampaj stampa sve podatke iz klase staklena flasa.

    private  int kaucija;
    private boolean placaKauciju;
    private int osnovnaCena;


    public StaklenaAmbalaza(String barKod, String nazivArtikla, int netoTezina, int brutoTezina, int kaucija, boolean placaKauciju, int osnovnaCena) {
        super(barKod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placaKauciju = placaKauciju;
        this.osnovnaCena = osnovnaCena;
    }

    public int getKaucija() {
        return kaucija;
    }

    public boolean isPlacaKauciju() {
        return placaKauciju;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    @Override
    public double racunajCenaArtikla() {
        return isPlacaKauciju() ? (this.osnovnaCena * 1.2) + this.kaucija : this.osnovnaCena * 1.2;
    }

    @Override
    public void stampa() {
        System.out.println("STAKLENA AMBALAZA: ");
        System.out.println("BarKod: " + this.barKod + ", Naziv artikla: " + this.nazivArtikla);
        System.out.println("Neto tezina: " + this.netoTezina + ", Bruto tezina: " + this.brutoTezina);
        System.out.println("Cena artikla: " + this.racunajCenaArtikla());
        ;
    }
}
