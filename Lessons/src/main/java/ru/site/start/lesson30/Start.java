package ru.site.start.lesson30;

import java.util.ArrayList;
import java.util.List;

import static ru.site.start.lesson30.Student.*;

public class Start {

    public static void main(String[] args) {

        Student student1 = new Student("Олег", 20, 'М', 5.0);
        Student student2 = new Student("Виталий", 21, 'М', 3.5);
        Student student3 = new Student("Михаил", 19, 'М', 4.2);
        Student student4 = new Student("Артем", 18, 'М', 4.5);
        Student student5 = new Student("Григорий", 20, 'М', 4.6);
        Student student6 = new Student("Полина", 22, 'Ж', 3.8);
        Student student7 = new Student("Мария", 21, 'Ж', 3.1);
        Student student8 = new Student("Алена", 20, 'Ж', 4.2);

        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        listStudents.add(student5);
        listStudents.add(student6);
        listStudents.add(student7);
        listStudents.add(student8);

        filterStudentsByAgeEqual(listStudents, 20);
        System.out.println("------------");
        filterStudentsByAgeMore(listStudents, 20);
        System.out.println("------------");
        filterStudentsByAgeLess(listStudents, 20);

        Info info = new Info();
        info.message("Текстовое сообщение");

    }

}

class Student {

    private String name;
    private int age;
    private char sex;
    private double grade;

    public Student(String name, int age, char sex, double grade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\n" + name + " - " + age + " - " + sex + " - " + grade;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    char getSex() {
        return sex;
    }

    double getGrade() {
        return grade;
    }

    public static void filterStudentsByAgeEqual(List<Student> listStudents, int age) {
        for(Student student : listStudents) {
            if(student.getAge() == age) {
                System.out.println(student);
            }
        }
    }

    public static void filterStudentsByAgeMore(List<Student> listStudents, int age) {
        for(Student student : listStudents) {
            if(student.getAge() > age) {
                System.out.println(student);
            }
        }
    }

    public static void filterStudentsByAgeLess(List<Student> listStudents, int age) {
        for(Student student : listStudents) {
            if(student.getAge() < age) {
                System.out.println(student);
            }
        }
    }

}

class Info {

    public String message(String text) {
        System.out.println(text);
        return text;
    }

}