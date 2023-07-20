import java.util.*;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 6, 3, 5, 2, 9 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        // This method implements the selection sort algorithm to sort the array.

        // The outer loop iterates from the beginning of the array up to the second-to-last element.
        for (int i = 0; i < arr.length; i++) {
            // Find the index of the maximum element in the unsorted part of the array.
            int last = arr.length - i - 1; // Index of the last element in the unsorted part
            int maxIndex = getMax(arr, 0, last);

            // Swap the maximum element with the last element of the unsorted part.
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        // This method swaps two elements in the array given their indices.

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int[] arr, int start, int last) {
        // This method finds the index of the maximum element in the array within a specific range.

        int max = start; // Initialize the max index to the starting index

        // Loop through the array elements from start to last
        for (int i = start + 1; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i; // Update max index if a larger element is found
            }
        }

        return max;
    }
}
