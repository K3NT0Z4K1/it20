package topic_6_sorting;

import java.util.Scanner;
import java.util.ArrayList;

public class BubbleSort {

    public static void bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> NumsToSort = new ArrayList<Integer>();
        
        System.out.println("Bubble Sorting ");

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

                bubbleSort(NumsToSort);

                System.out.println("Sorted ArrayList:");
                System.out.println(NumsToSort);

                break;
            }

        }

    }
}
