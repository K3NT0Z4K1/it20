package topic_6_sorting;

import java.util.ArrayList;
import java.util.Scanner;
public class QuickSort {

    public static void quickSort(ArrayList<Integer> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); 

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);  
        int i = low - 1;  

        for (int j = low; j < high; j++) {
            if (arr.get(j) <= pivot) {
                i++;

                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;  
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> NumsToSort = new ArrayList<Integer>();

        System.out.println("Quick Sorting ");

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

                quickSort(NumsToSort, 0, NumsToSort.size() - 1);

                System.out.println("Sorted ArrayList:");
                System.out.println(NumsToSort);

                break;
            }

        }

    }
}
