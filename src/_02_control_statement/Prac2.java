package _02_control_statement;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        System.out.println("이름을 입력하세요");
        Scanner scanner =  new Scanner(System.in);
        String name = scanner.next();
        switch (name){
            case "이몽룡" :
                System.out.println("남자");
                break;
            case "성춘향" :
                System.out.println("여자");
                break;
            default:
                System.out.println("모르겠어요");
                break;

        }
    }
}
