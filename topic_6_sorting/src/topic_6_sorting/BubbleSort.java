package topic_6_sorting;

import java.util.Scanner;
import java.util.ArrayList;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> NumsToSort = new ArrayList<String>();

        System.out.println("How many numbers you want to sort?");
        int nums = scan.nextInt();
        scan.nextLine();
        
        for(int i = 1; i <=  nums; i++){
            
            System.out.println("Enter the number you want to sort");
            String num = scan.nextLine();
            NumsToSort.add(num);
            
            
        }

//        int[] arr = {64, 34, 25, 12, 22, 11, 90};
//        System.out.println("Original array:");
//        printArray(arr);
//
//        bubbleSort(arr);
//
//        System.out.println("Sorted array:");
//        printArray(arr);
    }
}
