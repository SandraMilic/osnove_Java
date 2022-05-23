package d19_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {
        SmartAirConditioning tesla = new SmartAirConditioning();

        tesla.marka = "Tesla";
        tesla.modHladiGreje = "hladi";
        tesla.temperatura = 23;
        tesla.potrosnjaGrejanje = 3;
        tesla.potrosnjaHladjenje = 2;

        tesla.stampa();

        System.out.println("Mesecna potrosnja u kW/h je " + tesla.mesecnaPotrosnjaUkW() + "kW/h");
        System.out.println("Mesecna potrosnja u RSD je " + tesla.mesecnaPotrosnjaURSD() + "RSD");
        System.out.println();

        SmartAirConditioning samsung = new SmartAirConditioning();

        samsung.marka = "Samsung";
        samsung.modHladiGreje = "greje";
        samsung.temperatura = 25;
        samsung.potrosnjaGrejanje = 3;
        samsung.potrosnjaHladjenje = 2;

        samsung.stampa();

        System.out.println("Mesecna potrosnja u kW/h je " + samsung.mesecnaPotrosnjaUkW() + "kW/h");
        System.out.println("Mesecna potrosnja u RSD je " + samsung.mesecnaPotrosnjaURSD() + "RSD");
    }
}
