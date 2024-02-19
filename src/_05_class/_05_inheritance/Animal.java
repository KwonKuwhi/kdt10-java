package _05_class._05_inheritance;

public class Animal {
    // Amiaml 이라는 클래스 제작
    // 조건1 - "종", "이름", "나이"를 의미하는 변수를 가지로 있어야 한다.
    // 조건2 - makeSound라는 메소드를 가지고 있어야 한다.
    // 조건3 - makeSound라는 메소드는 "동물은 소리를 낸다" 라는 문자열 출력

    public String species;
    public String name;
    public int age;

    public Animal(String species, String name, int age){
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("동물은 소리를 낸다");
    }
}
