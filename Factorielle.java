
class Factorielle {
   
    /*public static int calculate(int a) {
        int b = 0;
        for(int i = 1; i <= a; i++) {
            b *= i; 
        }
        return b;
    }*/

    public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);
    System.out.println("votre entrée est : " + n);

    //int c = calculate(n);
    int b = 1;

    for(int i = 1; i <= n; i++) {
        b *= i;
    //System.out.println(b);

    }
    System.out.println("le résultat de la factorielle est : " + b);
   
    }
}