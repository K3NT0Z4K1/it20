package topic_6_sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {
    public static void quickSort(ArrayList<Interger> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> NumsToSort = new ArrayList<Integer>();

        System.out.println("Merge Sorting ");

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

                (NumsToSort);

                System.out.println("Sorted ArrayList:");
                System.out.println(NumsToSort);

                break;
            }

        }

    }
}
