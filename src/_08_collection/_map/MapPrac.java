package _08_collection._map;

import java.util.*;

public class MapPrac {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.print("이름을 입력하세요 : ");
            String name = sc.next();
            if(name.equals("종료")){
                break;
            }else{
                System.out.print("나이를 입력하세요 : ");
                int age = sc.nextInt();
                map.put(name, age);
            }
        }
        sc.close();

        System.out.println("==========입력받은 이름과 나이 목록=========");
        Set<Map.Entry<String, Integer>> entrySet =  map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator =entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.printf("이름 : %s , 나이 : %d %n", name,age);
        }

    }
}
