package _03_array;

import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("5개의 정수를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            arr[i] = scanner.nextInt();

        }
        int sum =0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("평균은 " + avg);
    }
}
