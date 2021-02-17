/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
public class Arry {
 
 
    public static void main(String[] args) {
        
    
        
        int add;
        int increa =0;
        Scanner input = new Scanner(System.in);
      int var[] = new int[10];
      
      
        System.out.println("Enter the Numbert :");
        for(int i = 0; i<var.length; i++){
            var[i] = input.nextInt();
        }
        add =var[0];
        for(int i = 0; i<var.length; i++){
            if(add<var[i]){
                
                add = var[i];
                increa++;
                
                
                
            }
            
        }
        System.out.println("larg"+add);
       
	}


    }
      
      
    
    

