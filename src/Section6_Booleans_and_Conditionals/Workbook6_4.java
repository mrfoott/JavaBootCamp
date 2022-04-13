package Section6_Booleans_and_Conditionals;

public class Workbook6_4 {
    public static void main(String[] args) {

        int temp = -5;

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!

        //if temp between -15 and -1: "The forecast is FREEZING! Stay home!"

        //if temp between 0 and 10: "The forecast is Chilly. Wear a coat!";

        //else: It's warm. go outside!

        if (temp >= -15 && temp <= -1) {
            forecast = "FREEZING! Stay home!";
        }
        else if (temp >= 0 && temp <= 10) {
            forecast = "Wear a coat!";
        }
        else {
            forecast = "It's warm, go outside!";
        }

        System.out.println(forecast);
    }
}
