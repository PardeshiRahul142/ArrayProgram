public class PIVOTAPP {
    public static void main(String[] args) {
        int[] arr = {9, 12, 3, 5, 14, 10, 10};
        int pivot = 10;

        partitionArray(arr, pivot);

        // Print final array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void partitionArray(int[] arr, int pivot) {
        int low = 0;              // for elements < pivot
        int mid = 0;              // for elements == pivot
        int high = arr.length - 1; // for elements > pivot

        while (mid <= high) {
            if (arr[mid] < pivot) {
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else { // arr[mid] > pivot
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
