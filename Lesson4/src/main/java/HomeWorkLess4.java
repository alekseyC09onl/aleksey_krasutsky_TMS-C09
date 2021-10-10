import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLess4 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
//        omeba();
//        System.out.println("Результат произведения будет: " + summ(0, -7));  //исправлено
//        printTreygolnik();
//        kolCifr(92185); //исправлено
//        nechetChisla();
//        indexMax();
//        arrayNull();
//        changeMax();
//        repeatElArray(); //исправлено
//        printArray();
    }


    //        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    private static void omeba() {
        System.out.println("Жила-была 1 омеба...");
        int count = 1;
        for (int i = 3; i <= 24; i += 3) {
            count *= 2;
            System.out.printf("Через %d часа(ов) их будет уже %d.\n", i, count);
        }
    }


    //        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    private static int summ(int a, int b) {
        int result = 0;
        if ((a < 0) && (b > 0)) {
            for (int i = 1; i <= Math.abs(a); i++) {
                result += b;
            }
            result = result - result - result;
        } else if ((a > 0) && (b < 0)) {
            for (int i = 1; i <= Math.abs(b); i++) {
                result += a;
            }
            result = result - result - result;
        } else if ((a < 0) && (b < 0)) {
            for (int i = 1; i <= Math.abs(b); i++) {
                result += Math.abs(a);
            }
        } else if ((a == 0) || (b == 0)) {
            result = 0;
        } else {
            for (int i = 1; i <= b; i++) {
                result += a;
            }
        }
        return result;
    }


    //        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

    //        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    private static void printTreygolnik() {
        String[][] array = new String[4][4];
        System.out.println("Выберите вариант треугольника: a, b, c, d.");
        boolean exit = false;
        while (!exit) {
            String variant = console.nextLine();
            switch (variant) {
                case "b":
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j <= i; j++) {
                            array[i][j] = "* ";
                            System.out.print(array[i][j]);
                        }
                        System.out.println();
                    }
                    exit = true;
                    break;
                case "d":
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j <= array[i].length - 1 - i; j++) {
                            array[i][j] = "* ";
                            System.out.print(array[i][j]);
                        }
                        System.out.println();
                    }
                    exit = true;
                    break;
                case "c":
                    for (int i = array.length - 1; i >= 0; i--) {
                        for (int j = array.length - 1; j >= 0; j--) {
                            if (i >= j) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    exit = true;
                    break;
                case "a":
                    for (int i = array.length - 1; i >= 0; i--) {
                        for (int j = 0; j <= array[i].length - 1; j++) {
                            if (i <= j) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    exit = true;
                    break;
                default:
                    System.out.println("Выберите один из предложенных вариантов!");
            }
        }
    }


    //        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    private static void kolCifr(int chis) {
//        int count = 0;
//        if (chis > 0) {
//            while (chis != 0) {
//                chis /= 10;
//                count++;
//            }
//            System.out.printf("Ваше число положительное и состоит из %d цифр.", count);
//        } else if (chis < 0) {
//            while (chis != 0) {
//                chis /= 10;
//                count++;
//            }
//            System.out.printf("Ваше число отрицательное и состоит из %d цифр.", count);
//        } else {
//            System.out.println("Ваше число 0.");
//        }
        if (chis > 0) {
            System.out.printf("Ваше число положительное и состоит из %d цифр.", countNum(chis));
        } else if (chis < 0) {
            System.out.printf("Ваше число отрицательное и состоит из %d цифр.", countNum(chis));
        } else {
            System.out.println("Ваше число 0.");
        }
    }

    private static int countNum(int chis) {
        int count = 0;
        while (chis != 0) {
            chis /= 10;
            count++;
        }
        return count;
    }


    //        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    private static void nechetChisla() {
        int count = 0;
        for (int i = 1; i < 100; i += 2) {
            count += 1;
        }
        int[] array = new int[count];
        int chis = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = chis;
            chis += 2;
        }
        System.out.println(Arrays.toString(array));
//        int[] array2 = new int[count];
//        for (int i = 0; i < array2.length; i++) {             //без сортировки
//            array2[i]=array[array.length-1-i];
//        }
//        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array.length; i++) {                // сортировка выбором
            int max = array[i];
            int maxId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxId = j;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxId] = temp;
        }
        System.out.println(Arrays.toString(array));
    }


//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    private static void indexMax() {
        int[] mass = new int[12];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 16);
        }
        System.out.println(Arrays.toString(mass));
        int max = 0;
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= max) {
                max = mass[i];
                index = i;
            }
        }
        System.out.printf("Максимальный элемент %d, индекс его последнего вхождения в массив = %d.", max, index);
    }


    //        7) Создайте массив размера 20, заполните его случайными целыми числами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    private static void arrayNull() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }


    //        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    private static void changeMax() {
        int[] array = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                index = i;
            }
        }
        int temp = array[0];
        array[0] = array[index];
        array[index] = temp;
        System.out.println(Arrays.toString(array));
    }


    //        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    private static void repeatElArray() {
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 21);
        }
        System.out.println(Arrays.toString(array));
//        System.out.println();
        boolean exit = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (!exit) {
                        System.out.print("Массив имеет повторяющиеся элементы: ");
                        System.out.print(array[i] + "; ");
                        exit = true;
                        break;
                    } else if (exit) {
                        System.out.print(array[i] + "; ");
                        break;
                    }
                }
            }
        }
        if (exit == false) {
            System.out.print("Массив не имеет повторяющихся элементов.");
        }
    }


    //        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

    private static void printArray() {
        System.out.println("Введите размерность матрицы");
        int size = console.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 51);
                if (array[i][j] < 10) {
                    System.out.print(array[i][j] + "  ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        int[][] array2 = new int[size][size];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];
                System.out.print(array2[i][j] < 10 ? array2[i][j] + "  " : array2[i][j] + " ");
            }
            System.out.println();
        }


    }


}







