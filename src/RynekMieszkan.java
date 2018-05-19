public class RynekMieszkan {
    public static void main(String[] args) {
        Mieszkanie mieszkanie1 = new Mieszkanie();
        Mieszkanie mieszkanie2 = new Mieszkanie();

        mieszkanie1.nazwaDewelopera = "Archicom";
        mieszkanie1.nazwaUlicy = "Piekna";
        mieszkanie1.czyGaraz = true;
        mieszkanie1.iloscPokoi = 5;
        mieszkanie1.metraz = 80;

        mieszkanie2.nazwaDewelopera = "BudMed";
        mieszkanie2.nazwaUlicy = "Zlota";
        mieszkanie2.czyGaraz = false;
        mieszkanie2.iloscPokoi = 3;
        mieszkanie2.metraz = 55.5;

        System.out.println(mieszkanie1.nazwaDewelopera);
        System.out.println(mieszkanie1.nazwaUlicy);
        System.out.println(mieszkanie1.czyGaraz);
        System.out.println(mieszkanie1.iloscPokoi);
        System.out.println(mieszkanie1.metraz);

        System.out.println("");
        
        System.out.println(mieszkanie2.nazwaDewelopera);
        System.out.println(mieszkanie2.nazwaUlicy);
        System.out.println(mieszkanie2.czyGaraz);
        System.out.println(mieszkanie2.iloscPokoi);
        System.out.println(mieszkanie2.metraz);

    }
}
