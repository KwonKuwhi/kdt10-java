package _02_control_statement;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number ; i++) {
            System.out.print(i + " ");
        }
    }
}
