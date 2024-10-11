package org.example;

public class Amine {
    boolean handicaped;
    boolean woke;
    String name;
    String nationality;
    String gender;
    int age;
    int semester;

    public Amine(boolean woke) {

        setWoke(woke);
        init();
    }

    private void init() {
        if (woke) {
            setHandicaped(true);
            setName("Amine (Omega)");
            setNationality("Thailand");
            setGender("SuperGay!");
            setAge(14);
            setSemester(1);
        } else {
            setHandicaped(false);
            setName("Amine");
            setNationality("Monaco");
            setGender("Male (Alpha)");
            setAge(30);
            setSemester(14);
        }
    }
    public void statement(){
        if (woke) {
            System.out.println("Why are you Gay ?!");
        } else {
            System.out.println("Cool Broooo!!!");
        }

    }

    public boolean isHandicaped() {
        return handicaped;
    }

    public void setHandicaped(boolean handicaped) {
        this.handicaped = handicaped;
    }

    public boolean isWoke() {
        return woke;
    }

    public void setWoke(boolean woke) {
        this.woke = woke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return " Name : " + name + "\t Age : " + age + "\t Nationality : " + nationality + "\t Gender : " + gender + "\t Handicapped ? : " + handicaped + "\t Semester : " + semester;
    }
}
