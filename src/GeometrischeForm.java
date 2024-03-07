
// eine abstrakte Klasse dient nur als Basisklasse
// und erlaubt nicht, dass Objekte dieser Klasse erstellt werden!
public abstract class GeometrischeForm {
    private String attributName;

    public GeometrischeForm(String attributName) {
        this.attributName = attributName;
    }

    public String getAttributName() {
        return attributName;
    }

    // abstrakte Methoden brauchen keinen Methodenrumpf (Implementierung),
    // müssen dann aber in der Unterklasse überschrieben werden!
    public abstract double berechneFläche();

    public abstract double berechneUmfang();
}
