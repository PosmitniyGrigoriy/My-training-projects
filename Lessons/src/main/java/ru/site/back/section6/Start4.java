package ru.site.back.section6;

// Интерфейс Function<T, R>

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Start4 {

    public static void main(String[] args) {

        Student student1 = new Student("Олег", 20, 'М', 4, 'A');
        Student student2 = new Student("Максим", 22, 'М', 5, 'F');
        Student student3 = new Student("Виктор", 21, 'М', 4, 'C');
        Student student4 = new Student("Мария", 22, 'Ж', 5, 'B');
        Student student5 = new Student("Виктория", 21, 'Ж', 4, 'A');
        Student student6 = new Student("Игорь", 18, 'М', 1, 'B');

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        Function<Student, Integer> f = student -> student.getAge();
        int result = avgOfGrade(students, f);
        System.out.println(result);

    }

    private static int avgOfGrade(List<Student> listStudents, Function<Student, Integer> f) {
        int result = 0;
        for(Student st : listStudents) {
            result += f.apply(st);
        }
        result = result / listStudents.size();
        return result;
    }

}
