import animals.Animal;
import enumData.CommandsData;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();

        while (true) {
            System.out.println("Введите комманду add/list/exit");
            String commandStr = scanner.next().toUpperCase().trim();

            boolean isCommandExist = false;
            for (CommandsData commandsData : CommandsData.values()) {
                if (commandsData.name().equals(commandStr)) {
                    isCommandExist = true;
                    break;
                }
            }

            if (!isCommandExist) {
                System.out.println("Вы ввели не верную комманду");
                continue;
            }
            CommandsData commandsData = CommandsData.valueOf(commandStr);


            switch (commandsData) {
                case ADD:

                case LIST:
                    for (Animal animal : animalList) {
                        System.out.println(animal.toString());
                    }
                case EXIT:
                    System.exit(0);
            }
        }


//        Cat cat1 = new Cat();
//        Dog dog1 = new Dog();
//        Duck duck1 = new Duck();
//
//
//        dog1.setName("Бобик");
//        dog1.setAge(9);
//        dog1.setWeight(5);
//        dog1.setColor("черный");
//        cat1.setColor("белый");
//
//
//        dog1.drink();
//        dog1.eat();
//        dog1.go();
//        duck1.fly();
//
//        cat1.say();
//        duck1.say();
//        dog1.say();

//        animal1.getInfo();
//        System.out.println(Dog.toString());
//        System.out.println(cat1.toString());
//        animal1.getInfo();
//        animal1.setWeight(-1);


//        System.out.println("Привет! меня зовут" + " " + animal1.getName() + ", мне " + animal1.getAge() + " лет"
//                + ", мой цвет " + animal1.getColor() + ", я вешу " + animal1.getWeight() + " кг");


    }
}
