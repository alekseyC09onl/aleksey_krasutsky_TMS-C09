import java.util.Arrays;

public class SortChoosen {
    public static void main(String[] args) {
        int[] array = new int[]{5, 9, 2, 7, 6, 0, 1};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
