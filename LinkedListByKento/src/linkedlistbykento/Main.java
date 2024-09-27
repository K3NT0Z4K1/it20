/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistbykento;

/**
 *
 * @author ITLAB1-PC14-STUDENT
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

          LinkedListByKento list = new LinkedListByKento();
          
          Scanner scan = new Scanner(System.in);
          
          
          System.out.println("Welcome to the linked List =)");
          System.out.println("Would you like to add an element to the list? (Yes or No) ");
          
          String answer = scan.nextLine();
          
          
           // Adding elements to the list
          if(answer.equals("Yes")) {
              
              
               for (int i = 0; i<= 3; i++){
              System.out.println("What elements would you like to add?");
              int element = Integer.parseInt(scan.nextLine());
              list.add(element);
              
              }
               System.out.println("Current Linked List: ");
               list.printList();
          }


//        // Adding elements to the list
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        System.out.println("Current Linked List:");
//        list.printList();
//        
//        //Delete
//        System.out.println();
//        System.out.println("Deleting 2 from the list...");
//        System.out.println("Current Linked List:");
//        list.deleteByValue(20);
//        list.printList();
//        
//        //Move/Swap Pointer
//        System.out.println();
//        System.out.println("Movingn/Swapping node from index 1 to index 0");
//        list.moveNodePointer(0, 1);
//        list.printList();


    }
    
}


