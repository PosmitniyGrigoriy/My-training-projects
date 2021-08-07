package ru.site.back.section6;

public class Student {

    private String name;
    private int age;
    private char sex;
    private int course;
    private char grade;

    public Student(String name, int age, char sex, int course, char grade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\nИмя: " + name + ". Возраст: " + age + ". Пол: " + sex + ". Курс: " + course + ". Оценка: " + grade;
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

    int getCourse() {
        return course;
    }

    char getGrade() {
        return grade;
    }

}
