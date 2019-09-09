package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean redEyes = false;
        String response = "y";
        System.out.println("Enter either N or Y");
        while (!response.equalsIgnoreCase("n")){
            System.out.println("Are you eyes red?");
            response = input.nextLine();

            if (response.equalsIgnoreCase("Y")) {
                redEyes = true;
                System.out.println("Get some sleep!");
            }else if (response.equalsIgnoreCase("N")) {
                redEyes = false;
                System.out.println("You look great!");
            }else {
                System.out.println("\n*****You did not follow instructions, please enter N or Y ONLY!!!!*****\n");
            }


            System.out.println("Do you want to try again?\nEnter Y to continue., any other response will end.");
            response= input.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                response = "y";
            } else {
                System.out.println("Response is [" + response + "]");
            }
        }
        System.out.println("Goodbye!");
    }
}
