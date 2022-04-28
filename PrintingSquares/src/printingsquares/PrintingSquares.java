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
        int x;
        Scanner computerKeyboardInput = new Scanner(System.in);
        do
        {
            System.out.print("Enter a number to be squared: ");
            x = computerKeyboardInput.nextInt();
            if (x == 0) {
                return;
            } else {
                System.out.println("square = " + (x * x));
            }     
        } while (x != 0);
        //VARIABLES
        //INPUT
        //DO THE WORK
        //OUTPUT
    }
    
}
