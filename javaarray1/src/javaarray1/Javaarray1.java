/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarray1;

import java.util.Scanner;

/**
 *
 * @author amanlab02
 */
public class Javaarray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] number=new double[10];
        
        Scanner user=new Scanner (System.in);
         for(int i=1;i<=10;i++){
            System.out.println("Enter any number:");
            number[i]=user.nextInt();
            System.out.println("output: "+number[i]);   
        }
        
    }
    
}
