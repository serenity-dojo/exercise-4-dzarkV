package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private int age;

    private static final String DOG_NOISE = "Woof";
    private boolean isFed;

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makeNoise() {
        return DOG_NOISE;
    }

    public void feed() {
        this.isFed = true;
    }

    public boolean isFed(){
        return this.isFed;
    }
}
