package topic_2_linkedlist_int;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {

          LinkedListByKento list = new LinkedListByKento();
          
          Scanner scan = new Scanner(System.in);
          
          
          System.out.println("Welcome to the linked List =)");
          
          
          while(true){
          
          System.out.println("What do you want to do in the list ? ");
          System.out.println("1. Add");
          System.out.println("2. Delete");
          System.out.println("3. Move/Swap");
          System.out.println("4. Display");
          System.out.println("5. Exit ");
          
          String answer = scan.nextLine();
          
          
          
          //  Adding elements to the list
          if(answer.equals("1")){
              for(int i = 0; i <= 0; i++){
               System.out.println("What elements would you like to add?");
              int eltoadd = Integer.parseInt(scan.nextLine());
              list.add(eltoadd);
              
              
              }
               for (int i = 0; i < 5 ; i++ ){
              System.out.println("Would you still want to add an element?");
              String ans = scan.nextLine();
             
              if(ans.equals("Yes")){
                  System.out.println("");
                  int eltoadd = Integer.parseInt(scan.nextLine());
              list.add(eltoadd);
              }else{
                  break;
              }
              }
              // Delete
          } else if(answer.equals("2")){
              
              System.out.println("What element would you like to delete?");
               int eltodele = Integer.parseInt(scan.nextLine());
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
              g
              System.out.println("Thank you");
              break;
               
              
              
          }else{
              System.out.println("heheheheh");
              
          }



    }
    
}
}

