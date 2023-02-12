import java.util.Arrays;

public class SettingSortAlgorithm {
    private static void insertionSort(int[] array){
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,5,2,3,4,8,9,7,10,6};
        System.out.println("Mảng ban đầu : " + Arrays.toString(array) );
        insertionSort(array);
        System.out.println("Mảng lúc sau : " + Arrays.toString(array) );
    }
}
