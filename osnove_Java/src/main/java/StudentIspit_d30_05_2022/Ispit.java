package StudentIspit_d30_05_2022;

public class Ispit {
//    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)

    private String predmet;
    private int ocena;
    private String punoImeProfesor;

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getPunoImeProfesor() {
        return punoImeProfesor;
    }

    public void setPunoImeProfesor(String punoImeProfesor) {
        this.punoImeProfesor = punoImeProfesor;
    }

    public Ispit(String predmet, int ocena, String punoImeProfesor) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.punoImeProfesor = punoImeProfesor;
    }
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)

    public boolean ispitJePolozen () {
        if (this.ocena > 5) {
            return  true;
        }
        return false;
    }

    public void stampaIspit () {
        System.out.println(this.predmet + " - " + this.punoImeProfesor + " - " + this.ocena);
    }
}
