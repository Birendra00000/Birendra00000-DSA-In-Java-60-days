public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        sort(arr, 0, arr.length - 1);
System.out.println("\nSorting array is:");
        for (int num : arr) System.out.print(""+ num + " ");
    }

    static void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            temp[k++] = a[i] < a[j] ? a[i++] : a[j++];

        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];

        for (int x = 0; x < temp.length; x++)
            a[l + x] = temp[x];
    }
}
