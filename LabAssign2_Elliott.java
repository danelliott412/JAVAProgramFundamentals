
import java.util.Scanner;

/**
 * @author Dan Elliott CIT-111-Z01
 * Lab Assignment 2
 */
public class LabAssign2_Elliott {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Set up variables
        Scanner input = new Scanner(System.in);
        int EatenCookies;
        float  ConsumedCalories, CalPerCookies, 
                ServingsEaten, CookiesPerBox = 35;
        int CalPerServing = 250, ServingPerBox = 10;
        //Get amount of cookies eaten from user
        System.out.print("How many cookies have been eaten? Enter Amount -->");
       EatenCookies = input.nextInt();
       /* calculate the calories of each cookie from the
       given calorie per serving and serving siz info
       */
       CalPerCookies = ServingPerBox * CalPerServing / CookiesPerBox;
       ConsumedCalories = EatenCookies * CalPerCookies;
       ServingsEaten = ConsumedCalories / CalPerServing;
       
       //Print the results of calories eaten and servings consumed.
       System.out.println(ConsumedCalories + " calories have been consumed.");
       System.out.println("That is equal to " + ServingsEaten + " servings.");     
    }
    
}
