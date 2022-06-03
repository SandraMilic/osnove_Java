package d02_06_2022;
public class Magacioner extends Radnik {
//    Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//    ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//    suma plata svih sektor / broj sektora * 0.5
//    override uje metodu za platu, tako da se plata racuna po formuli:
//            (prosecna plata za sve sektore u kojima radi) * (broj sektora).
    public Magacioner(String punoIme) {
        super(punoIme);
    }

    private double prosecnaPlata () {

        double suma = 0;

        for (int i = 0; i < nizSektora.size(); i++) {
            suma = suma + this.nizSektora.get(i).getPlataSektora();
        }
        return suma / this.nizSektora.size() * 0.5;
    }

    @Override
    public double plata() {

        return this.prosecnaPlata() * this.nizSektora.size();
    }
}
