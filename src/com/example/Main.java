package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! To get the weather, you will need to enter the city's latitude and longitude");
        
        System.out.println("Enter the city's latitude: ");
        double cityLatitude = scanner.nextDouble();

        System.out.println("Enter the city's longitude: ");
        double cityLongitude = scanner.nextDouble();
        

        //create a new instance of the WeatherService class
        WeatherService weatherService = new WeatherService();
        try {
            // Call the getTemperature method with the user-provided coordinates
            double temperature = weatherService.getTemperature(cityLongitude, cityLatitude);

            // Print the temperature to the console with the latitude and longitude given by the user
            System.out.println("The temperature in " + cityLatitude + ", " + cityLongitude + " is " + temperature + " degrees.");
            
        }catch (Exception e) {
            System.out.println("Error getting the message, try again" + e.getMessage());
        }
    
    }

}
