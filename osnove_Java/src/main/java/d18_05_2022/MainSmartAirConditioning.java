package d18_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {
        SmartAirConditioning samsung = new SmartAirConditioning();

        samsung.marka = "Samsung";
        samsung.mod = "Hladjenje";
        samsung.temperatura = 15;

        samsung.stampa();
        System.out.println();

        SmartAirConditioning tesla = new SmartAirConditioning();

        tesla.marka = "Tesla";
        tesla.mod = "Grejanje";
        tesla.temperatura = 25;

        tesla.stampa();
    }
}
