import java.util.Scanner;

/***********PSEUDOCODE*************
 *
 * import scanner
 * create a scanner object to take input
 * prompt user for wind speed.
 * assign input to integer type variable windSpeed
 * create if else if statement with range for each hurricane category
 * print the category for the matching speed
 */


public class HurricaneSpeed {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);
        //prompt user for wind speed number
        System.out.print("Enter the wind speed: ");
        int windSpeed = in.nextInt();
        //if else if statement to check speed
        if (windSpeed > 73 && windSpeed < 96) System.out.println("Hurricane category is: Category 1");
        else if (windSpeed > 95 && windSpeed < 111) System.out.println("Hurricane category is: Category 2");
        else if (windSpeed > 110 && windSpeed < 130) System.out.println("Hurricane category is: Category 3");
        else if (windSpeed > 129 && windSpeed < 157) System.out.println("Hurricane category is: Category 4");
        else  System.out.println("Hurricane category is: Category 5");

    }
}
