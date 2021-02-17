/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author amanlab02
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user= new Scanner (System.in);
      int [] num = new int[10]; //{1,2,3,10,15};
                 
        for (int i = 0; i <num.length; i++) {
           num[i]=user.nextInt();
        }
            System.out.println("chak no.");
            for (int j = 0; j <num.length; j++) {
                
            
         if (num[j]==11){
             System.out.println("prestnt at"+j);}
         
         else{
             System.out.println("Invalid");
         }}
        }
              }
    

