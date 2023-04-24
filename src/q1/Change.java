package q1;

import java.util.Scanner;

/**
 * Change: Calculates the fewest number of each bill and coin needed.
 * 
 * This programs asks the user to enter a momentary amount, calculates and 
 * prints the fewest number of each bill/coin needed for this amount.
 * To avoid floating point errors,
 * we use the integer of penny numbers to do the calculation.
 * 
 * @author Echo Wang, Set 1C
 * @version 1.0
 */
public class Change {
    /**
     * This is the entry point that gets called to run the program.
     * @param args unused.
     */
    public static void main(String[] args) {
                
        //declare multiples of each bill/coin amount relative to a penny
        //to get rid of magic number alerts
        final int tenMultiple = 1000;
        final int fiveMultiple = 500;
        final int tooMultiple = 200;
        final int looMultiple = 100;
        final int quarMultiple = 25;
        final int dimeMultiple = 10;
        final int nickMultiple = 5;
        
        //prompts for and read the value of an input
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a monetary amount: $");
        double amount = scan.nextDouble();
        scan.close();
        
        //calculate the amount of pennies needed (if all pennies)
        int pennies = (int) (amount * looMultiple);
        
        //convert pennies to different kinds of bills/coins
        int tenDollar = pennies / tenMultiple;
        pennies %= tenMultiple;
        int fiveDollar = pennies / fiveMultiple;
        pennies %= fiveMultiple;
        int toony = pennies / tooMultiple;
        pennies %= tooMultiple;
        int loony = pennies / looMultiple;
        pennies %= looMultiple;
        int quarter = pennies / quarMultiple;
        pennies %= quarMultiple;
        int dime = pennies / dimeMultiple;
        pennies %= dimeMultiple;
        int nickle = pennies / nickMultiple;
        pennies %= nickMultiple;
        int penny = pennies;
        
        //print the result
        System.out.println("You will need: \n"
                + tenDollar + " ten dollar bills\n"
                + fiveDollar + " five dollar bills\n"
                + toony + " toonies\n"
                + loony + " loonies\n"
                + quarter + " quarters\n"
                + dime + " dimes\n"
                + nickle + " nickles\n"
                + penny + " pennies");
    }

}
