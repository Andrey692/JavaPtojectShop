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
                HDD == lap.HDD &&
                OS.equals((lap.OS)) &&
                color.equals((lap.color));
    }

    // переопределяем метод
    @Override
    public String toString() {
        return "(Название: " + name + "), " +
                "(RAM:" + RAM + "), " +
                "(HDD:" + HDD + "), " +
                "(ОС: " + OS + "), " +
                "(Цвет: " + color + ")";
    }

    int getRAM() {
        return this.RAM;
    }

    int getHDD() {
        return this.HDD;
    }

}
