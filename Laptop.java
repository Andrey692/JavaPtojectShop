package Shop;

public class Laptop {
    private String name;
    private int RAM;
    private int HDD;
    private String OS;
    private String color;

    public Laptop(String name, int RAM, int HDD, String OS, String color) {

        this.name = name;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    // private String getName() {
    // return name;
    // }

    // private int getRAM() {
    // return RAM;
    // }

    // private int getHDD() {
    // return HDD;
    // }

    // private String getOS() {
    // return OS;
    // }

    // private String getColor() {
    // return color;
    // }

    // private void setName(String name) {
    // this.name = name;
    // }

    // private void setRAM(int RAM) {
    // this.RAM = RAM;

    // }

    // private void setHDD(int HDD) {
    // this.HDD = HDD;
    // }

    // private void setOS(String OS) {
    // this.OS = OS;
    // }

    // private void setColor(String color) {
    // this.color = color;
    // }

    // переопределяем метод
    @Override
    public String toString() {
        return "Название ноутбука: " + name + ", " +
                "Оперативная память (ОЗУ): " + RAM + ", " +
                "Размер жесткого диска: " + HDD + ", " +
                "Операционная система: " + OS + ", " +
                "Цвет: " + color;
    }

}