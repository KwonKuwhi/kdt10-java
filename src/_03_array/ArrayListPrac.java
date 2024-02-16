package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while(!isExit){
            System.out.println("문자를 입력해주세요");
            String userInput = scanner.nextLine();
            if (userInput.equals("exit")){
                isExit = true;
               for(String n : arrayList){
                   System.out.println(n);
               }
            }else{
                arrayList.add(userInput);
            }
        }

        scanner.close();
    }
}


