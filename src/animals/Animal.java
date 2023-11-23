package animals;

public abstract class Animal {
    private String name;
    private int weight;
    private String color;
    private int age;


    //методы
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Переданное значение age " + age + " не может быть отрицательным!");
        }
    }


    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
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

    private void print(String str) {
        System.out.println(str);
    }

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


    public void setName(String name) {
        if (name != null && !name.equals("")) {         // если переданное имя не пустое и не null
            this.name = name;
        } else {
            System.out.println("Переданное значение name '" + name + "' не может быть пустым!");
        }
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