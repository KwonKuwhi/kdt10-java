package _05_class.classPrac;
// Vehicle 추상 클래스 정의
public abstract class Vehicle {
    private String name;
    private int maxSpeed;


    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // 추상 메서드
    public abstract void move();
}
