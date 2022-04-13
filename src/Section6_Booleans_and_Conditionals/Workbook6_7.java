package Section6_Booleans_and_Conditionals;

import java.util.Scanner;

public class Workbook6_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String choice = sc.nextLine();

        if (choice.toLowerCase().equals("yes")) {
            //Task 2 - Print this if the decision is "yes"
            System.out.println("\nGreat! In one line" +
                    "\nHow much money do you have in your savings?" +
                    "\nAnd, how much do you owe in credit card debt?");
            // Task 3 - Pick up each value
            double saving = sc.nextDouble();
            double debt = sc.nextDouble();

            System.out.println("\nHow many years have you worked for?");
            // Task 4 - Pick up number of years
            int years = sc.nextInt();

            sc.nextLine();

            System.out.println("What is your name?");
            // Task 5 - Pick up the user's name
            String name = sc.nextLine();

            //Task 6 - Approve the mortgage if they meet the requirements (see article)
            //       - Otherwise, don't give them a mortgage.
            if (saving >= 10000 && debt <= 5000 && years >= 2) {
                System.out.println("Congratulations, " + name + ". You have been approved!");
            }
            else {
                System.out.println("Sorry, you are not eligible for a mortgage.");
            }
        }
        //Task 2 - Print this if the decision was not "yes"
        else {
            System.out.println("\nOK. Have a nice day!");
        }


        sc.close();
    }
}
