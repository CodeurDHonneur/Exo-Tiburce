package segment;

public class Segment  {

    private static int extr1;
    private static int extr2;
    

    public Segment(int x1, int x2) {
        extr1 = x1;
        extr2 = x2;
        ordonne();
    }

    private static void ordonne() {
        
        int z = 0;
        if (extr1 > extr2) {
            z = extr1;
            extr1 = extr2;
            extr2 = z;
        }
    }

    public int longueur() {
        return (extr2 - extr1);
    }

    public boolean appartient(int y) {
        if (y >= extr1 && y <= extr2) {
            return true;
        } else {
            return false;
        }
    }

    public int getExtr1() {
        return extr1;
    }
    public void setExtr1(int a) {
        extr1 = a;
    }

    public int getExtr2() {
        return extr2;
    }
    public void setExtr2(int b) {
        extr2 = b;        
    }

    public String toString() {
        return "notre \"segment est => [" + extr1 + "," + " " + extr2 + "]\"";
    }
    
}
