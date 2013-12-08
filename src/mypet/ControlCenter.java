/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypet;

/**
 *
 * @author Nikitina
 */
public class ControlCenter {
    /**
     * Pet picture output
     */
    public static void petPicture() throws Exception {
        System.out.println555(" /\\_/\\");
        System.out.println("( o.o )");
        System.out.println(" > ^ <");
    }
    
     /**
     * Output animal moodFactor and fullness
     */
    public static void printInfo(Pet pet) {
        System.out.println("-----Animal food fullness " + printStars(pet.getFoodFactor()));
        System.out.println("-----Animal mood " + printStars(pet.getMoodFactor()));

    }   
    
/**
     * Output stars
     *
     * @param printValue
     * @return
     */
    public static String printStars(int printValue) {
        String starStr = "";
        for (int i = 0; i < printValue; i++) {
            starStr = starStr + "*";
        }

        return starStr;
    }

    /**
     * Output basic info about animal
     */
    public static void printBasicInfo(Pet pet) {
        System.out.println("----------------------------------");
        System.out.println("Type of animal is " + pet.getAnimalType());
        System.out.println("Animal's name is " + pet.getAnimalName());
        System.out.println("Owner's name is " + pet.getOwnerName());
        System.out.println("Color is " + pet.getColor() + ". Weight is " + pet.getWeight() + ". Height is " + pet.getHeight());
        System.out.println("----------------------------------");

    }
 
}
