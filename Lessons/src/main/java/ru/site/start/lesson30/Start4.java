package ru.site.start.lesson30;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Start4 {

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

        findStudentsByParameter2(listStudents, student -> student.getAge() > 21);
        findStudentsByParameter2(listStudents, student -> student.getName().length() < 5);

    }

    public static void findStudentsByParameter2(List<Student> listStudents, Predicate<Student> check) { // Тип данных должен быть одинаковый для 1 и 2 параметров.
        for(Student student : listStudents) {
            if(check.test(student)) { // У интерфейса предикейт есть метод тест. На вход объект, на выход булиэн, если тру, то выводит, абстрактный метод подходит для этого задания. Также чуть выше в параметрах метода указан предикейт и в дженерика класс студент. если там указать стрин, а в параметры метода студента, то будет стри и стунеднт и ошибка, что типы разные. нужно чтобы и там и там был один тип.
                System.out.println(student);
            }
        }
    }

}

// Интерфейсы находятся в пэкэджэ: import java.util.function.*;

// public interface Predicate<T { // На первой строке указываем тип данных, и он сам подставиится в параметры абстрактного метода
// boolean test(T t);
// }

// Для List добавлен метод removeIf. В параметрах этого метода используется Predicate<T>.
// listStudents.removeIf(st -> st.getName().endsWith("а")); // Удалит из коллекции студентов, у которых имена заканчиваются на а.

// Если создан интерфейс и там 1 абстрактный метод, то это фнкциональный интерфейс. но там может быть сколько-то угодно дэфалтных и стэтик методов. Если по-прежнему в интерфейсе 1 абстрактный метод, хоть есть и дэфалтные методы, то этот интерфейс и метод по-прежнему называется функциональным.

// Метод removeIf() - в параметры писать предикейт (лямбда - выражение). Или сразу лямбда писать или сохранить лябмда в переенную и переменную указывать.

