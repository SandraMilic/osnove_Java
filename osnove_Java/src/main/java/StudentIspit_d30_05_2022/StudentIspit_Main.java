package StudentIspit_d30_05_2022;

public class StudentIspit_Main {
    public static void main(String[] args) {
        Ispit i1 = new Ispit("Razvojna psi", 9, "Dragan Popadic");
        Ispit i2 = new Ispit("Opsta psi", 8, "Danijela Antic");
        Ispit i3 = new Ispit("Skole i pravci", 7, "Predrag Ognjenovic");
        Ispit i4 = new Ispit("Inzenjerska psi", 5, "Aleksandar Dimitrijevic");
        Ispit i5 = new Ispit("Decija psi", 9, "Ksenija Krstic");
        Ispit i6 = new Ispit("Staatistika", 5, "Zoran Opacic");

        Student sandra = new Student("PSI-69", "Sandra Milic", "Master");
        sandra.dadajIspit(i1);
        sandra.dadajIspit(i2);
        sandra.dadajIspit(i3);
        sandra.dadajIspit(i4);
        sandra.dadajIspit(i5);
        sandra.dadajIspit(i6);
        sandra.dadajIspit(i1);

        sandra.stampaStudent();
    }
}
