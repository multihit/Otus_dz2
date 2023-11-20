public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Duck duck1 = new Duck();


        dog1.setName("Бобик");
        dog1.setAge(2);
        dog1.setWeight(5);
        dog1.setColor("черный");


        dog1.drink();
        dog1.eat();
        dog1.go();

        cat1.say();
        duck1.say();
        dog1.say();

//        animal1.getInfo();
        System.out.println(dog1.toString());
//        animal1.getInfo();
//        animal1.setWeight(-1);


//        System.out.println("Привет! меня зовут" + " " + animal1.getName() + ", мне " + animal1.getAge() + " лет"
//                + ", мой цвет " + animal1.getColor() + ", я вешу " + animal1.getWeight() + " кг");


    }
}
