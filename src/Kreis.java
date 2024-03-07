public class Kreis extends GeometrischeForm {
    private double radius;

    public Kreis(double radius) {
        super("Radius");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double berechneFläche() {
        return Math.PI * radius * radius;
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }
}
