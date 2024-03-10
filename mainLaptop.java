// -Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в
// java.
// -Создать множество ноутбуков.
// -Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и
// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// -Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
// можно также в Map.
// -Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Shop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class mainLaptop {
    public static void main(String[] args) {
        Laptop L01 = new Laptop("Aser", 8, 128, "Windows10", "grey");
        Laptop L02 = new Laptop("Asus", 8, 128, "Windows11", "black");
        Laptop L03 = new Laptop("HP", 8, 128, "Windows10", "grey");
        Laptop L04 = new Laptop("Asus", 8, 128, "Windows11", "blue");
        Laptop L05 = new Laptop("HP", 8, 128, "Windows10", "black");
        Laptop L06 = new Laptop("Honor", 12, 256, "Windows11", "grey");
        Laptop L07 = new Laptop("HP", 12, 256, "Windows10", "black");
        Laptop L08 = new Laptop("Honor", 12, 256, "Windows11", "grey");
        Laptop L09 = new Laptop("HP", 12, 256, "Windows10", "blue");
        Laptop L10 = new Laptop("Huawei", 12, 512, "Windows11", "black");
        Laptop L11 = new Laptop("HP", 16, 512, "Windows10", "grey");
        Laptop L12 = new Laptop("Aser", 32, 1024, "Windows11", "black");
        Laptop L13 = new Laptop("Asus", 16, 512, "Windows10", "grey");
        Laptop L14 = new Laptop("HP", 16, 512, "Windows11", "blue");
        Laptop L15 = new Laptop("HP", 16, 512, "Windows11", "blue");

        // cоздаем множество и добавляем в него все ноутбуки
        Set<Laptop> laptops = new HashSet<>(
                Arrays.asList(L01, L02, L03, L04, L05, L06, L07, L08, L09, L10, L11, L12, L13, L14, L15));
        for (Laptop el : laptops) { // перебираем коллекцию laptops
            System.out.println(el);
        }
        System.out.printf("Колличество уникальных ноутбуков: %d \n", laptops.size());

        // Считываем с консоли параметры для фильтрации
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбор ноутбука по двум параметрам: 1. объем оперативной памяти: ");
        int RAMuser = sc.nextInt();

        System.out.println("2. объем жеского диска: ");
        int HDDuser = sc.nextInt();

        // Проверка на корректность ввода
        if ((RAMuser >= 33) || (HDDuser >= 1024)) {
            System.out.println("Некорректный ввод!!!");
        }

        // Фильтрация ноутбуков и вывод в консоль
        for (Laptop el : laptops) {
            if ((el.getRAM() >= RAMuser) && (el.getHDD() >= HDDuser)) {
                System.out.println(el.toString());
            }
        }
        sc.close();
    }

}