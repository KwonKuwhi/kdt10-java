package _02_control_statement;

import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        System.out.println("덧셈 결과 : "+ add(n1,n2));
        System.out.println("뺠셈 결과 : "+ sub(n1,n2));
        System.out.println("나눗셈 결과 : "+ div(n1,n2));
        System.out.println("곱셈 결과 : "+ mul(n1,n2));

    }
    public static double add (double a, double b){
        return a + b;
    }
    public static double sub (double a, double b){
        return a - b;
    }
    public static double mul (double a, double b){
        return a * b;
    }
    public static double div (double a, double b){
        return a / b;
    }
}
