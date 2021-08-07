package ru.site.start.lesson30;

import java.util.ArrayList;
import java.util.List;

public class Start2 {

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



        CheckByParameterNameLength checkByParameterNameLength = new CheckByParameterNameLength();
        findStudentsByParameter(listStudents, checkByParameterNameLength);
        CheckByParameterAgeMore checkByParameterAgeMore = new CheckByParameterAgeMore();
        findStudentsByParameter(listStudents, checkByParameterAgeMore);



    }

    public static void findStudentsByParameter(List<Student> listStudents, CheckByParameter check) {
        for(Student student : listStudents) {
            if(check.check(student)) {
                System.out.println(student);
            }
        }
    }

}

interface CheckByParameter {

    boolean check(Student student);

}

class CheckByParameterNameLength implements CheckByParameter {

    @Override
    public boolean check(Student student) {
        return student.getName().length() < 5;
    }

}

class CheckByParameterAgeMore implements CheckByParameter {

    @Override
    public boolean check(Student student) {
        return student.getAge() > 20;
    }

}
