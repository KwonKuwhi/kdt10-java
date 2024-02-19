package _05_class._06_abstract;


// 구체적인 클래스
public class Square extends Shape {
    double width;
    double height;

    public Square(String color, String type, double width, double height){
        super(color, "Square");
        this.width = width;
        this.height = height;
    }

    // 추상 메소드 구현
    void draw(){
        System.out.println("사각형 그리기!");
    }

    double calculateArea(){
        return width * height;
    }
}

