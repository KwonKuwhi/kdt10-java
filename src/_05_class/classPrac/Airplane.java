package _05_class.classPrac;

public class Airplane extends Vehicle implements Flyable{
    public Airplane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    // fly 메서드 구현 (Flyable 인터페이스에서 온 메서드)
    @Override
    public  void fly(){
        System.out.println(getName() + "이(가) 고도 10000 피트에서 비행중"); 
    }
    // move 메서드 구현 (Vehicle 추상 클래스에서 온 메서드)
    @Override
    public void move() {
        System.out.println(getName() + "이(가) 하늘을 날아가는 중");
    }
}
