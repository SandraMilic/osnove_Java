package d26_05_2022;

public class Sastojak {

//    Kreirati klasu Sastojak koja ima:
//    naziv
//    cenu
//    gettere i settere
//            konstruktore
//    metodu za stampanje koja stampa  podatke u formatu:
//    naziv - cena.din

    private String naziv;
    private int cena;

    public Sastojak() {
    }
    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }


    public void stampa() {
        System.out.println(this.naziv + this.cena);
    }
}
