
package arraylist;


import java.util.ArrayList;

public class ItemManager {
	
     private ArrayList<String> items;

  
    // Constructor to initialize the ArrayList
    public ItemManager() {
        items = new ArrayList<>();
    }
    
    // Display
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }
    
    // Insert Item
    public void insertItem(String item) {
        items.add(item);
        System.out.println("Added " + item + " in the list");
    }
    
    // Update via index
    public void updateItem(int index, String newItem) {
    	if(index >= 0 && index < items.size()) {
    		String oldItem = items.set(index, newItem);
    		System.out.println("Updated: " + oldItem + " to " + newItem);
    	} else {
    		System.out.println("Index out of bounds");
    	} 	
    }
    
    // Find
    public int findItem(String item) {
        int index = items.indexOf(item);
        if (index != -1) {
            System.out.println("Found: " + item + " at index " + index);
        } else {
            System.out.println(item + " not found.");
        }
        return index;
    }
    
    // Delete
    public void deleteItem(int index) {
        
        if (index >= 0 && index < items.size()) {
            String removedItem = items.remove(index);
            System.out.println("Deleted: " + removedItem);
        } else {
            System.out.println("Index out of bounds.");
        }
    }
    
}