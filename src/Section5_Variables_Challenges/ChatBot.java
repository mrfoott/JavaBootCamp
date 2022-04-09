package Section5_Variables_Challenges;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello user, how do I call you?");
        String name = sc.nextLine();

        System.out.println("\nHello " + name + ", now we'll go through a small survey.");
        System.out.println("First, tell me where are you from?");
        String place = sc.nextLine();
        System.out.println("Second, how old are you?");
        int age = sc.nextInt();
        if (age >= 25) {
            System.out.println("What??? You are this old??? 😂 Poor you!!!");
        }
        else {
            System.out.println("Error - Too young... Just kidding! XD");
        }
        sc.nextLine();
        System.out.println("Just some more questions");
        System.out.println("What is your favorite programming language?");
        String pro_lang = sc.nextLine();
        if (pro_lang == "HTML") {
            System.out.println("HTML IS NOT A PROGRAMMING LANGUAGE!!!!!!!!!");
        }
        else {
            System.out.println("BOOOO!!!!");
        }

        System.out.println("\nOKay, I have to go, goodbye for now, and have a nice day!!!");
    }
}
