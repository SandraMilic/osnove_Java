package d23_05_2022;

public class Autor {
//    Kreirati klasu Autor koja ima
//      -ime i prezime
//      -konstuktore koje mislite da su vam potrebni
//      -gettere i settere za atribute
//      -metodu print koja stampa u formatu:
//            (ime autora) (prezime autora)

    private String punoImeAutor;

    public Autor (String punoImeAutor) {
        this.punoImeAutor = punoImeAutor;
    }
    public void setPunoImeAutor (String punoImeAutor) {
        this.punoImeAutor = punoImeAutor;
    }
    public String getPunoImeAutor () {
        return  this.punoImeAutor;
    }
    public void stampa () {
        System.out.println("autor: " + this.punoImeAutor);
    }

}
