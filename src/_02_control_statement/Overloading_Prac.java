package _02_control_statement;

public class Overloading_Prac {
    public static void main(String[] args) {
        Overloading_Prac prac = new Overloading_Prac();
        System.out.println("반지름이 7인 원의 넓이: " + prac.area(7) );
        System.out.println("가로 3, 세로 10인 직사각형의 넓이: "+ prac.area(3.0,10.0));
        System.out.println("밑변 4, 세로 7인 삼각형의 넓이: "+ prac.area(4,7));
    }

    public double area(double radius){
        return radius * radius * 3.14;
    }

    public  double area(double width, double height){
        return width * height;
    }

    public  double area(int base, int height){
        return base * height * 0.5;
    }
}
