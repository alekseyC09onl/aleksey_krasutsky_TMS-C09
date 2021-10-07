import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] array=new int[]{5,9,2,7,6,0,1};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
