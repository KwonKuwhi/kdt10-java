package _05_class._01_class;

import java.util.Scanner;

public class Prac_class {
    public int width;
    public int height;
    public   Prac_class(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int testMethod2(int width, int height) {
        return width*height;
    }

    public static void main(String[] args) {
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        Prac_class test2 = new Prac_class(width, height);
        System.out.println(test2.testMethod2(width,height));



    }
}
