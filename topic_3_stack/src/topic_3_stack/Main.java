
package topic_3_stack;

/**
 *
 * @author kent ryan pagongpong
 */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
            
            
            Scanner scan = new Scanner(System.in);
            Stack stack = new Stack(5);
            
            
            
            
            
            System.out.println("Welcome to my stack system =) ");
            System.out.println("");
            
            while(true){
            System.out.println("What do you want to do? ");
            System.out.println("1. Push / Add ");
            System.out.println("2. Peek / Display");
            System.out.println("3. Pop / Remove  ");
            System.out.println("4. Leave");
            
            int choice =Integer.parseInt(scan.nextLine());
            
            
            
            // If the user wants to push a value in the stack
            if (choice == 1){
                
                
                System.out.println("How many times do you want to push");
                int howMany = Integer.parseInt(scan.nextLine());
                
               for(int i = 1;  i <= howMany; howMany--){
                
                System.out.println("What value do you want to push? ");
                int toPush = Integer.parseInt(scan.nextLine());
                stack.push(toPush);
                
               }
             // If the user wants to see what are the value/values in the stack
            }else if (choice == 2){
                
               System.out.println("Stack size is: " + stack.size());
               System.out.println("Top element is: " + stack.peek());
               System.out.println();
                
                
               // if the user wants to pop the value at the top of  the stack
            }else if(choice == 3){
                
                 System.out.println("Popped element: " + stack.pop());
                 System.out.println("Top element after pop: " + stack.peek());
                 System.out.println("Stack size after pop: " + stack.size());
                
                
                
            }else if(choice == 4){
                
                System.out.println("");
                System.out.println("Thank you for using my system =) ");
                break;
                
                
                
            }else{
                System.out.println("Invalid Try Again");
            }
                      
            
            }

}


}
