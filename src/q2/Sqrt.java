package q2;

import java.util.Scanner;

/**
 * Sqrt: Calculates an approximation to the square root of user input.
 * 
 * This program asks the user to enter a positive value not less than1 1,
 * calculates approximations to the square root of it 
 * (with an algorithm from Newton) and prints the first 10 estimates.
 * 
 * @author Echo Wang, Set 1C
 * @version 1.0
 */
public class Sqrt {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        
        //prompts for and reads the value of a
        System.out.print("Please enter a number not less than 1: ");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        scan.close();
        
        System.out.println("The first 10 estimates for the suqre root "
                + "of the number you input are as follows:");

        
        //calculate and print the 1st estimate s of the square root of a
        double s = (a + 1) / 2;
        System.out.println(s);
        
        //calculate the 2nd estimate with a and s and assign the result to s
        s = (s + a / s) / 2;
        
        //calculate 3rd-10th estimates
        System.out.println(s);
        s = (s + a / s) / 2;
        System.out.println(s);
        s = (s + a / s) / 2;
        System.out.println(s);
        s = (s + a / s) / 2;
        System.out.println(s);
        s = (s + a / s) / 2;
        System.out.println(s);
        s = (s + a / s) / 2;
        System.out.println(s);
        s = (s + a / s) / 2;
        System.out.println(s);
        s = (s + a / s) / 2;
        System.out.println(s);
        s = (s + a / s) / 2;
        System.out.println(s);

    }
}   
