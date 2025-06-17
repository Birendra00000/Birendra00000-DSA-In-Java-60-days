package day11;

public class InsertionSort {

    public static void printInsertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " number is " + arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = {4, 1, 8, 5, 10};

        // Insertion Sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // shifting elements greater than current
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // placing current at correct position
            arr[j + 1] = current;
        }

        printInsertionSort(arr);
    }
}
