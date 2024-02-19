package _05_class._06_abstract;

import java.util.ArrayList;

public class ShpaeEx {
    public static void main(String[] args) {
        // Shape 객체는 new 연산자로 직접 생성할 수 없지만,
        // 자식 클래스인 Circle, Square 에서 new 연산자로 객체 생성 가능
//        Shape shape = new Shape() {}; X

        ArrayList<Shape> shapeList = new ArrayList<>();

        Circle circle = new Circle("blue", 4);
        Square square = new Square("red" , "Square", 3,15);

        shapeList.add(circle);
        shapeList.add(square);

        for (Shape shape : shapeList) {
            System.out.println("========" + shape.getType() + "도형의 정보" + "=======");
            System.out.println("도형의 색상 :  " + shape.getColor());
            System.out.println("도형의 넓이 :  " + shape.calculateArea());
        }


    }
}
