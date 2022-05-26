package d23_05_2022;

import d23_05_2022.Autor;
import d23_05_2022.Knjiga;

public class Autor_Knjiga_Main {
    public static void main(String[] args) {

        Autor andric = new Autor("Ivo Andric");

        Autor tolstoj = new Autor("Lav Tolstoj");

        Autor dostojevski = new Autor("Fjodor Dostojevski");


        Knjiga a = new Knjiga("ISBN 123456789", "Na Drini cuprija", 1945, andric);

        Knjiga t = new Knjiga("ISBN 9876543210", "Rat i mir", 1867, tolstoj);

        Knjiga d = new Knjiga("ISBN147258369","Zlocin i kazna", 1866, dostojevski);

        Knjiga d2 = new Knjiga("ISBN 3214569874", "Kockar", 1866, dostojevski);

        Knjiga d3 = new Knjiga("ISBN 1114569874", "Polzunkov", 1848, dostojevski);

        a.stampa();
        System.out.println();
        t.stampa();
        System.out.println();
        d.stampa();
        System.out.println();
        d2.stampa();
        System.out.println();
        d3.stampa();
    }
}
