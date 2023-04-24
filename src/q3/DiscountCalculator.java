package q3;

import java.util.Scanner;

/**
 * DiscountCalculator: calculates the discount rate for customers.
 * 
 * This program ask the user to enter the numbers of cheeses they purchased
 * and new customers they referred, calculates the discount by adding these
 * 2 numbers, restricts the discount not to exceed 75%, and prints the discount.
 * 
 * @author Echo Wang, Set 1C
 * @version 1.0
 */
public class DiscountCalculator {

    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        
        //declare the maximum discount
        final int maxDiscount = 75;
        
        //declare the parameter to convert to floating point value
        final double rateParam = 100.0;
        
        //prompt for and read the value of cheeses and references
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of cheese "
                + "you've purchased in our club: ");
        int purchase = scan.nextInt();
        System.out.print("Plsease enter the number of "
                + "new customers referred by you: ");
        int referral = scan.nextInt();
        scan.close();
        
        //calculate the sum
        int sum = purchase + referral;
        
        //select the smaller one from sum and maximum discount
        //and assign it as the final discount
        int discount = Math.min(sum, maxDiscount);
        
        //print the discount in percentage and floating point value
        System.out.println("Your discount is " + discount + "%, or " 
                + discount / rateParam);
    }

}
