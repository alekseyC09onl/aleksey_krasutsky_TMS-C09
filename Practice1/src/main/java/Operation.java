public class Operation {
    public static void main(String[] args) {

        Operationable operationable = (int a, int b) -> a + b;

        System.out.println(operationable.calculate(10, 20));
    }
}
