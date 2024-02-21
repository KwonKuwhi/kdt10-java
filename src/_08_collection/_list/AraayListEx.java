package _08_collection._list;

import java.util.ArrayList;
import java.util.List;

public class AraayListEx {
    public static void main(String[] args) {

        // AraayList 컬렉션 생성
        List<Book> list = new ArrayList<>();

        //객체 추가
        list.add(new Book("제목1","지은이1"));
        list.add(new Book("제목2","지은이2"));
        System.out.println(list);
        // 리스트 개수 엳기
        System.out.printf(" 총 %d 권의 책이 존재합니다. %n%n",list.size());

        //특정 인덱스 객체 가져오기
        System.out.println(list.get(2));

        //인덱스로 특정 객체 삭제
        list.remove(2);

        //반목문으로 모든 객체 하나씩 가져오기
        for(Book b : list){
            System.out.println(b);
        }

        // 모든 객체 삭제
        System.out.println("객체가 비어있나요?" + list.isEmpty());
        list.clear();
        System.out.println("객체가 비어있나요?" + list.isEmpty());
    }
}
