package org.example;

public class Siamak {
    int num;
    String name;

    public Siamak(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
