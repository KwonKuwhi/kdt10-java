package _08_collection._set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetPrac {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        System.out.println("정수를 입력하세요 -1을 입력하면 종료됩니다.");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("정수 입력 : ");
            int num = sc.nextInt();
            if(num == -1){
                break;
            }else{
                set1.add(num);
            }
            sc.close();


        }
        System.out.println(set1);

    }
}
