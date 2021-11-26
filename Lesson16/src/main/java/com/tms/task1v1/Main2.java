package com.tms.task1v1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите\n1 - вывести полный список товаров\n2 - добавить товар\n3 - ");
        Scanner console = new Scanner(System.in);
        Shop shop = new Shop();
        int i = console.nextInt();
        switch (i) {
            case 1:
                System.out.println("Выберите вариант сортировки\n1 - по цене(возрастание)\n2 - по цене(убывание)\n3 - по добавлению(сначала новые, потом более старые)");
                switch (console.nextInt()) {
                    case 1:
                        shop.printSortListMinToMaxPrice();
                        break;
                    case 2:
                        shop.printSortListMaxToMinPrice();
                        break;
                    case 3:
                        shop.printSortListBackOrder();
                        break;
                    default:
                        System.out.println("Необходимо ввести 1,2,3!");
                }
                break;
            case 2:
                System.out.println();
        }
    }
}
