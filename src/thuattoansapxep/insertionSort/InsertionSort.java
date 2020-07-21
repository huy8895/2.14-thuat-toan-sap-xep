package thuattoansapxep.insertionSort;

public class InsertionSort {
    void sort(int[] array){
        int length = array.length;
        for (int i = 1; i < length; i ++){
            int key = array[i];
            int j = i -1;

            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j = j -1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[]array = { 12, 11, 13, 5, 6 };
        InsertionSort is = new InsertionSort();
        is.sort(array);
        for (Integer i: array)
            System.out.println(i);
    }
}
