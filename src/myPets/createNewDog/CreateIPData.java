package myPets.createNewDog;

import java.awt.*;
import java.io.File;

public class CreateIPData {
    private final String name;
    private final String breed;
    private final boolean vaccinated;
    private final boolean neutered;
    private final int age;
    private final String sex;
    private final String size;
    private final File picture;
    private final String temper;
    private final String description;
    private final String likes;

    public CreateIPData(String name, String breed, boolean vaccinated, boolean neuter, int age, String sex, String size, File picture, String temper, String description, String likes) {
        this.name = name;
        this.breed = breed;
        this.vaccinated = vaccinated;
        this.neutered = neuter;
        this.age = age;
        this.sex = sex;
        this.size = size;
        this.picture = picture;
        this.temper = temper;
        this.description = description;
        this.likes = likes;
    }
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getPetBreed(){
        return breed;
    }
    public boolean isVaccinated(){
        return vaccinated;
    }
    public boolean isNeutered(){
        return neutered;
    }
    public String getSex(){return sex;}
    public String getSize(){return size;}
    public File getImageFile(){return picture;}
    public String getTemper(){return temper;}
    public String getDescription(){return description;}
    public String getLikes(){return likes;}
}
