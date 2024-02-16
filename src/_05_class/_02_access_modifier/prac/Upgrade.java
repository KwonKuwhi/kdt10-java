package _05_class._02_access_modifier.prac;

import java.util.ArrayList;
import java.util.Scanner;

public class Upgrade {


    public static void main(String[] args) {
        ArrayList<Rectangle> rect = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int width  = 1;
        while (true){
            if(width!=0){

            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            width = sc.nextInt();
            int height = sc.nextInt();
            rect.add(new Rectangle(width,height));

        }else{
                for (int i = 0; i < rect.size()-1 ; i++) {
                    System.out.println("===================");
                    System.out.println("가로 길이는 : " + rect.get(i).getWidth());
                    System.out.println("세로 길이는 : " + rect.get(i).getHeight());
                    System.out.println("넓이 : " + rect.get(i).area(rect.get(i).getWidth(),rect.get(i).getHeight()));

                }
                break;
            }

        }

    }

}

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public  int area(int width, int height){
        return width * height;

    }
}
