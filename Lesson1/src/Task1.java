public class Task1 {
    public static void main(String[] args) {
        int count=0;
        for (String arg : args) {
            int i= Integer.parseInt(arg.trim());
            if (i>0){
                count++;
            }
        }
        System.out.println("Количество положительных чисел = "+count);
    }
}


