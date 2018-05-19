public class Mieszkanie {
    String nazwaUlicy;
    double metraz;
    int iloscPokoi;
    String nazwaDewelopera;
    boolean czyGaraz;

    Mieszkanie(String developer, String ulica, int pokoje, double metry, boolean garaz){

        nazwaDewelopera = developer;
        nazwaUlicy=ulica;
        iloscPokoi=pokoje;
        metraz =metry;
        czyGaraz = garaz;

    }

}
