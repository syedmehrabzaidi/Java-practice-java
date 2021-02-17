/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2152021;

/**
 *
 * @author amanlab02
 */
class Train{
        String name;
        
        String trainno;
        int cabin;
        int seats;
        
void multiply(){ 
    if(cabin%2==0){
        System.out.println("Even");
    }else{
        System.out.println("odd");
    }

    
}
public class Main {

    /**
     * @param args the command line arguments
     */
    
}
    public static void main(String[] args) {
        // TODO code application logic here
    Train train1 = new Train();
    train1.name=" Millat Express";
    train1.trainno=" shgs7868";
    train1.cabin= 12;
    train1.multiply();
    Train train2=new Train();
    train1.seats= 71;
            train2.multiply();
      //  System.out.println("Train Detail");
//        System.out.println("Train Name"+train1.name);
//        System.out.println("Train Number"+train1.trainno);
//        System.out.println("Train Cabins " +train1.cabin);
//        System.out.println("Train in 1 cabin are seats " +train1.seats);
//        
    }
    
}
