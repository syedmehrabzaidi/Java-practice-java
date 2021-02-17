/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author amanlab02
 */
 class student{
     String univer; 
     String classname;
      int    studends;
      
      student(String c,int s,String u){
          classname=c;
          studends=s;
          univer=u;        
      }
              
 }


public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     student S1 = new student("CC-1 ",26,"IBA");
     System.out.println("Universcity Name "+S1.univer);
     System.out.println("Class Name "+S1.classname);
     System.out.println("Class In Students "+S1.studends);
   
         student S2 = new student("CC-2 ",28,"IBA");
      System.out.println("Universcity Name "+S2.univer);
     System.out.println("Class Name "+S2.classname);
     System.out.println("Class In Students "+S2.studends);
    
    }
    
}
