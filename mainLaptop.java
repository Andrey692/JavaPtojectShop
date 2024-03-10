package Shop;

import java.util.Arrays;
import java.util.HashSet;
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
        Laptop L12 = new Laptop("Aser", 16, 512, "Windows11", "black");
        Laptop L13 = new Laptop("Asus", 16, 512, "Windows10", "grey");
        Laptop L14 = new Laptop("HP", 16, 512, "Windows11", "blue");
        Laptop L15 = new Laptop("HP", 16, 512, "Windows11", "blue");

        Set<Laptop> laptops = new HashSet<>(
                Arrays.asList(L01, L02, L03, L04, L05, L06, L07, L08, L09, L10, L11, L12, L13, L14, L15));

        for (Laptop el : laptops) { // перебираем коллекцию laptops
            System.out.println(el);

        }

    }

}