package Shop;

import java.util.Objects;

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

    // переопределяем метод hashCode (только для ссылочных типов данных)
    @Override
    public int hashCode() {
        return Objects.hash(name, RAM, HDD, OS, color); // Objects это класс
        // Object это тип
    }

    // переопределяем метод equals (только для ссылочных типов данных)
    @Override
    public boolean equals(Object obj) { // добаляем стандартные проверки:
        if (this == obj) // сравниваем с самим собой
            return true; //
        if (obj == null || getClass() != obj.getClass())// null - пустая ссылка,классы объектовgetClass неравны
            return false; //

        Laptop lap = (Laptop) obj; // создаем переменную lap (для преобразования obj в тип Laptop)
        // и добавляем логические выражения сравнения пяти полей, которые должны быть
        // равны:
        return name.equals(lap.name) && // тип String сравниваем через equals
                RAM == lap.RAM && // сравниваем значения RAM (тип int)
                HDD == lap.HDD && // сравниваем значения RAM (тип int)
                OS.equals((lap.OS)) && // тип String сравниваем через equals

                color.equals((lap.color)); // тип String сравниваем через equals
    }

    // переопределяем метод
    @Override
    public String toString() {
        return "Название : " + name + ", " +
                "RAM: " + RAM + ", " +
                "HDD: " + HDD + ", " +
                "ОС: " + OS + ", " +
                "Цвет: " + color;
    }

}