package sort_algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] intArray = {35, 20, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) { // length = 7
            System.out.println(intArray[i]);
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) { // first  divide in arrays on max length 2

        if (end - start < 2) { // we stop when we have an array in max length 2
            return;
        }

        int mid = (start + end) / 2; // it will act as end variable in next iteration
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
        // it is not call directly bcse mergeSort next the aray length inferior of 2 to exist for the recursion
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        // the had a array of length 2 and we swap the two result to have them properly ordered
        // first step assign the bigger number
        // second step assign the smaller number
        System.arraycopy(input, i, input, start + tempIndex, mid - i); //   bigger number left at the end bcse it is always the last item in the array so it assigb it back at then end of the array
        System.arraycopy(temp, 0, input, start, tempIndex); // array saved in tmpArray that we reassign in order


    }
}
