package topic_6_sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            return;
        }

        int mid = arr.size() / 2;

        ArrayList<Integer> left = new ArrayList<>(arr.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    public static void merge(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                arr.set(k++, left.get(i++));
            } else {
                arr.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            arr.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            arr.set(k++, right.get(j++));
        }
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

                mergeSort(NumsToSort);

                System.out.println("Sorted ArrayList:");
                System.out.println(NumsToSort);

                break;
            }

        }

    }
}
