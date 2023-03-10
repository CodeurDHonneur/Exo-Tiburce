package com.highfive.test;

public class Compteur {
    private static int  compt;

    public Compteur() {
        //compt = 0;
        compt++;
        System.out.println(compt);
    }

    static {
        compt = 0;
        System.out.println(compt);
    }
    
    public static void main(String[] args) {
        Compteur c1 = new Compteur();
        Compteur c2 = new Compteur();
        Compteur c3 = new Compteur();
        
    }
}
