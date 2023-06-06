import java.util.ArrayList;
import java.util.Random;

//Допустим, в программе есть класс Кот. У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём
//        пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет
//        кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду:
//
//public class Cat {
//    private String name;
//    private int appetite;
//    public Cat(String name, int appetite) {
//        this.name = name;
//        this.appetite = appetite;
//    }
//    public void eat() { }
//}
//    Чтобы можно было хранить еду, создадим класс Тарелка с полем food (еда измеряется в целых
//        числах и не важно, что это за единицы измерения). При создании тарелки мы можем указать
//        начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль
//        информацию о тарелке.
//
//public class Plate {
//    private int food;
//    public Plate(int food) {
//        this.food = food;
//    }
//    public void info() {
//        System.out.println("plate: " + food);
//    }
//}
//    Если в методе main() создать объекты этих классов, то можно узнать информацию о тарелке и
//    вызвать пустой метод eat() у кота. Эти объекты пока никак не могут взаимодействовать между собой.
//        Можно добавить в классы геттеры и сеттеры и получить код вроде.
//
//public class MainClass {
//    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", 5);
//        Plate plate = new Plate(100);
//        plate.info();
//        cat.eat();
//        plate.setFood(plate.getFood() - cat.getAppetite());
//    }
//}
//ЗАДАНИЕ
//
//        Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
//        Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
//        Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
//        Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
//        Достаточно выполнить первые 2 подпункта задачи.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat cat = new Cat("Barsik", 20);
        Plate plate = new Plate(150);
        plate.info();
        cat.eat(plate);
        plate.setFood(plate.getFood() - cat.getAppetite());
        System.out.println(cat.getSatiety(plate));
        //3 задание
        Random random = new Random();
        String [] catArraySimple = {"Murzik", "Pushok", "Murka", "Simba", "Tom", "Snezhok", "Tema", "Vasya"};
        System.out.println(catArraySimple.length);
        ArrayList <Cat> catArray = new ArrayList<Cat>();
        for (int i = 0; i < catArraySimple.length; i++) {
            catArray.add(new Cat(catArraySimple[i], random.nextInt(15,21)));
        }
        System.out.println(catArray.toString());
        for (int i = 0; i < catArray.size(); i++) {
            catArray.get(i).eat(plate);
        }
        System.out.println(catArray.toString());
        //4е задание
        System.out.println(plate.getFood());
        plate.addFood(20);
        System.out.println(plate.getFood());
    }
}