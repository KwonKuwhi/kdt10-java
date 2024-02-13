package _02_control_statement;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >=1 ){
            if(age<=7){
                System.out.println("유아");
            } else if (age<=13) {
                System.out.println("초등학생");
            } else if (age <=16) {
                System.out.println("중학생");
            } else if (age <=19){
                System.out.println("고등학생");
            }else{
                System.out.println("성인");
            }
        }else{
            System.out.println("정확한 나이를 입력해주세요");
        }
    }
}
