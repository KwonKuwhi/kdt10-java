package _05_class._06_abstract;

public class StudentEx {

    public static void main(String[] args) {
        Kim kim = new Kim("김사랑","사랑고등학교",17,10703);
        Baek baek = new Baek("백종구","종구고등학교",18,20202);


        System.out.println("=========학생 1 ===========");
        System.out.println("이름 : " + kim.getName());
        System.out.println("학교 : " + kim.getSchool());
        System.out.println("나이 : " + kim.getAge());
        System.out.println("학번 : " + kim.getStudentNumber());
        kim.todo();


        System.out.println("=========학생 2 ===========");
        System.out.println("이름 : " + baek.getName());
        System.out.println("학교 : " + baek.getSchool());
        System.out.println("나이 : " + baek.getAge());
        System.out.println("학번 : " + baek.getStudentNumber());
        baek.todo();

    }
}
