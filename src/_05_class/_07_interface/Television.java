package _05_class._07_interface;

public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV turn on");
    }

    @Override
    public void turnOff(){
        System.out.println("TV turn off");
    }
}
