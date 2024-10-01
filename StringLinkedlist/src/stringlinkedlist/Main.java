/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlinkedlist;

/**
 *
 * @author ITLAB1-PC14-STUDENT
 */
import java.util.Scanner;
public class Main {
    


	public static void main(String[] args) {
		
		StringLinkedlist list = new StringLinkedlist();
                Scanner scan = new Scanner(System.in);
                
                 while(true){
                
                System.out.println("Welcome to String Linked List");
                System.out.println("What do you want to do in the list?");
                System.out.println("1. Add ");
                System.out.println("2. Delete ");
                System.out.println("3. Move / Swap ");
                System.out.println("4. Display ");
                
                
                
                 String answer = scan.nextLine();
          
         
          
          //  Adding elements to the list
          if(answer.equals("1")){
              for(int i = 0; i <= 0; i++){
               System.out.println("What elements would you like to add?");
              String eltoadd = scan.nextLine();
              list.add(eltoadd);
              System.out.println("Current Linked List:");
              System.out.println("------------------------------");
              list.printList();
              
              
              }
               for (int i = 0; i < 5 ; i++ ){
              System.out.println("Would you still want to add an element?");
              String ans = scan.nextLine();
             
              if(ans.equals("Yes")){
                  System.out.print("Enter the element that you want to add");
                  String eltoadd = scan.nextLine();
              list.add(eltoadd);
              }else{
                  list.printList();
                  break;
              }
              }
              // Delete
          } else if(answer.equals("2")){
              
              System.out.println("What element would you like to delete?");
               String eltodele = scan.nextLine();
               list.deleteByValue(eltodele);
              
              
               // Move or Swap
          }else if(answer.equals("3")){
              
              System.out.println("What is the fist element would you like to move/swap?");
              int eltoMoveorSwap1 = Integer.parseInt(scan.nextLine());
              System.out.println("What is the second element would you like to move/swap?");
              int eltoMoveorSwap2 = Integer.parseInt(scan.nextLine());
              
              list.moveNodePointer(eltoMoveorSwap2, eltoMoveorSwap2);
              list.printList();
          }else if(answer.equals("4")){
              
             list.printList();
             
          }else if(answer.equals("5")){
              
              System.out.println("Thank you");
              break;
               
              
              
          }else{
              System.out.println("heheheheh");
              
          
//        //Delete
//        list.deleteByValue("Joe Lamont - Victims of Love");
//        System.out.println();
//        System.out.println("Deleting |Joe Lamont - Victims of Love| from the list...");
//        System.out.println();
//        System.out.println("Current Linked List:");
//        System.out.println("------------------------------");
//        list.printList();
//        
//        //Move/Swap Pointer
//        System.out.println();
//        System.out.println("Moving/Swapping node from index 1 to index 0");
//        System.out.println();
//        System.out.println("Current Linked List:");
//        System.out.println("------------------------------");
//        list.moveNodePointer(0, 1);
//        list.printList();
	}

}

        }
}
