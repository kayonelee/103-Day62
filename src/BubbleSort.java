public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // COMPARE, IF ARR J IS GREATER-SWAP
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
//EXAMPLE 1------------------------------
        int[] arr = {4, 1, 3, 9, 7};
        bubbleSort(arr);
        System.out.println("Ex 1 Bubble Sort Algorithm-Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
//EXAMPLE 2 ----------------------------
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubbleSort(arr2);
        System.out.println("\nEx 2 Bubble Sort Algorithm-Sorted array:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
//COMPARES ADJACENT ELEMENTS AND SWAP IF THEY
// ARE IN THE WRONG ORDER-ASCENDING

