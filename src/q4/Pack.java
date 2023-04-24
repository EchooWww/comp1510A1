package q4;

import java.util.Scanner;

/**
 * Pack: encodes and decodes MIX-characters.
 * 
 * This program asks the users to enter a 5-character string
 * converts to numeric value (according to the MIX computer)
 * encodes from decimal to a base 56 number,
 * then converts the base 56 number to binary, 
 * and decode back to character string  (according to the MIX computer).
 * 
 * @author Echo Wang, Set 1C
 * @version 1.0
 */
public class Pack {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {
        //declare index numbers and the base 56 to get rid of magic number
        final int index0 = 0;
        final int index1 = 1;
        final int index2 = 2;
        final int index3 = 3;
        final int index4 = 4;
        final int base = 56;
        
        //prompts for and read the user input string
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a upper-case "
                + "5-character string frin A to I: ");
        String input = scan.nextLine();
        scan.close();
        
        //extract each character of the string
        char c1 = input.charAt(index0);
        char c2 = input.charAt(index1);
        char c3 = input.charAt(index2);
        char c4 = input.charAt(index3);
        char c5 = input.charAt(index4);
        
        //convert each character to numeric value
        int num1 = c1 - 'A' + 1;
        int num2 = c2 - 'A' + 1;
        int num3 = c3 - 'A' + 1;
        int num4 = c4 - 'A' + 1;
        int num5 = c5 - 'A' + 1;
        
        //encode (convert the base 56 number to decimal) and print
        int encodedNum = num1 * base * base * base * base
                + num2 * base * base * base 
                + num3 * base * base
                + num4 * base
                + num5;
        System.out.println("Encoded: " + encodedNum);
        
        //convert the encoded decimal number to base 56
        int d5 = encodedNum % base;
        encodedNum /= base;
        int d4 = encodedNum % base;
        encodedNum /= base;
        int d3 = encodedNum % base;
        encodedNum /= base;
        int d2 = encodedNum % base;
        encodedNum /= base;
        int d1 = encodedNum % base;
        encodedNum /= base;
        
        //decode each digit back to character and print
        char char1 = (char) (d1 - 1 + 'A');
        char char2 = (char) (d2 - 1 + 'A');
        char char3 = (char) (d3 - 1 + 'A');
        char char4 = (char) (d4 - 1 + 'A');
        char char5 = (char) (d5 - 1 + 'A');
        System.out.println("Decoded: " + char1 + char2 + char3 + char4 + char5);

    }

}
