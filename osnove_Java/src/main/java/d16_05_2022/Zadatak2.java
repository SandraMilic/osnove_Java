package d16_05_2022;

public class Zadatak2 {
//    Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru:
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

    public static void main(String[] args) {

        String dvocifreniBroj = dvocifreniBrojOdJednocifrenih(3,7);
        System.out.println("Dvocifreni broj je " + dvocifreniBroj);

    }

    static String dvocifreniBrojOdJednocifrenih (int x, int y) {

        return x + "" +  y;
    }
}
