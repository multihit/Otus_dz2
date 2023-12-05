import animals.Animal;
import animals.birds.IFlying;
import enumData.AnimalData;
import enumData.CommandsData;
import factory.AnimalFactory;
import validators.DataValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();
        AnimalFactory animalFactory = new AnimalFactory();
        DataValidator commandValidator = new DataValidator();


        while (true) {
            System.out.println("Введите комманду add/list/exit");
            String commandStr = scanner.next().toUpperCase().trim();

            if (!commandValidator.isValidate(commandStr, CommandsData.values())) {
                System.out.println("Вы ввели не верную комманду");
                continue;
            }
            CommandsData commandsData = CommandsData.valueOf(commandStr);


            switch (commandsData) {
                case ADD:

                    String animalTypeStr;
                    while (true) {
                        System.out.println("Введите тип животного: cat/dog/duck");
                        animalTypeStr = scanner.next().toUpperCase().trim();

                        if (commandValidator.isValidate(animalTypeStr, AnimalData.values())) {
                            break;
                        }
                        System.out.println("Вы ввели неверный тип животного");
                    }

                    Animal animal = animalFactory.create(AnimalData.valueOf(animalTypeStr));


                    System.out.println("Введите имя животного");
                    animal.setName(scanner);

                    System.out.println("Введите возраст животного");
                    animal.setAge(scanner);

                    System.out.println("Введите вес животного");
                    animal.setWeight(scanner);

                    System.out.println("Введите цвет животного");
                    animal.setColor(scanner);

                    animal.say();
                    animal.go();
                    animal.drink();
                    animal.eat();
                    animalList.add(animal);
                    if (animal instanceof IFlying) {
                        ((IFlying) animal).fly();
                    }
                    break;


                case LIST:
                    if (animalList.isEmpty()) {
                        System.out.println("Список пустой");
                        continue;
                    }
                    for (Animal animalObj : animalList) {
                        System.out.println(animalObj.toString());
                    }
                    break;

                case EXIT:
                    System.exit(0);
            }
        }
    }
}
