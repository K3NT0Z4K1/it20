/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_4_queue;

/**
 *
 * @author ITLAB2-PC14-pagongpong
 */
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
     	
		
		 Queue customerQueue = new Queue();
                 
		 Scanner scan = new Scanner(System.in);
                 
                 
                 
                 System.out.println("Welcome to my queue system with scanner UI");
                 System.out.println("");
                 System.out.println("What do you want to do in the queue?");
                 System.out.println("1. Enqueue");
                 System.out.println("2. Dequeue");
                 System.out.println("3. Display");
                 
                 String choice = scan.nextLine();
                 
                 if(choice.contentEquals("1")){
                     System.out.println("What do you want to add in the queue?");
                     String toAdd = scan.nextLine();
                     customerQueue.enqueue(new Customer(toAdd));
                     
                    
                     
                 }
                 
                 else if(choice.contentEquals("2")){
                     
                 }
                 
                 else  if(choice.contentEquals("3")){
                     
                 }
                 
                 else if(choice.contentEquals("4")){
                     
                 }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
		 // Adding customers to the queue
	     customerQueue.enqueue(new Customer("Cliff"));
	     customerQueue.enqueue(new Customer("Janoi"));
	     customerQueue.enqueue(new Customer("Redd"));
	     
	     System.out.println();
	     customerQueue.displayQueue();
	     
	     // Serve 
	     customerQueue.dequeue();
	     
	     System.out.println();
	     customerQueue.displayQueue();


	}

}