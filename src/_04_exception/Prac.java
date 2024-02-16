package _04_exception;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
//        int[] newArray = new int[4];
//        for (int i = 0; i < newArray.length ; i++) {
//            newArray[i] = i+1;
//        }
//
//        try{
//            for (int i = 0; i <= 5 ; i++) {
//                System.out.println(newArray[i]);
//            }
//        } catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("인덱스가 범위를 벗어났습니다.");
//        }


//        System.out.println("배열 크기를 입력하세요");
//        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        if (size <= 0){
//            throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
//        }
//        int[] newArray2 = new int[size];
//        int sum = 0;
//        double avg =0;
//        try{
//            for (int i = 0; i < newArray2.length; i++) {
//                sum += newArray2[i];
//            }
//            avg = sum / newArray2.length;
//            System.out.println("배열 요소의 평균 : " + avg);
//        } catch (InputMismatchException e){
//            System.out.println("정수로만 입력해주세요");
//        }
//        catch (ArithmeticException e){
//            System.out.println("배열 크기는 0보다 큰 정수로 입력해주세요");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("배열의 크기를 입력해주세요");
        ArrayList<Integer> numbers = new ArrayList<>();
        try{
            int size = scanner.nextInt();
            for (int i = 1; i <= size; i++) {
                System.out.print("정수"+i+" :") ;
                numbers.add(scanner.nextInt());
            }

            HashSet<Integer> hs = new HashSet<>();
            for (int el :  numbers) {
                if ( numbers.indexOf(el) !=  numbers.lastIndexOf(el)) {
                    hs.add(el);
                }
            }
            System.out.println("중복 숫자 = " + hs);

        }catch (InputMismatchException e){
            System.out.println("정수로만 입력해주세요");
        }finally {
            scanner.close();
        }


        //////////////////////////////
        // 3번 해설
        // 중복된 요소를 찾는 메소드
//        public static ArrayList<Integer> findDuplicates(int[] arr){
//            ArrayList<Integer> duplicates = new ArrayList<>();
//            // ex. arr: [1,2,3,2,1]
//            // index
//            // 0에 대해서 1,2,3,4 => i = 0, j =1 ~ length - 1;
//            // 1에 대해서 2,3,4 중복 확인
//            // 2에 대해서 3,4
//            // 3에 대해서 4
//            for (int i = 0; i < arr.length - 1; i++){
//                for (int j = i + 1; j < arr.length  ;j++){
//                    if(arr[i] == arr[j] && !duplicates.contains(arr[i])){
//                        // 중복된 요소가 한번만 추가되도록
//                        duplicates.add(arr[i]);
//                    }
//                }
//            }
//            System.out.println("duplicates >" + duplicates);
//            return duplicates;
//        }









    }
}
