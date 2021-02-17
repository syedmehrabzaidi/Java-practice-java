/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wednesdaytask;

import java.util.Scanner;

/**
 *
 * @author amanlab02
 */
public class WednesdayTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //PROGRAM-1
        System.out.println("PROGRAM-1");

        for (int i = 0; i < 5; i++) { //ROW
        for (int j = 0; j < 6; j++) {//COLUMN
        System.out.print("*");
            }
            System.out.println();
        }
        
        //PROGRAM-2
        System.out.println();
        System.out.print("PROGRAM-2");
        for (int i = 0; i < 6; i++) { //ROW
        for (int j = 0; j < i; j++) {//COLUMN
        System.out.print("*");
            }
            System.out.println();
        }
        
        //PROGRAM-3
        System.out.println();
        System.out.print("PROGRAM-3");
        for (int i = 0; i < 6; i++) {
        //It will print spaces 
        for (int j =0; j<6-i; j++) {
        System.out.print(" ");
        }
        for (int k = 1; k <=i; k++) {
        System.out.print("*");
        }
               System.out.println();
        }
        
          //PROGRAM-4
        System.out.println();
        System.out.print("PROGRAM-4");
        for (int i = 0; i < 6; i++) { //ROW
        for (int j = 0; j < i; j++) {//COLUMN
        System.out.print(i);
            }
            System.out.println();
        }
    }
    
    
    
    
}
