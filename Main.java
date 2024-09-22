
package arraylist;

import java.util.Scanner;
public class Main {

      public static void main(String[] args) {
		
          ItemManager list = new ItemManager();
           
           
        
        Scanner scan = new Scanner(System.in);


            System.out.println("Choose: ");
            System.out.println("1. Insert an Item ");
            System.out.println("2. Display all Item ");
            System.out.println("3. Update an Item ");
            System.out.println("4. Find an Item ");
            System.out.println("5. Delete an Item ");
            System.out.println("6. Exit ");
  
        
      String action = scan.nextLine();
                
                 
         if( action.equals("1")) {
           
           System.out.println("What is the item that you would like to add in the list? ");     
           String items = scan.nextLine();
           System.out.println();
           list.insertItem( items);
           System.out.println();
                     

        } else if( action.equals("2")){

            list.displayItems();
            System.out.println();
                     
        } else if( action.equals("3")){

            System.out.println("What is the index of the item that you want to update?");
            int item = Integer.parseInt(scan.nextLine());
            System.out.println(" And what is the replacement item? ");
            String repItem = scan.nextLine();
            list.updateItem(item, repItem);
            System.out.println();
                     
        } else if( action.equals("4")){

            System.out.println("What is the item that you want to find? ");
            String item = scan.nextLine();
            list.findItem(item);
            System.out.println();
                     
        } else if( action.equals("5")){

            System.out.println("What is the index of the item that you want to delete?");
            list.displayItems();
            int  index = Integer.parseInt(scan.nextLine()) ;
            list.deleteItem(index);
            System.out.println();
                     
        } else if( action.equals("6")){

            System.out.println("Thank you for using my system =) ");
            break;
                     
        } else {

        System.out.println("Invalid Choice ");
                     
    }    
       
                 
                 
  }
            
        
}
