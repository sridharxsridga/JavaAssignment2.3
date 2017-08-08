/*
* Program to find the highest among the given 3 numbers.
*
 */
 
package highestNumber;
 
import java.util.Scanner;
 
public class HighestNumber {
 
       /*
       * Main() method is implemented to accept three int values from the user and
       * display highest number among three numbers
       */
 
       public static void main(String[] args) {
 
              Integer[] passInput = new Integer[3];
              Scanner scanner = new Scanner(System.in);
              System.out.print("Enter First Value :");
              passInput[0] = scanner.nextInt();
              System.out.print("Enter Second Value :");
              passInput[1] = scanner.nextInt();
              System.out.print("Enter Third Value :");
              passInput[2] = scanner.nextInt();
              System.out.println("The Highest Number is " + calculate(passInput));
       }
 
       // This method is implemented to calculate the highest number and return
       // highest Number
       public static int calculate(Integer[] passedInput) {
              int highestNumber = passedInput[0];
              for (int input : passedInput) {
                     if (input > highestNumber) {
                           highestNumber = input;
                     }
              }
              return highestNumber;
       }
 
}
 
 