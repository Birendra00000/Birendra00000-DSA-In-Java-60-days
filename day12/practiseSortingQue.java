package day12;

public class practiseSortingQue {

    // public static void printArr(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println(); // for better formatting
    // }

     public static void printSelectionSort(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " word is " + arr[i]);
        }
    }

    public static void main(String[] args) {
    //     int arr[] = {1, 9, 6, 3, 7, 8};
    //     int swapCount = 0;

    //     // Bubble Sort with swap counter
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 // swap
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;

    //                 swapCount++; // increment the swap count
    //             }
    //         }
    //     }

    //     System.out.print("Sorted array: ");
    //     printArr(arr);
    //     System.out.println("Total swaps: " + swapCount);
    // }


    //* Sort an array of strings alphabetically using selection sort.

    // Input: ["banana", "apple", "cherry", "date"]

    // Output: ["apple", "banana", "cherry", "date"]  */


    String arr[]={"apple","zoo","x-ray","cat"};

    //Selection sorting

  for(int i=0;i<arr.length-1;i++){
        int smallest=i;
        for(int j=i+1 ; j<arr.length;j++){
            if(arr[j].compareTo(arr[smallest])<0){
                smallest=j;
            }
        }
      String temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
System.out.println("Sorted strings alphabetically using selection sort: ");
        printSelectionSort(arr);
    }



}

