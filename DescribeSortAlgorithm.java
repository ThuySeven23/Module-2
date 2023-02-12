import java.util.Arrays;

public class DescribeSortAlgorithm {
    private static void insertionSort(int[] array){
        int temp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]){
                    System.out.println(array[j-1] + " < " + array[j]);
                    System.out.println("Thực hiện hoán đổi");
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
        int[] array = {10,4,6,8,2,18,16,9,25,39,33,28,55,42,74,66,80};
        System.out.println("Mảng ban đầu : " + Arrays.toString(array) );
        insertionSort(array);
        System.out.println("Mảng lúc sau : " + Arrays.toString(array) );

    }



}
