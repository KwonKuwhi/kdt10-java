package _05_class._05_inheritance;

public class Cat extends Animal{
    public  Cat(String species, String name, int age){
        super("고양이",name,age);

        
        
    }
    @Override
    public void makeSound(){
        System.out.println("야용");
    }


    
}