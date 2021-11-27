package com.tms.task1v1;

import java.util.Scanner;

import static com.tms.task1v1.Helpers.consoleInt;

public class Application {
    public void start() {
        boolean flag = false;
        Shop shop = new Shop();
        Scanner console = new Scanner(System.in);
        while (!flag) {
            System.out.println("Введите\n1 - вывести полный список товаров\n2 - добавить товар\n3 - удалить товар\n4 - редактировать товар\n5 - выход");
            int i = consoleInt(console);
            switch (i) {
                case 1:
                    System.out.println("Выберите вариант сортировки\n1 - по цене(возрастание)\n2 - по цене(убывание)\n3 - по добавлению(сначала новые, потом более старые)");
                    printProductListVersions(shop, console);
                    break;
                case 2:
                    System.out.println("Введите id, наименование и цену добавляемого товара");
//                    try {
                    shop.addProductToList(new Product(consoleInt(console), console.next(), consoleInt(console)));
//                    } catch (IdException e) {
//                        System.out.println(e.getMessage());
//                    }
                    break;
                case 3:
                    System.out.println("Введите id товара для его удаления");
                    shop.removeProduct(consoleInt(console));
                    break;
                case 4:
                    System.out.println("Введите id редактируемого товара");
                    shop.changeParametersProduct(consoleInt(console));
                    break;
                case 5:
                    flag = true;
                    break;
                default:
                    System.out.println("Введите число от 1 до 5!");
            }
        }
    }

    private void printProductListVersions(Shop shop, Scanner console) {
        switch (consoleInt(console)) {
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
    }
}
