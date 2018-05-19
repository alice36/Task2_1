public class RynekMieszkan {
    public static void main(String[] args) {
        Mieszkanie mieszkanie1 = new Mieszkanie("Archicom","Piekna",5,80,true);
        Mieszkanie mieszkanie2 = new Mieszkanie("BudMed","Zlota",3,50.5,false);

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
