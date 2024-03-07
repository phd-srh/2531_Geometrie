public class Main {

    // polymorphe Methode
    public static void ausgabeGeometrischeForm(GeometrischeForm form) {
//V1 -  System.out.print("Ein " + form.getFormTyp() + " mit einem Attribut ");
        System.out.print("Ein " + form.getClass().getName() + " mit eine:r:m " + form.getAttributName());
        System.out.print(" von ");

        // würde das auch gehen? - NEIN
//        Kreis kreis = (Kreis) form;
//        System.out.print( kreis.getRadius() );

        if ( form instanceof Kreis ) {
            // form ist definitiv ein Kreis
            Kreis kreis = (Kreis) form;
            System.out.print( kreis.getRadius() );
        }
        else if (form instanceof Quadrat) {
            // form ist eine Quadrat
            Quadrat quadrat = (Quadrat) form;
            System.out.print( quadrat.getSeitenlänge() );
        }
        System.out.print(" hat eine Fläche von " + form.berechneFläche());
        System.out.println(" und einen Umfang von " + form.berechneUmfang());
    }

    public static void main(String[] args) {
        Kreis kreis = new Kreis(7.3);
//        System.out.print( "Ein Kreis mit einem Radius von ");
//        System.out.print( 7.3 );
//        System.out.print( " hat eine Fläche von ");
//        System.out.println( kreis.berechneFläche() );
        ausgabeGeometrischeForm(kreis);

        Quadrat quadrat = new Quadrat(4.9);
//        System.out.print( "Ein Quadrat mit einer Seitenlänge von ");
//        System.out.print( 4.9 );
//        System.out.print( " hat eine Fläche von ");
//        System.out.println( quadrat.berechneFläche() );
        ausgabeGeometrischeForm(quadrat);

    }
}
