package StudentIspit_d30_05_2022;

import java.util.ArrayList;

public class Student {
//    Napisati klasu Student koja ima
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)

    private String brojIndexa;
    private String punoImeStudent;
    private String tipStudija;
    private ArrayList <Ispit> nizIspita = new ArrayList<Ispit>();

    public Student(String brojIndexa, String punoImeStudent, String tipStudija) {
        this.brojIndexa = brojIndexa;
        this.punoImeStudent = punoImeStudent;
        this.tipStudija = tipStudija;
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public String getPunoImeStudent() {
        return punoImeStudent;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public void setPunoImeStudent(String punoImeStudent) {
        this.punoImeStudent = punoImeStudent;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public ArrayList<Ispit> getNizIspita() {
        return nizIspita;
    }

//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)

    public void dadajIspit (Ispit ispit) {
        this.nizIspita.add(ispit);
    }

    public double prosekNaStudijama () {
        double suma = 0;
        int brojac = 0;
        for (int i = 0; i < this.nizIspita.size(); i++) {
            if(this.nizIspita.get(i).ispitJePolozen()) {
                suma = suma + this.nizIspita.get(i).getOcena();
                brojac ++;
            }
        }
        return suma/brojac;
    }
    public void stampaStudent () {
        System.out.println(this.brojIndexa + " - " + this.punoImeStudent + " - " + this.tipStudija);
        for (int i = 0; i < this.nizIspita.size(); i++) {
            this.nizIspita.get(i).stampaIspit();
        }
        System.out.println("Prosecna ocena na studijama: " + this.prosekNaStudijama());

    }
}
