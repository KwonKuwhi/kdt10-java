package _05_class._06_abstract;

public abstract class Student {
    private String name;
    private String school;
    private int age;
    private int studentNumber;

    public Student(String name, String school, int age, int studentNumber){
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    abstract  void todo();

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
}
