public class QuickSort {

//PARTITION FUNCTION------------------
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

// QUICKSORT FUNCTION
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
//EXAMPLE 1
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        System.out.println("EX 1: Quick Sort Algorithm -Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
//            Output:
//            1 3 4 7 9
        }

//EXAMPLE 2
        int[] arr2 = {2, 1, 6, 10, 4, 1, 3, 9, 7};
        int n2 = arr2.length;

        quickSort(arr2, 0, n2 - 1);

        System.out.println("\nEX 2: Quick Algorithm -Sorted array:");
        for (int num : arr2) {
            System.out.print(num + " ");
//            Output:
//            1 1 2 3 4 6 7 9 10
        }
    }
}
