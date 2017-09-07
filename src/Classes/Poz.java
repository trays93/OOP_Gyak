package Classes;

/**
 * Egy osztály, ami 2D-s koordinátapontok tárolására szolgál
 * 
 * @author Lovas Bálint
 */
public class Poz {
    /**
     * x: egy egész szám, az x tengelytől való távolság meghatározására
     * y: egy egész szám, az y tengelytől való távolság meghatározására
     */
    private int x, y;

    
    /**
     * Poz konstruktor, 2 paramétert vár
     * @param x
     * @param y
     */
    public Poz(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Kiírja a tárolt koordinátákat a konzolra.
     */
    public void kiir() {
        System.out.print("X koord: " + this.x + ", Y koord: " + this.y);
    }
}
