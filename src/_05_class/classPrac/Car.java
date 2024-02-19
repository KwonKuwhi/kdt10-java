package _05_class.classPrac;

//Car 클래스 Vehicle 상속 받음
public class Car extends Vehicle{
    public  Car(String name, int maxSpeed){
            super(name, maxSpeed);
}
    public void move(){
        System.out.println(getName() + "이(가) 도로를 따라 이동중");
    }
}
