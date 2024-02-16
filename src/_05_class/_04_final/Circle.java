package _05_class._04_final;

import java.util.Scanner;

public class Circle {

    public  static final double PI = 3.141592;
    public final double radius;

    public  Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        System.out.println("원의 반지름을 입력하세요");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        //Circle 객체 생성
        Circle circle = new Circle(radius);

        System.out.println("원의 반지름 : " + circle.radius);
        System.out.println("원의 넓이 : " + circle.calculateArea() );
        sc.close();

    }

}
