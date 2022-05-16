package d16_05_2022;

public class Zadatak3 {
//  Napisati metodu koja stampa podatke o korisniku u formatu:
//  JMBG: [jmbg]
//  Ime: [ime]
//  Prezime: [prezime]
//  God. rodjenja: [god]
//  Aktivan: [true/false]
//  Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

    public static void main(String[] args) {

        podaciKorisnika("14041985737522", "Sandra", "Milic",1985, true);

    }

    static void podaciKorisnika (String jmbg, String ime, String prezime, int godRodjenja, boolean aktivnost) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godRodjenja);
        System.out.println("Aktivan: " + aktivnost);
    }
}
