package d03_06_2022;

public class SuperKartica {
    //    Kreirati klasu SuperKartica koja ima:
//    broj kartice
//    ime i prezime vlasnika
//    popust (200, 500, … )
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu stampaj koja stampa karticu u formatu:
//            (broj kartice), (ime i prezime)

    private int brojKartice;
    private String imeVlasnika;
    private int popust;

    public SuperKartica() {
    }

    public SuperKartica(int brojKartice, String imeVlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.imeVlasnika = imeVlasnika;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampaKartica () {
        System.out.println("Broj kartice: " + this.brojKartice + "Ime i prezime vlasnika: " + this.imeVlasnika);
    }
}
