/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author amanlab02
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num [] = new int []{10,15,4,3,7};
      int num2 [] = new int [5];
      int i;
       System.out.println("araay");
        for ( i = 0; i <num.length ; i++) {
            System.out.println(num[i]+" Index "+i);}
        int j;
        for ( j=num2.length-1; j>=0; j--) {
            num2 [i] = num2 [j];
            i++;
        }
        
        System.out.println("reverce");
                for ( int a =0 ; a < num2.length ; a++){
              
            System.out.println(num2[a]+" Intdex "+i);
      }
                
    }
}
    

