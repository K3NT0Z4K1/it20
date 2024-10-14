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
public class Main {

    
    public static void main(String[] args) {
     	
		
		 Queue customerQueue = new Queue();
		 
		 // Adding customers to the queue
	     customerQueue.enqueue(new Customer("Cliff"));
	     customerQueue.enqueue(new Customer("Janoi"));
	     customerQueue.enqueue(new Customer("Redd"));
	     
	   

	}

}