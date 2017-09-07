package Classes;

/**
 * Egy osztály, ami egy ember nevét és koordinátáit tárolja el
 * 
 * @author lovas.balint
 */
public class Ember {
    /**
     * @param nev: egy String ami egy Ember típusú objektum nevét tárolja
     * @param poz: egy Poz, ami egy Ember típusú objektum koordinátáit tárolja
     */
    private String nev;
    private Poz poz;

    /**
     * Ember konstruktor, 3 paramétert vár
     * @param nev
     * @param x
     * @param y 
     */
    public Ember(String nev, int x, int y) {
        this.nev = nev;
        this.poz = new Poz(x, y);
    }

    /**
     * Kiírja az objektum nevét és koordinátáit a konzolra.
     */
    public void kiir() {
        System.out.print("Név: " + this.nev + ", Pozíció: ");
        this.poz.kiir();
        System.out.println("");
    }
}
