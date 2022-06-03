package d02_06_2022;

public class Radnnik_Main {
    public static void main(String[] args) {

//  U glavnom programu kreirati jednog magacionera i jednog menadzera,
//  postaviti sektore u kojima rade i ispisati platu za svakog

        Sektor sektror = new Sektor("IT", 100000);
        Sektor sektror1 = new Sektor("proizvodnja", 50000);
        Sektor sektror2 = new Sektor("administracija", 30000);
        Sektor sektror3 = new Sektor("logistika", 20000);
        Sektor sektror4 = new Sektor("HR", 10000);

        Menadzer sef = new Menadzer("Sandra Milic");
        sef.zaposliUSektor(sektror);
        sef.zaposliUSektor(sektror2);
        sef.zaposliUSektor(sektror3);

        Magacioner magacioner = new Magacioner("Milos Zivic");
        magacioner.zaposliUSektor(sektror1);
        magacioner.zaposliUSektor(sektror3);


        System.out.println("Plata menadzera: " + sef.plata() + "rsd");
        System.out.println("Plata magacionera: " + magacioner.plata() + "rsd");
    }
}
