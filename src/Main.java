public class Main {

    public static void ausgabeGeometrischeForm(GeometrischeForm form) {
        System.out.print("Eine Form mit einem Attribut ");
        //System.out.println( form.getRadius() );
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


        System.out.print( "Ein Kreis mit einem Radius von ");
        System.out.print( kreis.getRadius() );
        System.out.print( " hat einen Umfang von ");
        System.out.println( kreis.berechneUmfang() );

        Quadrat quadrat = new Quadrat(4.9);
//        System.out.print( "Ein Quadrat mit einer Seitenlänge von ");
//        System.out.print( 4.9 );
//        System.out.print( " hat eine Fläche von ");
//        System.out.println( quadrat.berechneFläche() );
        ausgabeGeometrischeForm(quadrat);

        System.out.print( "Ein Quadrat mit einer Seitenlänge von ");
        System.out.print( 4.9 );
        System.out.print( " hat einen Umfang von ");
        System.out.println( quadrat.berechneUmfang() );
    }
}
