/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypet;

import java.io.Console;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.RuntimeErrorException;

/**
 *
 * @author Nikitina T.S.
 */
public class PetMaster {

    static int age;
    static float weight;
    static float height;
    static String color;
    static String ownerName;
    static String animalName;
    static String animalType;
    //Input object
    static Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            ControlCenter.petPicture();
            //input info about animal
        } catch (Exception ex) {
            Logger.getLogger(PetMaster.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("If you want to create default pet, print <yes>.");
        String choose = in.nextLine();

        if (choose.toLowerCase().equals("yes")) {
            age = 2;
            weight = 200;
            height = 100;
            color = "white";
            ownerName = "Tanya";
            animalName = "Star";
            animalType = "humster";
        } else {
            inputPetInfo();
        }

        //create new instance of pet

        Pet pet = new Pet(animalType, animalName, ownerName, age, weight, height, color);
        System.out.println("Congratulations! Now you have a pet!!!");
        System.out.println("You can control the behavior of your pet.");
        String key = "";
        ControlCenter.printBasicInfo(pet);

        while (!key.equals("exit")) {
            ControlCenter.printInfo(pet);
            try {
                ControlCenter.petPicture();
            } catch (Exception ex) {
                Logger.getLogger(PetMaster.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Control keys: feed, kick, run, print or exit?");
            key = in.nextLine();
            switch (key) {
                case "feed":
                    pet.feed();
                    break;
                case "kick":
                    pet.kick();
                    break;
                case "run":
                    pet.run();
                    break;
                case "print":
                    ControlCenter.printInfo(pet);
                    break;
                case "exit":
                    return;
            }

        }
    }

    /**
     * The method organizes the input of information about the animal.
     */
    public static void inputPetInfo() {

        System.out.println("Input animal type");
        animalType = in.nextLine();

        System.out.println("Input animal name");
        animalName = in.nextLine();

        System.out.println("Input owner name");
        ownerName = in.nextLine();

        System.out.println("Input animal color");
        color = in.nextLine();

        System.out.println("Input animal age");
        age = in.nextInt();

        System.out.println("Input animal weight");
        weight = in.nextInt();

        System.out.println("Input animal height");
        height = in.nextInt();
    }
}
