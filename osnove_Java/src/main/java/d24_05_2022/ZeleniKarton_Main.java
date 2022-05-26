package d24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKarton_Main {
    public static void main(String[] args) {
        ArrayList <ZeleniKarton> profilStudenta = new ArrayList<>();
        Scanner s = new Scanner(System.in);


        ZeleniKarton predmet1 = new ZeleniKarton("SandraMilic","PS-69", "Opsta I", "Predrag Ognjenovic", 9);
        ZeleniKarton predmet2 = new ZeleniKarton("Milan Manic","PS-69", "Opsta II", "Predrag Ognjenovic", 9);
        ZeleniKarton predmet3 = new ZeleniKarton("Marko Markovic","PS-69", "Socijalna I", "Dragan Popadic", 5);
        ZeleniKarton predmet4 = new ZeleniKarton("Janko Jankovic","PS-69", "Socijalna II", "Dragan Popadic", 6);
        ZeleniKarton predmet5 = new ZeleniKarton("Ana Anic","PS-69", "Razvojna", "Ksenija Krstic", 4);
        ZeleniKarton predmet6 = new ZeleniKarton("Mara Maric","PS-69", "Decija", "Slavica Opacic", 8);
        ZeleniKarton predmet7 = new ZeleniKarton("Jovan Jovic","PS-69", "Klinicka", "Velja Popovic", 7);
        ZeleniKarton predmet8 = new ZeleniKarton("Milos Mis","PS-69", "Marketing", "Dragana Kon", 9);
        ZeleniKarton predmet9 = new ZeleniKarton("Vlada Vladic","PS-69", "Skole i pravci", "Slavica Bojovic", 10);
        ZeleniKarton predmet10 = new ZeleniKarton("Jelena Jelic","PS-69", "Rad", "Milenko Hadic", 2);
        ZeleniKarton predmet11 = new ZeleniKarton("Mijat Milic","PS-69", "Inzenjerska", "Dragan Markovic", 5);

        profilStudenta.add(predmet1);
        profilStudenta.add(predmet2);
        profilStudenta.add(predmet3);
        profilStudenta.add(predmet4);
        profilStudenta.add(predmet5);
        profilStudenta.add(predmet6);
        profilStudenta.add(predmet7);
        profilStudenta.add(predmet8);
        profilStudenta.add(predmet9);
        profilStudenta.add(predmet10);
        profilStudenta.add(predmet11);

        for (int i = 0; i < profilStudenta.size(); i++) {
           profilStudenta.get(i).stampa();
            for (int j = 0; j < 1; j++) {
                System.out.println();
            }
        }
        double sumaSvihOcena = 0;

        for (int i = 0; i < profilStudenta.size(); i++) {
            sumaSvihOcena = sumaSvihOcena + profilStudenta.get(i).getOcena();
        }
        System.out.println("Prosecna ocena svih ispita je " + (sumaSvihOcena/profilStudenta.size()));

        double sumaProlaznihOcena = 0;
        int brojac = 0;

        for (int i = 0; i < profilStudenta.size(); i++) {
            if (profilStudenta.get(i).ispitJePolozen()) {
                sumaProlaznihOcena = sumaProlaznihOcena + profilStudenta.get(i).getOcena();
                brojac++;
            }
        }
        System.out.println("Prosecna ocena polozenih ispita je " + sumaProlaznihOcena/brojac);




//  Drugi nacin - sve preko For petlje:

//        System.out.println("Unesite broj predmeta koje ste do sada polagali: ");
//        int n = s.nextInt();
//        int sumaSvihOcena = 0;
//        int sumaProlaznihOcena = 0;
//        int brojac = 0;
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Unesite naziv predmeta: ");
//            String predmet = s.next();
//            System.out.println("Unesite ime profesora: ");
//            String profesor = s.next();
//            System.out.println("Unesite ocenu: ");
//            int ocena = s.nextInt();
//
//            ZeleniKarton x = new ZeleniKarton(predmet, profesor, ocena);
//            profilStudenta.add(x);
//            for (int j = 0; j < profilStudenta.size(); j++) {
//                if (x.ispitJePolozen()) {
//                    sumaProlaznihOcena = sumaProlaznihOcena + profilStudenta.get(i).getOcena();
//                    brojac ++;
//                }
//            }
//        }
//
//        for (int i = 0; i < profilStudenta.size(); i++) {
//           profilStudenta.get(i).stampa();
//        }

//        for (int i = 0; i < profilStudenta.size(); i++) {
//            sumaSvihOcena = sumaSvihOcena + profilStudenta.get(i).getOcena();
//        }
//        System.out.println("Prosecna ocena svih ispita je " + (sumaSvihOcena/profilStudenta.size()));
//
//        System.out.println("Prosecna ocena polozenih ispita je " + sumaProlaznihOcena/brojac);
    }
}
