public class Quadrat extends GeometrischeForm {
    private double seitenlänge;

    public Quadrat(double seitenlänge) {
        super("Seitenlänge");
        this.seitenlänge = seitenlänge;
    }

    public double getSeitenlänge() {
        return seitenlänge;
    }

    @Override
    public double berechneFläche() {
        return seitenlänge * seitenlänge;
    }

    @Override
    public double berechneUmfang() {
        return 4 * seitenlänge;
    }
}
