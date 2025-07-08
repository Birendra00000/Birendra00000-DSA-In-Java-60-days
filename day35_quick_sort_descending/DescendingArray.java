public class DescendingArray {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);    // Left side
            quickSort(arr, pivotIndex + 1, high);   // Right side
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) { // Change to '>' for descending
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot to correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 2, 1, 8, 6, 3, 5, 4 };

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\n" +"Sorted in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
