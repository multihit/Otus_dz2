package animals;

import validators.NumberValidator;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Animal {
    private String name;
    private int weight;
    private String color;
    private int age;
    private NumberValidator numberValidator = new NumberValidator();


    //методы


    public void setAge(Scanner scanner) {
        int animalAge;
        while (true){
            String ageStr = scanner.next();
            if (numberValidator.isNumber(ageStr, Pattern.compile("^\\d+$"))){
                animalAge = Integer.parseInt(ageStr);
                if (animalAge >50 || animalAge<=0){
                    System.out.println("Ошибка возраста, введите возраст вновь");
                    continue;
                }
                break;
            }
            System.out.println("Ошибка возраста, введите возраст вновь");
        }
        this.age = animalAge;
    }

    public int getAge() {
        return age;
    }


    public void setWeight(Scanner scanner) {
        int animalWeight;
        while (true){
            String ageStr = scanner.next();
            if (numberValidator.isNumber(ageStr, Pattern.compile("^\\d+$"))){
               animalWeight  = Integer.parseInt(ageStr);
                if (animalWeight >50 || animalWeight<=0){
                    System.out.println("Ошибка веса, введите вес заново");
                    continue;
                }
                break;
            }
            System.out.println("Ошибка веса, введите вес заново");
        }
            this.weight = animalWeight;
        }


    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

//    private void print(String str) {
//        System.out.println(str);
//    }

//    public void getInfo() {
//        print("Привет! меня зовут" + getName() + " " + getAge() + " " + getWeight() + " " + getColor());
//    }

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


//    public boolean  setName(Scanner scanner) {
//       String nameStr = null;
//        while (true) {
////            String nameStr = scanner.next();
//            name = scanner.next().toUpperCase().trim();
//            if (name != null && name.matches("^[а-яА-Я]+$")) {
//                System.out.println("Имя может содержать только буквы, введите имя заново");
//
//                continue;
//            }
//break;
//        }
//        System.out.println("Имя может содержать только буквы");
//
//            this.name = nameStr;
//        return false;
//    }



//    public void setName(String name) {
//        public void setName(String name) {
//            while (true) {
//                if (!name.matches("[а-яА-Я]+")) {
//                    System.out.println("имя не верно, введите буквы");
//                    continue;
//                }
//                break;
//            }
//             this.name = name;
//        }


    public void setName(String name) {
        this.name = name;
    }
//public void setName(String name) {
//    while (true) {
//        System.out.println("Введите имя животного");
//        String nameStr = scanner.next();
//
//        if (numberValidator.isNumber(nameStr, Pattern.compile("^[а-яА-Я]+$"))) {
//
//            animal.setName(nameStr);
//            break;
//        }
//        System.out.println("Вы ввели неверный имя животного");
//    }
//}

    public String getName() {
        return name;
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

//        return "Привет!" +
//                " меня зовут " + name +
//                ", мой вес " + "- " +  weight + " кг" +
//                ", мой цвет " + "- " + color +
//                ", мой возраст " + age + " года";
//    }


//        System.out.println("Привет! меня зовут" + " " + animal1.getName() + ", мне " + animal1.getAge() + " лет"
//                + ", мой цвет " + animal1.getColor() + ", я вешу " + animal1.getWeight() + " кг");