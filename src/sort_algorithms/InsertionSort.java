package sort_algorithms;

public class InsertionSort {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

//        for  firstUnsortedIndex = 0, it is already sorted as it is length = 1 array
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
             firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            // decide if we have to swao or not
            // intArray[i - 1] > newElement it will be the crux on the algo
            // this loop give us the index 'i' where to store the ordered value but 'i' will give also the size of the working array
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            // if element is indeeed inferior: no loop then it is the same as line 10 ==> it is then useless
            intArray[i] = newElement;
        }





        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}
