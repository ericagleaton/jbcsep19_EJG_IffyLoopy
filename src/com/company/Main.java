package com.company;
/*
Loopy
Create ONE string variable to store the output of 5 words that a user will enter at random.

Iffy
Set a boolean value called redEyes.

The value will depend on the value entered by the user for the question "Are your eyes red?"


Create an application that will ask,

"Are your eyes red?"

If the response is 'y', Or 'yes' (regardless of case), then your application should print out:
"Get some sleep!"


Otherwise your application should print out "You look great!"

Use the value of redEyes to determine whether the user should be complimented or not.

Iffy Loop
Make sure after the application asks the question the first time, you get a prompt asking,
"Do you want to try again?"
Your application should continue until the user enters 'n' as an answer.
*/
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
