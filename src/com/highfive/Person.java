package com.highfive;

public class Person {
    public void getInfo(int age) {
        System.out.println("Votre âge est : " + age);
    }

    public void getInfo(String name) {
        System.out.println("Votre nom est : " + name);
    }

    public static void main(String[] args) {
        Person toto = new Person();
        toto.getInfo(12);
        toto.getInfo("toto");
    }
}
