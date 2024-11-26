package topic_6_sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(ArrayList<Integer> arr) {
        int n = arr.size();  
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = arr.get(minIndex); 
            arr.set(minIndex, arr.get(i)); 
            arr.set(i, temp); 
        }
    }

    

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> NumsToSort = new ArrayList<Integer>();

        System.out.println("Selection Sorting ");

        System.out.println("How many numbers you want to sort?");
        int nums = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= nums; i++) {

            System.out.println("Enter the number you want to sort");
            int num = scan.nextInt();
            NumsToSort.add(num);

            if (nums == i) {

                System.out.println("Original ArrayList:");
                System.out.println(NumsToSort);
                
                selectionSort(NumsToSort);


                System.out.println("Sorted ArrayList:");
                System.out.println(NumsToSort);

                break;
            }

        }

    }
}
