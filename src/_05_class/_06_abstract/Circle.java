package _05_class._06_abstract;

// 구체적인 클래스
public  class Circle extends Shape {


    double radius;
    public static  final  double PI= 3.141592;
    public Circle(String color,  double radius){
        super(color, "Circle");
        this.radius = radius;
    }
    
    // 추상 메소드 구현
    void draw(){
        System.out.println("원 그리기!");
    }
    double calculateArea (){
        return radius * radius * PI;
    }
}
