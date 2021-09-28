import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner klava=new Scanner(System.in);
        int[] array= {5,9,3,-4,-6,-2,0,8,984};
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}


