package org.example;

public class Punisher {
    Amine amine;
    boolean punished;
    String person;

    public Punisher(Amine amine) {
        setAmine(amine);
        setPunished(getAmine().isWoke());
        setPerson(getAmine().getName());
        start();

    }

    private void start() {
        if (punished) {
            System.out.println(person + " is a bitch and therefore shall be punished !!!");
        } else {

            System.out.println(person + " is an alpha male and kicks your monkey ass !!!");

        }
    }

    public Amine getAmine() {
        return amine;
    }

    public void setAmine(Amine amine) {
        this.amine = amine;
    }

    public boolean isPunished() {
        return punished;
    }

    public void setPunished(boolean punished) {
        this.punished = punished;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

}
