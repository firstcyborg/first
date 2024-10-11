package org.example;

public class Main {

    private Punisher punisher = null;
    private Amine amine = null;

    public Main() {

        // You mention here if you're a woke or not with true or false.
        amine = new Amine(false);
        System.err.println(amine.toString());
        amine.statement();
        punisher = new Punisher(amine);

    }

    public static void main(String[] args) {
        new Main();
    }

    public Punisher getPunisher() {
        return punisher;
    }

    public Amine getAmine() {
        return amine;

    }
}