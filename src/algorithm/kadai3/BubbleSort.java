package algorithm.kadai3;

public class BubbleSort {
    /**
     * バブルソートのメソッドです.
     *
     * @param array ソートしたい配列
     */
    public static void bubbleSort(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = true;
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = false;
                }
            }
            if (swapped == true)
                break;
        }
    }
}
