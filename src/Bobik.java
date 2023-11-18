public class Bobik {
    private String name;
    private int weight;
    private String color;
    private int age;

//   public Bobik(String name, int weight, String color, int age) {
//
//        this.name = name;
//        this.color = color;
//        this.age = age;
//    }

    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = weight;
        }

   }

    public String getName() {
        return name;
    }
//
//    public float getWeight() {
//        return 15;
//    }

    //    public void setWeight(int newWeight) {
//        if (newWeight < 1) {
//            this.weight = 5;
//        } else {
//            this.weight = newWeight;
//
//        }
//    }
    public int  getAge(){
        return age;
    }
    public void getInfo2() {

        print("мой возраст равен: " + getAge());
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Переданное значение age " + age + " не может быть отрицательным!");
        }

    }

    public String getColor() {
        return " - черный";
    }

//    void getInfo() {
//        System.out.println("name:" + name + ", " + "weight:" + weight + ", " + "color:" + color + ", " + "age:" + age);
//    }

    //методы
    private void print(String str) {
        System.out.println(str);
    }
    public void getInfo(){
        print("Привет! меня зовут" + getName() + " " +getAge());
    }
    public void say() {
        System.out.println("я говорю");
    }

    public void go() {
        System.out.println("я иду");
    }


    public void drink() {
        System.out.println("я пью");
    }

    public void eat() {
        System.out.println("я ем");
    }


    public void setName(String name) {
        if (name != null && !name.equals("")) {// если переданное имя не пустое и не null
            this.name = name;
        } else {
            System.out.println("Переданное значение name '" + name + "' не может быть пустым!");
        }
    }

    @Override
    public String toString() {
        return "Bobik{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
