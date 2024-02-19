package _05_class._05_inheritance;

public class AnimalEx {
    public static void main(String[] args) {
        Cat cat1 = new Cat ("고양이","나비",7);
        System.out.println(cat1.species + " " + cat1.name + "는 " + cat1.age + "살 입니다.");
        cat1.makeSound();

        System.out.println("==============================================");

        Dog dog1 = new Dog ("강아지","알렉스",8);
        System.out.println(dog1.species + " " + dog1.name + "는 " + dog1.age + "살 입니다.");
        dog1.makeSound();
    }
}
