public class MergeSort {
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSortHelper(arr, 0, arr.length - 1, temp);
    }

    public static void mergeSortHelper(int[] arr, int left, int right, int[] temp) {
        if (right > left) {
            int mid = (left + right) / 2;
            mergeSortHelper(arr, left, mid, temp);
            mergeSortHelper(arr, mid, right, temp);
            merge(arr, left, mid, right, temp);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        if (arr[left] > arr[mid]) {
            temp[left] = arr[right];
            temp[right] = arr[left];
            arr[right] = temp[right];
            arr[left] = temp[left];
        }
    }
}
