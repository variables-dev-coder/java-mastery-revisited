package day04_ObjectOrientedProgramming;


public class Teacher {
    String name = "John";
}

class Student {
    Teacher teacher;

    Student(Teacher teacher) {
        this.teacher = teacher;
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student(t);
        System.out.println(s.teacher.name);  // John
    }
}
