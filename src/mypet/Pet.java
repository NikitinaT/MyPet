/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypet;

import java.lang.Exception;
import javax.management.RuntimeErrorException;

/**
 *
 * @author Nikitina
 */
public class Pet {
    private int age;
    private float weight;
    private float height;
    private String color;
    private String ownerName;
    private String animalName;
    private String animalType;
    private int foodFactor = 3;
    private int moodFactor = 2;

    public Pet() {
    }

    public Pet(String animalType) {
    }

    /**
     *
     * @param animalType - animal type
     * @param animalName - animal name
     * @param ownerName - owner name
     * @param age - animal age
     * @param weight - animal weight
     * @param height - animal height
     * @param color - animal color
     */
    public Pet(String animalType, String animalName, String ownerName, int age, float weight, float height, String color) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.color = color;
        this.ownerName = ownerName;
        this.animalName = animalName;
        this.animalType = animalType;
        System.out.println("Creating new pet.");
    }

    

    /**
     * If you feed animal, you increase his moodFactor and weight.
     */
    public void feed() {
        System.out.println("Thank you for food my owner");
        setFoodFactor(getFoodFactor() + 1);
        System.out.println("My mood is better:)");
        setMoodFactor(getMoodFactor() + 1);
        System.out.println("My weight has increased:)");
        setWeight(getWeight() + 0.8f);
    }

    /**
     * If you kick animal you decrease his moodFactor.
     */
    public void kick() {
        if (getMoodFactor() > 0) {
            setMoodFactor(getMoodFactor() - 1);
        }
    }

    /**
     * Animal can run.
     */
    public void run() {

        if (getWeight() > 0) {
            setWeight(getWeight() - 1);
        }
        if (getFoodFactor() > 0) {
            setFoodFactor(getFoodFactor() - 1);
        }

        setMoodFactor(getMoodFactor() + 1);
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the foodFactor
     */
    public int getFoodFactor() {
        return foodFactor;
    }

    /**
     * @param foodFactor the foodFactor to set
     */
    public void setFoodFactor(int foodFactor) {
        this.foodFactor = foodFactor;
    }

    /**
     * @return the moodFactor
     */
    public int getMoodFactor() {
        return moodFactor;
    }

    /**
     * @param moodFactor the moodFactor to set
     */
    public void setMoodFactor(int moodFactor) {
        this.moodFactor = moodFactor;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * @return the animalName
     */
    public String getAnimalName() {
        return animalName;
    }

    /**
     * @param animalName the animalName to set
     */
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    /**
     * @return the animalType
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * @param animalType the animalType to set
     */
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}

