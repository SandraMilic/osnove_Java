package d24_05_2022;

public class ZeleniKarton {

//    Zadatak
//    Kreirati klasu ZeleniKarton koja ima:
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//            konstruktore
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
//
//    U glavnoj klasi:
//    kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//            (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//            (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

    private String punoIme;
    private String brIndeks;
    private String predmet;
    private String punoImeProfesor;
    private int ocena;



    public ZeleniKarton(String predmet, String punoImeProfesor, int ocena) {
        this.punoIme = "Sandra Milic";
        this.brIndeks = "69-PS";
        this.predmet = predmet;
        this.punoImeProfesor = punoImeProfesor;
        this.ocena = ocena;
    }


    public ZeleniKarton(String punoIme, String brIndeks, String predmet, String punoImeProfesor, int ocena) {
        this.punoIme = punoIme;
        this.brIndeks = brIndeks;
        this.predmet = predmet;
        this.punoImeProfesor = punoImeProfesor;
        this.ocena = ocena;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public String getBrIndeks() {
        return brIndeks;
    }

    public String getPredmet() {
        return predmet;
    }

    public String getPunoImeProfesor() {
        return punoImeProfesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public void setBrIndeks(String brIndeks) {
        this.brIndeks = brIndeks;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public void setPunoImeProfesor(String punoImeProfesor) {
        this.punoImeProfesor = punoImeProfesor;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean ispitJePolozen () {
        return ocena > 5;
    }
    public void stampa () {
        System.out.println(this.predmet + " - " + this.ocena);
        System.out.println("Student: " + this.punoIme + ", " + this.brIndeks);
        System.out.println("Profesor: " + this.punoImeProfesor);
    }
}
