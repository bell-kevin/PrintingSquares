/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printingsquares;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class PrintingSquares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Printing Squared Numbers by Kevin Bell \n");
        int numberToBeSquared;
        Scanner computerKeyboardInput = new Scanner(System.in);
        do {
            System.out.print("Enter a number to be squared: ");
            numberToBeSquared = computerKeyboardInput.nextInt();
            if (numberToBeSquared != 0) {
                System.out.println("square = " + (numberToBeSquared * numberToBeSquared));
            }
        } while (numberToBeSquared != 0);
    }
}
