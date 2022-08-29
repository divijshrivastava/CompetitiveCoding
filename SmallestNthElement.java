
public class SmallestNthElement {
//This solution won't work for duplicates.
    public static void main(String[] args) {

        int[] arr = new int[] { 4, 9, 10, 2, 5, 7 };
        int smallNum = 3;
        for (int i = 0; i < smallNum; i++) {

            int minIndex = findMin(arr, i);
            swap(minIndex, i, arr);

        }

        System.out.println(arr[smallNum - 1]);

    }

    private static void swap(int index1, int index2, int[] arr) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int findMin(int[] arr, int startIndex) {
        int minIndex = startIndex;
        int min = arr[minIndex];
        for (int i = startIndex; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
