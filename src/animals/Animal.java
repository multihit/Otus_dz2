package animals;

import validators.DataValidator;

import java.util.Scanner;
import java.util.regex.Pattern;



public abstract class Animal {
    private String name;
    private int weight;
    private String color;
    private int age;
    private DataValidator dataValidator = new DataValidator();
    private DataValidator commandValidator = new DataValidator();


    //проверка возраста/веса
    private int getAgeWeightData(Scanner scanner) {
        int data;
        while (true) {
            String ageStr = scanner.next();
            if (dataValidator.isDataByRegExp(ageStr, Pattern.compile("^\\d+$"))) {
                data = Integer.parseInt(ageStr);
                if (data > 50 || data <= 0) {
                    System.out.println("Ошибка, не удовлетворяет условию ( 0 до 50 кг/лет)");
                    continue;
                }
                break;
            }
            System.out.println("Ошибка, не удовлетворяет условию (0 до 50 кг/лет)");
        }
        return data;
    }


    public void setAge(Scanner scanner) {
        this.age = this.getAgeWeightData(scanner);
    }

    public int getAge() {
        return age;
    }


    public void setWeight(Scanner scanner) {
        this.weight = this.getAgeWeightData(scanner);
    }

    public int getWeight() {
        return weight;
    }


    //проверка имени/цвета на ввод
    private String getNameColor(Scanner scanner) {

        StringBuilder str;
        while (true) {
            String nameStr = scanner.next();

            if (commandValidator.isDataByRegExp(nameStr, Pattern.compile("^[а-яА-Я]+$"))) {
                str = new StringBuilder(nameStr);
                break;
            }

            System.out.println("Вы ввели неверное имя|цвет животного (только ру алфавит)");
        }

        return String.valueOf(str);
    }

    public void setName(Scanner scanner) {
        this.name = this.getNameColor(scanner);
    }

    public String getName() {
        return name;
    }

    public void setColor(Scanner scanner) {
        this.color = this.getNameColor(scanner);
    }

    public String getColor() {
        return color;
    }

    public abstract void say();


    public void go() {
        System.out.println("я иду");
    }


    public void drink() {
        System.out.println("я пью");
    }


    public void eat() {
        System.out.println("я ем");
    }


    @Override
    public String toString() {
        String yearPadej = getYearPadej();
        if (yearPadej == null) {
            return "Возраст введен неверно";
        }

        return String.format("Привет! меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s",
                getName(), getAge(), yearPadej, getWeight(), getColor());
    }

    //падеж окончаний возраста
    private String getYearPadej() {

        if (getAge() > 50) {
            return null;
        }

        if (getAge() >= 11 && getAge() <= 19) {
            return "лет";
        }

        int oststok = getAge() % 10;
        if (oststok == 0 || oststok >= 5) {
            return "лет";
        }

        if (oststok == 1) {
            return "год";
        }


        return "года";

    }

}
