package HistoryPage_d26_05_2022;

import java.util.Objects;

public class HistoryPage {
//    Klasu HistoryPage koja ima:
//    naziv stranice
//    link do stranice
//    vreme otvaranja stranice - sat i minut (2 atributa)
//    username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
//    konstuktore koji su logicni
//    gettere i setter (username i password nemaju settere)
//    metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
//    Metoda obrisi kolacice koja setuje username i password na null.

    private String nazivStranice;
    private String datum;
    private String linkDoStranice;
    private int vremeOtvaranjaSat;
    private int vremeOtvaranjaMinut;
    private String usernamePassword;

    public HistoryPage(String nazivStranice, String datum, String linkDoStranice, int vremeSat, int vremeMinut) {
        this.nazivStranice = nazivStranice;
        this.datum = datum;
        this.linkDoStranice = linkDoStranice;
        this.vremeOtvaranjaSat = vremeSat;
        this.vremeOtvaranjaMinut = vremeMinut;
    }

    public String getNazivStranice() {
        return nazivStranice;
    }

    public String getLinkDoStranice() {
        return linkDoStranice;
    }

    public int getVremeOtvaranjaSat() {
        return vremeOtvaranjaSat;
    }

    public int getVremeOtvaranjaMinut() {
        return vremeOtvaranjaMinut;
    }

    public String getUsernamePassword() {
        return usernamePassword;
    }

    public void setNazivStranice(String nazivStranice) {
        this.nazivStranice = nazivStranice;
    }

    public void setLinkDoStranice(String linkDoStranice) {
        this.linkDoStranice = linkDoStranice;
    }

    public void setVremeOtvaranjaSat(int vremeSat) {
        this.vremeOtvaranjaSat = vremeSat;
    }

    public void setVremeMinut(int vremeMinut) {
        this.vremeOtvaranjaMinut = vremeMinut;
    }

    public void sacuvajKolacice (String usernamePassword) {
        this.usernamePassword = usernamePassword;
    }

    public void obrisiKolacice () {
        this.usernamePassword = null; // "null"
    }
//    Metoda stampaj koja stampa podatke u formatu:
//    [datum] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]

    public void stampaHistoryPage () {
        System.out.println(this.datum + " - " + this.vremeOtvaranjaSat + ":" + this.vremeOtvaranjaMinut);
        System.out.print(this.nazivStranice + "... ");

        if (Objects.equals(this.usernamePassword, null)) { // Ovo mi je ponudio program kao resenje. U suprotnom izbacuje error "null pointer"
//      if (this.usernamePassword.equals("null") -  Moze da se resi kad umesto null mehanizma stavim String "null"
            System.out.println(this.linkDoStranice);
        }
        else {
            System.out.println(this.linkDoStranice + "*");
        }
    }
}
