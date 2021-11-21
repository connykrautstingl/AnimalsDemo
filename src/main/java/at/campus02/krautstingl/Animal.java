package at.campus02.krautstingl;

import javax.swing.*;
import java.util.*;

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getAnimalLoud() {
        return animalLoud;
    }

    public void setAnimalLoud(String animalLoud) {
        this.animalLoud = animalLoud;
    }

    private int age;
    private String species;
    private String animalLoud;


    public String giveAnimalLoud() {

    }

    public String getNameAndAge() {
    }

    public String ageCategory() {

        if age(age < 2) {
            return "baby animal";
        }
        if else age(age >= 2 || age <= 4) {
            return "young animal";
        }
        if else age(>4)
        return "old animal";
    }



    public static void main(String[] args) {

    }
}
