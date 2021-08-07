package ru.site.start.lesson30;

import java.util.ArrayList;
import java.util.List;

public class Start3 {

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

        findStudentsByParameter2(listStudents, student -> student.getAge() > 20);
        findStudentsByParameter2(listStudents, student -> student.getName().length() < 5);

    }

    public static void findStudentsByParameter2(List<Student> listStudents, CheckByParameter2 check) {
        for(Student student : listStudents) {
            if(check.check(student)) {
                System.out.println(student);
            }
        }
    }

}

interface CheckByParameter2 {

    boolean check(Student student);

}

// Использование лябмд позволяет не создавать класс, который будет имплементировать интерфейс и там не нужно будет переопределять метод. В параметрах метода, где ранее был указана переменная, имплементирущего класса, вместо нее теперь написана лямдба. Она переопределяет абстрактный метод интерфейса, и код становится короче.
// Чтобы лямбда работала, в интерфейсе должен быть 1 абстрактный метод. Если будет 2 абстрактных метода, то будет не ясно какой метод нужно использовать. Если будет 2 абстрактных метода: один с одним параметром, второй абстрактный метод с таким же первым параметром, а второй другой параметр какой-то, то уже лямбда не будет работать. Нужно второй абстрактный метод удалять. Работает только если есть 1 абстрактный метод. Если в теле интерфейса 1 абстрактный метод, то это называют функциональным интерфейсом.
// Когда пишется так лямбда: student -> student.getAge() > 20 (до стрелки параметры метода, справа стрелки - тело метода)
// Это значит, что метод check в интерфейсе был переопределен. Если создать класс и в нем имплементировать интерфейс, то переопределение метода будет таким:
//class test implements CheckByParameter2 {
//
//    @Override
//    public boolean check(Student student) {
//        return student.getAge() > 20;
//    }
//}

// Если абстрактный метод ничего не принимает на вход, то при создании ламбда писать () -> и далее что должен вернуть абстрактный метод
