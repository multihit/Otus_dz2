public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Duck duck1 = new Duck();
        Bobik bobik1 = new Bobik();

        bobik1.setName(" Boikas");
        bobik1.setAge(23);

        bobik1.say();
        bobik1.drink();
        bobik1.eat();
        bobik1.go();
        bobik1.getInfo();
        System.out.println(bobik1.toString( ));
        bobik1.getInfo2();
//        bobik1.getInfo();
//        bobik1.setWeight(-1);





//        System.out.println("Привет! меня зовут" + " " + bobik1.getName() + ", мне " + bobik1.getAge() + " лет"
//                + ", мой цвет " + bobik1.getColor() + ", я вешу " + bobik1.getWeight() + " кг");


    }
}
