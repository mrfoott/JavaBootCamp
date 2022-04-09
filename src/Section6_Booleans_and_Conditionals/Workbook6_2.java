package Section6_Booleans_and_Conditionals;

public class Workbook6_2 {
    public static void main(String[] args) {
//        double wallet = 100;
//        double wallet = 89.99;
        double wallet = 2.99;

        double toyCar = 5.99;
        System.out.println("Can I get this car?");

        //if you have enough money
        //       print: Sure!
        //       pay for the toy car

        //else:  Sorry, I only have <wallet> left.

        if (wallet >= toyCar) {
            System.out.println("Sure!\nPay for the toy car!");
        }
        else {
            System.out.println("Sorry, you only have " + wallet + " left.");
        }


        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        //if you have enough money
        //       print: Sure!
        //       pay for the nike shoes

        //else: Sorry, I only have <wallet> left.

        if (wallet >= nike) {
            System.out.println("Sure!\nPay for the Nike shoes!");
        }
        else {
            System.out.println("Sorry, you only have " + wallet + " left.");
        }
    }
}
