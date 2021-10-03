import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {

        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
//        printArray();
//        System.out.println(operation(1));
//        System.out.println(operation(0));
//        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
//        calculateSumOfDiagonalElements();
//        countDevs(103);
//        foobar(6);
//        foobar(10);
//        foobar(15);
//        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        int kolMassiv = console.nextInt();
        int[] array = new int[kolMassiv];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 201) - 100);
        }
        System.out.println(Arrays.toString(array));
    }


    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            return number + 1;
        } else if (number < 0) {
            return number - 2;
        } else {
            return 10;
        }
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        String programmers = null;
        if ((count >= 10 && count <= 20) || (count % 100 >= 10 && count % 100 <= 20)) {
            programmers = "программистов";
        } else if (count % 10 == 1) {
            programmers = "программмист";
        } else if ((count % 10 >= 2) && (count % 10 <= 4)) {
            programmers = "программиста";
        } else {
            programmers = "программистов";
        }
        System.out.println(count + " " + programmers);
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println("foobar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        }else {
            System.out.println("данное число не подходит ни к одному условию");
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        int summa = 0;
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
//            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int) ((Math.random()*6));
//                System.out.print(array[i][j]+" ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i][i];
        }
        System.out.println(summa);
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        int firstChislo=console.nextInt();
        int secondChislo=console.nextInt();
        int[][] array=new int[firstChislo][secondChislo];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=(int)(Math.random()*100);
                System.out.print(array[i][j] + " ");
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 3 == 0) {
                    array[i][j]=200;
                } else if (array[i][j] % 7 == 0) {
                    array[i][j]=300;
                } else {
                    array[i][j]=400;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }


    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        int count=0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    count++;
                    j=2;
                    if (count>=3){
                        count = 0;
                        i++;
                        break;
                    }
                }
            }
        }
    }
}