package com.sda.weatherapp.frontend;

import java.util.Scanner;

/**
 * Created by Hyperbook on 30.01.2021
 **/
public class UserInterface {
    Scanner scanner = new Scanner(System.in);
    public void runApp(){

    }
    public void mainMenu(){
        System.out.println("Welcome in Weather App!");
        while(true){
            System.out.println("1. Add location.");
            System.out.println("2. Display locations added into Database.");
            System.out.println("3. Show current weather.");
            System.out.println("4. Exit application.");
            int navigation = getInt();
            switch (navigation){
                case 1:
                    addLocMenu();
                    break;
                case 2:
                    displayLocations();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Thank you for using Weather App!");
                    return;
                default:
                    System.out.println("\n Incorrect number!");
            }
        }
    }
    private String city="",longitude="",latitude="",region="",country="";
    public void addLocMenu(){
        System.out.println("Add localization menu.");
        while(true) {
            System.out.println("1. Add City");
            System.out.println("2. Add Longitude");
            System.out.println("3. Add Latitude");
            System.out.println("4. Add Region(Optional)");
            System.out.println("5. Add Country");
            int navigation = getInt();
            switch (navigation){
                case 1:
                    System.out.println("\n City:");
                    city=scanner.nextLine();
                    break;
                case 2:
                    System.out.println("\n Longitude:");
                    longitude=scanner.nextLine();
                    break;
                case 3:
                    System.out.println("\n Latitude:");
                    latitude=scanner.nextLine();
                    break;
                case 4:
                    System.out.println("\n Region:");
                    region=scanner.nextLine();
                    break;
                case 5:
                    System.out.println("\n Country:");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("incorrect number!");
            }
        }
    }
    public void displayLocations(){

    }
    private int getInt(){
        while(true){
            try{
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (Exception e){
                System.out.println("\n Input has to be a number!");
            }
        }
    }
}
