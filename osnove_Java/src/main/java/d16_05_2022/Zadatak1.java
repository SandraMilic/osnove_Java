package d16_05_2022;

public class Zadatak1 {
//    Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//    Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

    public static void main(String[] args) {

        stampajVrednostZa10Vecu(10);

    }

    static void stampajVrednostZa10Vecu (int x) {

        System.out.println("Vrednost 10 puta veca od broja " + x + " je " + (x * 10));
    }

}
